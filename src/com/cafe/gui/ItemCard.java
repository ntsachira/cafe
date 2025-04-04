package com.cafe.gui;

import com.cafe.model.Tabs;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ItemCard extends javax.swing.JPanel {

    private SalesChannel salesChannel;
    private PurchaseOrder purchaseOrder;

    private String itemName;
    private int id;
    private double price;
    private double discount;
    private String brand;
    private String unitOfMeasureId;

    private double quantity;
    private PurchaseOrder.ItemType itemType;

    public String getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(String unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public PurchaseOrder.ItemType getItemType() {
        return itemType;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setItemType(PurchaseOrder.ItemType itemType) {
        this.itemType = itemType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage(String path) throws IOException {
        if (!path.isBlank()) {
            File file = new File(path);
            if(file.exists()){                
                jImagePanel1.setImageIcon(new ImageIcon(ImageIO.read(file)));
            }else{
                jImagePanel1.setImageIcon(new ImageIcon(getClass().getResource("/com/cafe/itemImg/emptyItem.png")));
            }
            
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        jLabel3.setText("<html><center><p>" + itemName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return Double.parseDouble(jLabel2.getText().split(" ")[1].trim());
    }

    public void setPrice(double price) {
        this.price = price;
        jLabel2.setText("Rs. " + String.valueOf(price));
    }

    public void setSalesChannel(SalesChannel salesChannel) {
        this.salesChannel = salesChannel;
    }

    public void setSoldQuantity(int qty) {
        jLabel1.setText(" " + String.valueOf(qty) + " Sold");
    }

    /**
     * Creates new form Box
     */
    public ItemCard() {
        initComponents();
        this.putClientProperty(FlatClientProperties.STYLE, "arc:50");
        jImagePanel1.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jImagePanel1 = new main.JImagePanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(168, 32767));
        setMinimumSize(new java.awt.Dimension(0, 200));
        setPreferredSize(new java.awt.Dimension(168, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>\n<p style=\"text-align: center\">Extra Chicken and cheese  Burger</p>\n</html>");
        add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(154, 100));

        jImagePanel1.setCenterImage(true);
        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageHeight(jImagePanel1.getHeight());
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/itemImg/emptyItem.png"))); // NOI18N
        jImagePanel1.setMinimumSize(new java.awt.Dimension(164, 0));
        jImagePanel1.setPreferredSize(new java.awt.Dimension(164, 90));

        javax.swing.GroupLayout jImagePanel1Layout = new javax.swing.GroupLayout(jImagePanel1);
        jImagePanel1.setLayout(jImagePanel1Layout);
        jImagePanel1Layout.setHorizontalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jImagePanel1Layout.setVerticalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jImagePanel1);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(144, 22));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Rs. 620");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 5));
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(jLabel1, java.awt.BorderLayout.WEST);

        add(jPanel2, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.putClientProperty(FlatClientProperties.STYLE, "border:10,10,10,10,#4D78CC,1,50");
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.putClientProperty(FlatClientProperties.STYLE, "border:10,10,10,10,#0000,1,50");
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:        
        if (this.salesChannel != null) {
            QuantitySelector quantitySelector = new QuantitySelector(this.salesChannel.getDashboard(), true);
            quantitySelector.setSalesChannel(this.salesChannel);
            quantitySelector.setMenuItem(this);
            quantitySelector.setVisible(true);
        }
        if (this.purchaseOrder != null) {
            purchaseOrder.setSelectedItem(this);
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public void setStyleforDashboard() {
        jLabel3.setFont(new Font("Segoe UI Semibold", 0, 16));
        jLabel2.setFont(new Font("Segoe UI Semibold", 0, 16));
    }
}
