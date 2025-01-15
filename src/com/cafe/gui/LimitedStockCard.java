package com.cafe.gui;

import com.cafe.model.Mysql;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LimitedStockCard extends javax.swing.JPanel {

    enum Stock {
        KITCHEN, DIRECT_SELLING
    }
    private Dashboard dashboard;
    private int id;
    private double quantity;
    private double price;
    private String expire;
    private String itemName;
    private int menuIdl;
    private String unit;
    private boolean expired;
    private Stock stock;

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
    

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public LimitedStockCard() {
        initComponents();
        setStyle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jImagePanel1 = new main.JImagePanel();

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/299071_trashcan_trashcan.png"))); // NOI18N
        jMenuItem1.setText("Move to Damaged Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setMaximumSize(new java.awt.Dimension(32767, 110));
        setMinimumSize(new java.awt.Dimension(368, 110));
        setPreferredSize(new java.awt.Dimension(368, 110));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("P-001");
        jPanel2.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setText("Coco-Cola 1L");
        jPanel2.add(jLabel4);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("2024-5-29");
        jPanel2.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("5");
        jPanel2.add(jLabel8);

        jPanel3.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 0));
        jPanel4.setLayout(new java.awt.BorderLayout(10, 0));

        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/itemImg/emptyItem.png"))); // NOI18N
        jPanel4.add(jImagePanel1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.WEST);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            SwingUtilities.updateComponentTreeUI(jPopupMenu1);
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        addToDamagedStock();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

    private void setStyle() {
        jPanel3.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        jPanel2.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        jPanel4.putClientProperty(FlatClientProperties.STYLE, "arc:30");
    }

    public void setImage(String path) {   
            File file = new File(path);
            if(file.exists()){
                try {
                    jImagePanel1.setImageIcon(new ImageIcon(ImageIO.read(file)));
                } catch (IOException ex) {
                    Splash.logger.log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }else{
                jImagePanel1.setImageIcon(new ImageIcon(getClass().getResource("/com/cafe/itemImg/emptyItem.png")));
            }       
        
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        jLabel4.setText(itemName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        jLabel2.setText("STOCK ID - " + String.valueOf(id));
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        if (quantity < 11) {
            jLabel8.setText(String.valueOf(quantity) + " (LIMITED)");
            jLabel8.setForeground(Color.red);
        } else {
            expired = true;
            jLabel8.setText(String.valueOf(quantity));
        }
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
        try {
            Date expireDate = new SimpleDateFormat("yyyy-MM-dd").parse(expire);
            if (expireDate.after(new Date())) {
                if (expireDate.before(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 14)))) {
                    jLabel6.setText(expire + " (EXPIRE SOON)");
                    jLabel6.setForeground(new Color(255, 102, 0));
                } else {
                    jLabel6.setText(expire);
                }
            } else {
                jLabel6.setText(expire + " (EXPIRED)");
                jLabel6.setForeground(Color.red);
            }

        } catch (ParseException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void addToDamagedStock() {
        if (stock != null) {
            int response = JOptionPane.showConfirmDialog(this, "Do you want to add this item stock to the damaged stock", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                String damageDescription = JOptionPane.showInputDialog(this, "Enter the description of the damage(Optional)", "Damage Description");
                if (damageDescription == null || damageDescription.isBlank()) {
                    damageDescription = "Expired stock";
                }
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                switch (stock) {
                    case DIRECT_SELLING:
                        //add to damaged stock
                        Mysql.execute("INSERT INTO direct_selling_damage_stock "
                                + "(`qty`,`damage_description`,`added_date`,`updated_date`,`direct_selling_stock_id`,`damage_stock_state_id`) "
                                + "VALUES('" + quantity + "','" + damageDescription + "','" + formatter.format(new Date()) + "','" + formatter.format(new Date()) + "',"
                                + "'" + id + "',(SELECT id FROM damage_stock_state WHERE damage_stock_state.name = 'Seperated'))");
                        //update status of direct stock an inactive
                        Mysql.execute("UPDATE direct_selling_stock SET active_state_state_id = (SELECT state_id FROM active_state WHERE status = 'Inactive') "
                                + "WHERE id = '" + id + "'");
                        
                        if(dashboard != null){
                            dashboard.setSuccessStatus("Stock added to Damaged stock successfully");
                            dashboard.refreshDashboardContent();
                        }
                        break;
                    case KITCHEN:
                        Mysql.execute("SELECT * FROM kitchen_stock");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Could not perform the operation");
        }
    }
}
