/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.cafe.gui;

import static com.cafe.gui.Dashboard.alignFrame;
import com.cafe.model.Mysql;
import com.cafe.model.User;
import com.cafe.style.NewTheme;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public class DineIn extends javax.swing.JDialog {

    private HashMap<String, Integer> tableMap = new HashMap<>();
    private SalesChannel salesChannel;
    private SalesChannel.Payment paymentMethod = SalesChannel.Payment.Cash;

    private double billTotal;
    private double totalDiscount;
    private String payment = "";
    private List<String> tableList;

    public void setBillTotal(double billTotal) {
        this.billTotal = billTotal;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
        jLabel5.setText(String.valueOf(totalDiscount));
    }

    public void setBalance() {
        jLabel7.setText(String.valueOf(-(billTotal - totalDiscount)));
    }

    private void setSalesChannel(SalesChannel salesChannel) {
        this.salesChannel = salesChannel;
    }

    /**
     * Creates new form DineIn
     */
    public DineIn(Frame parent, boolean modal, SalesChannel salesChannel) {
        super(parent, modal);
        initComponents();
        setSalesChannel(salesChannel);
        setStyle();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel15 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(756, 544));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(756, 544));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 30));

        jPanel2.setPreferredSize(new java.awt.Dimension(756, 130));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tables (10 Available)");
        jLabel1.setPreferredSize(new java.awt.Dimension(107, 30));
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel6.setPreferredSize(new java.awt.Dimension(500, 84));
        jPanel6.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel7.setPreferredSize(new java.awt.Dimension(500, 40));
        jPanel7.setLayout(new java.awt.BorderLayout(10, 0));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Table Type", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel7.add(jComboBox2, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Select required tables →");
        jPanel16.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList1);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel3.setPreferredSize(new java.awt.Dimension(716, 150));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel13.setPreferredSize(new java.awt.Dimension(716, 40));
        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Payment");
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton2, java.awt.BorderLayout.EAST);

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setPreferredSize(new java.awt.Dimension(72, 40));
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel13.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setPreferredSize(new java.awt.Dimension(716, 48));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Invoice");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(150, 48));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel14, java.awt.BorderLayout.PAGE_END);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("...");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(716, 110));
        jPanel4.setLayout(new java.awt.BorderLayout(30, 0));

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Cash");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(0, 90));
        jToggleButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton1ItemStateChanged(evt);
            }
        });
        jPanel8.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton2.setText("Card");
        jToggleButton2.setPreferredSize(new java.awt.Dimension(0, 90));
        jToggleButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton2ItemStateChanged(evt);
            }
        });
        jPanel8.add(jToggleButton2);

        jPanel4.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(3, 0));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("PAID AMOUNT");
        jPanel10.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("0");
        jPanel10.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setText("TOTAL DISCOUNT");
        jPanel11.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("0");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setText("BALANCE");
        jPanel12.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("0");
        jPanel12.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel12);

        jPanel4.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel4, java.awt.BorderLayout.NORTH);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Payment");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel15.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        validateAndSetPayementInput(evt);
    }//GEN-LAST:event_jButton3KeyPressed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        loadTableList();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jToggleButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton1ItemStateChanged
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            this.paymentMethod = SalesChannel.Payment.Cash;
            setBillforCashPay();
        }
    }//GEN-LAST:event_jToggleButton1ItemStateChanged

    private void jToggleButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton2ItemStateChanged
        // TODO add your handling code here:
        if (jToggleButton2.isSelected()) {
            this.paymentMethod = SalesChannel.Payment.Card;
            setBillforCardPay();
        }
    }//GEN-LAST:event_jToggleButton2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addPayment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        processPayment();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    private void setBillforCardPay() {
        payment = String.valueOf(this.billTotal - this.totalDiscount);
        jLabel3.setText(payment);
        jButton3.setText("");
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);
        addPayment();
    }

    private void setBillforCashPay() {
        jButton3.setEnabled(true);
        jButton2.setEnabled(true);
    }

    private void addPayment() {
        if (payment.isBlank()) {
            setWarningStatus("Warning: Enter payment amount to add");
        } else {
            jLabel3.setText(payment);
            jLabel7.setText(String.valueOf((Double.parseDouble(payment) + this.totalDiscount) - this.billTotal));
            payment = "";
            jButton3.setText("0");
        }
    }

    public void setWarningStatus(String systemStatus) {
         Toolkit.getDefaultToolkit().beep();
        jLabel9.setText(systemStatus);
        jLabel9.setForeground(Color.red);
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                jLabel9.setText("");
            } catch (InterruptedException ex) {
                Splash.logger.log(Level.SEVERE, "Thread interupption", ex);
                ex.printStackTrace();
            }
        }).start();
    }

    private void validateAndSetPayementInput(KeyEvent evt) {
        String key = String.valueOf(evt.getKeyChar());
        if (key.matches("[0-9]")) {
            payment += key;
        }

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if (payment.length() > 1) {
                payment = payment.substring(0, payment.length() - 1);
            } else {
                payment = "";
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            payment = "";
        }

        if (payment.isBlank()) {
            jButton3.setText("0");
        } else {
            jButton3.setText(payment);
        }
    }

    private void loadTableCategories() {
        try {
            ResultSet result = Mysql.execute("SELECT * FROM `table_category`");
            Vector<Object> v = new Vector<>();
            v.add("Select Table Type");
            while (result.next()) {
                v.add(result.getString("name"));
                tableMap.put(result.getString("name"), result.getInt("id"));
            }
            jComboBox2.setModel(new DefaultComboBoxModel(v));
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "Table category combo box loading", ex);
            ex.printStackTrace();
        }
    }

    private void loadTableList() {
        if (jComboBox2.getSelectedIndex() > 0) {
            try {
                String selectedItem = String.valueOf(jComboBox2.getSelectedItem());
                ResultSet result = Mysql.execute("SELECT * FROM `table` "
                        + "WHERE `table_category_id`='" + tableMap.get(selectedItem) + "' "
                        + "AND `active_state_state_id`='1' AND `table_status_id`='1' AND `id` "
                        + "NOT IN(SELECT `table_id` FROM `reservation_has_table` WHERE `table_id` NOT IN(SELECT table.id FROM `table` "
                        + "INNER JOIN reservation_has_table ON reservation_has_table.table_id = table.id "
                        + "INNER JOIN reservation ON reservation.id = reservation_has_table.reservation_id "
                        + "WHERE `date` = DATE_FORMAT(NOW(),'%Y-%m-%d') AND `time` > DATE_FORMAT(NOW() + INTERVAL 1 HOUR,'%H:%i:%s') "
                        + "OR `time` < DATE_FORMAT(NOW(),'%H:%i:%s')))");

                Vector v = new Vector();
                DefaultListModel model = new DefaultListModel();
                while (result.next()) {
                    v.add(result.getString("id"));
                }
                if (v.size() == 0) {
                    v.add("No tables available");
                }
                model.addAll(v);
                jList1.setModel(model);
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        } else {
            jList1.setModel(new DefaultListModel());
        }
    }

    private boolean saveBill() {        
        //invoice - id,date,discount,total,payment method,user mobile, customer mobile        
        String invoiceID = this.salesChannel.getUser().getMobile().substring(7) + "_" + System.currentTimeMillis();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        if (printBill(invoiceID, date)) {
            int paymentMethodId = 1;
            ResultSet result = Mysql.execute("SELECT `id` FROM `payment_method` WHERE `name` = '" + this.paymentMethod.name() + "'");
            try {
                if (result.next()) {
                    paymentMethodId = result.getInt("id");
                }

                Mysql.execute("INSERT INTO `invoice` (`id`,`date`,`discount`,`total`,`payment_method_id`,`user_mobile`,`customer_mobile`) "
                        + "VALUES('" + invoiceID + "','" + date + "','" + this.totalDiscount + "','" + this.billTotal + "','" + paymentMethodId + "',"
                        + "'" + this.salesChannel.getUser().getMobile() + "','unknown')");

                for (InvoiceItemCard item : this.salesChannel.getInvoiceItems()) {
                    if (item.getBrand().equals("Cafe")) {
                        //menu invoice item - invoice id,menu item id,quantity,discount,price | insert    
                        Mysql.execute("INSERT INTO `menu_invoice_item` (`invoice_id`,`menu_item_id`,`qty`,`discount`,`selling_price`) "
                                + "VALUES('" + invoiceID + "','" + item.getId() + "','" + item.getQuantity() + "','" + item.getDiscount() + "','" + item.getPrice() + "')");                        
                    } else {
                        try {
                            //search for stock id
                            ResultSet resultset = Mysql.execute("SELECT `id` FROM `direct_selling_stock` WHERE `menu_item_id` = '" + item.getId() + "'");
                            if (resultset.next()) {
                                //dirrect invoie item - invoice id, dirrect selling stock,quantity,price, discount | Insert   
                                Mysql.execute("INSERT INTO `direct_invoice_item` (`invoice_id`,`direct_selling_stock_id`,`qty`,`discount`,`selling_price`) "
                                        + "VALUES('" + invoiceID + "','" + resultset.getString("id") + "','" + item.getQuantity() + "','" + item.getDiscount() + "','" + item.getPrice() + "')");

                                //update stock
                                Mysql.execute("UPDATE `direct_selling_stock` SET `qty`=`qty`-'" + item.getQuantity() + "' WHERE `menu_item_id`='" + item.getId() + "'");
                            }                            
                        } catch (SQLException ex) {                            
                            Splash.logger.log(Level.SEVERE, null, ex);
                            ex.printStackTrace();
                            return false;
                        }
                    }
                }

                for (String tableId : tableList) {
                    ResultSet resultset = Mysql.execute("SELECT `id` FROM `table_status` WHERE `name`='"+SalesChannel.TableStatus.Occupied.name()+"'");
                    if(resultset.next()){
                      Mysql.execute("UPDATE `table` SET `table_status_id`='"+resultset.getString("id")+"' WHERE `id`='"+tableId+"'");  
                    }                    
                }
            } catch (SQLException ex) {                
                Splash.logger.log(Level.SEVERE, "Save invoice", ex);
                ex.printStackTrace();
                return false;
            }

        } else {
            return false;
        }
       
        return true;
    }

    private boolean printBill(String invoiceID, String date) {
        String datetime = new SimpleDateFormat("MMM d, y HH:mm:ss").format(new Date());
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        String tables = "";
        for(String table : tableList){
            tables += (table+" | ");
        }
        //parameters
        HashMap<String, Object> parameters = new HashMap<>();        
        parameters.put("invoice_id", invoiceID);
        parameters.put("tables", tables);
        parameters.put("cashier", this.salesChannel.getUser().getDisplay_name());
        parameters.put("customer", "Unknown");
        parameters.put("itemCount", this.salesChannel.getTotalItems());
        parameters.put("netTotal", formatter.format(this.billTotal));
        parameters.put("discount", formatter.format(this.totalDiscount));
        parameters.put("payable", formatter.format(this.billTotal - this.totalDiscount));
        parameters.put("paymentMethod", this.paymentMethod.name());
        parameters.put("payment", formatter.format(Double.parseDouble(jLabel3.getText())));
        parameters.put("balance", formatter.format(Double.parseDouble(jLabel3.getText()) - (this.billTotal - this.totalDiscount)));
        
          try {
            ResultSet result = Mysql.execute("SELECT * FROM `system`");
            if (result.next()) {
                parameters.put("businessName",result.getString("name"));
                parameters.put("tele",result.getString("tele"));
                parameters.put("address",result.getString("address"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        Vector<Object> datasource = new Vector<>();
        for (InvoiceItemCard item : this.salesChannel.getInvoiceItems()) {
            datasource.add(item);
        }

        try {
            URL billResource = getClass().getResource("/com/cafe/reports/cafe_dineIn_bill.jasper");
            URL kotResource = getClass().getResource("/com/cafe/reports/cafe_dineIn_kot.jasper");
            
            JasperPrint billReport = JasperFillManager.fillReport(billResource.getPath(), parameters, new JRBeanCollectionDataSource(datasource));
            JasperViewer bill = new JasperViewer(billReport, false);
            bill.setAlwaysOnTop(true);
            bill.setFitPageZoomRatio();
            alignFrame(bill, LEFT_ALIGNMENT);
            bill.setVisible(true);
            
            //KOT print
            JasperPrint kotReport = JasperFillManager.fillReport(kotResource.getPath(), parameters, new JRBeanCollectionDataSource(datasource));
            JasperViewer kot = new JasperViewer(kotReport, false);
            kot.setAlwaysOnTop(true);
            kot.setFitPageZoomRatio();
            alignFrame(kot, RIGHT_ALIGNMENT);
            kot.setVisible(true);

            
            return true;
        } catch (JRException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }
    }

    private void processPayment() {
        if (Double.parseDouble(jLabel7.getText()) >= 0) {
            tableList = jList1.getSelectedValuesList();
            if (tableList.size() > 0) {
                if (String.valueOf(tableList.get(0)).equals("No tables available")) {
                    setWarningStatus("No tables available from the selected category");
                } else {
                    if (saveBill()) {
                        this.salesChannel.getDashboard().setSuccessStatus("Bill saved successfully");
                        salesChannel.getDashboard().getUser().updateUserActivity(User.UserActivity.DINE_IN_BILL);
                    } else {
                        this.salesChannel.getDashboard().setWarningStatus("Error Saving the Bill! please contact admin");
                    }
                    this.salesChannel.resetInvoice();
                    this.dispose();
                }
            } else {
                setWarningStatus("Please select a table/s to continue");
            }
        } else {
            setWarningStatus("Low payment amount, add payment to continue");
        }
    }

    private void setStyle() {
        jToggleButton1.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        jToggleButton2.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        FlatLightLaf.setup();
        SwingUtilities.updateComponentTreeUI(this);
        salesChannel.getDashboard().setMode(salesChannel.getDashboard().getMODE());
        loadTableCategories();
    }
}
