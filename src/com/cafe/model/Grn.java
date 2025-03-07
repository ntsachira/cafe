package com.cafe.model;

import com.cafe.gui.Splash;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

public class Grn {

    private String grn_type;
    private String grnId;
    private String date;
    private String grnTotal;
    private String supplier_mobile;
    private String paid_amount;
    private String user_mobile;
    private String paymentMethodId;

    public Grn(
            String grn_type,
            String grnId,
            String date,
            String grnTotal,
            String supplier_mobile,
            String paid_amount,
            String usermobile,
            String payment_method_id
    ) {
        this.grn_type = grn_type;
        this.grnId = grnId;
        this.date = date;
        this.grnTotal = grnTotal;
        this.supplier_mobile = supplier_mobile;
        this.paid_amount = paid_amount;
        this.user_mobile = usermobile;
        this.paymentMethodId = payment_method_id;
    }

    public String getGrn_type() {
        return grn_type;
    }

    public String getGrnId() {
        return grnId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public String getDate() {
        return date;
    }

    public String getGrnTotal() {
        return grnTotal;
    }

    public String getSupplier_mobile() {
        return supplier_mobile;
    }

    public String getPaid_amount() {
        return paid_amount;
    }

    public void saveGrn() {
        //insert grn
        String grnInsertQuery = "INSERT INTO %s (`id`,`date`,`total`,`payment_method_id`,"
                + "`user_mobile`,`supplier_mobile`,`paid_amount`) "
                + "VALUES('%s','%s','%s','%s','%s','%s','%s')";

        Mysql.execute(String.format(grnInsertQuery,
                grn_type,
                grnId,
                date,
                grnTotal,
                paymentMethodId,
                user_mobile,
                supplier_mobile,
                paid_amount
        ));
    }

    public boolean saveGrnItems(ArrayList<GrnItem> itemList) {
        for (GrnItem grnItem : itemList) {
            int existStockId;
            if ((existStockId = isStockExist(grnItem)) == -1) {
                // kitchen stock
                String stockId = updateStock(grnItem);
                if (stockId != null) {
                    grnItem.setStockId(Integer.parseInt(stockId));
                    Mysql.execute(getInsertGrnItemQuery(grnItem));
                } else {                    
                    return false;
                }
            } else {
                // update stock quantity
                Mysql.execute(getUpdateStockQuantityQuery(grnItem, existStockId));
            }
        }
        return true;
    }

    private int isStockExist(GrnItem grnItem) {
        String query;
        if (grn_type.contains("kitchen")) {
            query = "SELECT * FROM kitchen_stock WHERE kitchen_item_id='%s' AND expire_date='%s'".formatted(
                    grnItem.getId(),
                    grnItem.getExpire_date()
            );
        } else {
            grnItem.setGrn_type("direct_selling");
            query = "SELECT * FROM direct_selling_stock WHERE selling_price='%s' AND expiry_date='%s' AND menu_item_id='%s'".formatted(
                    grnItem.getUnit_price(),
                    grnItem.getExpire_date(),
                    grnItem.getId()
            );
        }
        ResultSet result = Mysql.execute(query);
        try {
            if (result.next()) {
                return Integer.parseInt(result.getString("id"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return -1;
    }

    private String updateStock(GrnItem grnItem) {
        String query;
        if (grn_type.contains("kitchen")) {
            query = "INSERT INTO kitchen_stock (`qty`,`expire_date`,`kitchen_item_id`,`active_state_state_id`)"
                    + "VALUES('%s','%s','%s','%s') ".formatted(
                            grnItem.getQuantity(),
                            grnItem.getExpire_date(),
                            grnItem.getId(),
                            getActiveStateId()
                    );
        } else {
            query = "INSERT INTO direct_selling_stock (`qty`,`selling_price`,`expiry_date`,`menu_item_id`,`active_state_state_id`,`unit_of_measure_id`)"
                    + "VALUES('%s','%s','%s','%s','%s','%s')".formatted(
                            grnItem.getQuantity(),
                            grnItem.getUnit_price(),
                            grnItem.getExpire_date(),
                            grnItem.getId(),
                            getActiveStateId(),
                            getUnitOfMeasureId(grnItem.getUnit_of_measure())
                    );
            
            Mysql.execute("UPDATE `menu_item` SET `price`='"+grnItem.getUnit_price()+"' WHERE `id`='"+grnItem.getId()+"'");
        }
        Mysql.execute(query);
        ResultSet result = Mysql.execute("SELECT MAX(id) AS id FROM %s_stock ".formatted(grnItem.getGrn_type()));
        try {
            if (result.next()) {
                return result.getString("id");
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return null;
    }

    private String getUnitOfMeasureId(String unit) {
        ResultSet result = Mysql.execute("SELECT id FROM unit_of_measure WHERE name='%s'".formatted(unit));
        try {
            if (result.next()) {
                return result.getString("id");
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return null;
    }

    private String getActiveStateId() {
        ResultSet result = Mysql.execute("SELECT state_id FROM active_state WHERE status='Active'");
        try {
            if (result.next()) {
                return result.getString("state_id");
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return "1";
    }

    private String getInsertGrnItemQuery(GrnItem grnItem) {
        String query = "INSERT INTO %s_grn_item (`purchase_price`,`qty`,`%s_grn_id`,`%s_stock_id`)"
                + "VALUES('%s','%s','%s','%s')";
        String type = grn_type.substring(0, grn_type.lastIndexOf("_"));
        return String.format(query,
                type,
                type,
                type,
                grnItem.getPurchase_price(),
                grnItem.getQuantity(),
                grnId,
                grnItem.getStockId()
        );
    }

    private String getUpdateStockQuantityQuery(GrnItem grnItem, int existStockId) {
        String query = "UPDATE %s_stock SET qty=qty+'%s' WHERE id='%s'".formatted(
                grnItem.getGrn_type(),
                grnItem.getQuantity(),
                existStockId
        );
        return query;
    }

}
