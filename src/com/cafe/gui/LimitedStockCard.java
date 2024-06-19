package com.cafe.gui;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class LimitedStockCard extends javax.swing.JPanel {

    private int id;
    private double quantity;
    private double price;
    private String expire;
    private String itemName;
    private int menuIdl;
    private String unit;
    private boolean expired;

    public LimitedStockCard() {
        initComponents();
        setStyle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jImagePanel1 = new main.JImagePanel();

        setMaximumSize(new java.awt.Dimension(32767, 110));
        setMinimumSize(new java.awt.Dimension(368, 110));
        setPreferredSize(new java.awt.Dimension(368, 110));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("P-001");
        jPanel2.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void setStyle() {
        jPanel3.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        jPanel2.putClientProperty(FlatClientProperties.STYLE, "arc:30");
        jPanel4.putClientProperty(FlatClientProperties.STYLE, "arc:30");
    }

    public void setImage(String path) {
        if (!path.isBlank()) {
            jImagePanel1.setImageIcon(new ImageIcon(getClass().getResource(path)));
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
                if (expireDate.before(new Date(System.currentTimeMillis()+(1000*60*60*24*14)))) {
                    jLabel6.setText(expire + " (EXPIRE SOON)");
                    jLabel6.setForeground(new Color(255,102,0));
                }else{
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
}
