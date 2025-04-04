package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.style.CustomStyle;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import com.cafe.model.Theme;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.cafe.model.OrderType;
import com.cafe.model.User;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dell
 */
public class SalesChannel extends javax.swing.JPanel implements OrderType, Theme {

    enum Payment {
        Cash, Card
    }

    enum TableStatus {
        Available, Occupied, Reserved, Dirty
    }

    enum PreOrderStatus {
        Pending, Processing, Completed
    }

    private Dashboard dashboard;
    private int itemsPerRow = 6;

    private List<InvoiceItemCard> invoiceItems = new ArrayList<>();
    private int totalItems;
    private double billTotal;
    private double totalDiscount;

    private User user;

    public User getUser() {
        return this.dashboard.getUser();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<InvoiceItemCard> getInvoiceItems() {
        return invoiceItems;
    }

    private Order orderType = Order.TAKE_AWAY;
    private String activeCategory = "";

    public String getActiveCategory() {
        return activeCategory;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(double billTotal) {
        this.billTotal = billTotal;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public void setItemsPerRow(int itemsPerRow) {
        this.itemsPerRow = itemsPerRow;
        loadMenuItems();
    }

    public Order getOrderType() {
        return orderType;
    }

    public void setOrderType(Order orderType) {
        this.orderType = orderType;
    }

    /**
     * Creates new form SalesChannel
     */
    public SalesChannel() {
        initComponents();
        loadCategories();
        setCategory("");
        loadMenuItems();
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
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        categoryPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/299071_trashcan_trashcan.png"))); // NOI18N
        jMenuItem1.setText("CLEAR ALL");
        jMenuItem1.setBorderPainted(false);
        jMenuItem1.setIconTextGap(10);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/refresh22.png"))); // NOI18N
        jMenuItem2.setText("Refresh");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 20));
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        setLayout(new java.awt.BorderLayout(10, 0));

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 733));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel1.setBackground(new java.awt.Color(43, 46, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 158));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 90));
        jPanel6.setLayout(new java.awt.GridLayout(3, 1));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("TOTAL ITEMS");
        jPanel7.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("0");
        jPanel7.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("DISCOUNTS");
        jPanel8.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("0");
        jPanel8.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setText("BILL TOTAL");
        jPanel15.add(jLabel10, java.awt.BorderLayout.LINE_START);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("0");
        jPanel15.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel15);

        jPanel1.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(500, 40));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PROCEED PAYMENT - Rs. 0.00");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 48));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setText("Take Away");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(0, 60));
        jToggleButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton2ItemStateChanged(evt);
            }
        });
        jPanel3.add(jToggleButton2);

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton1.setText("Dine In");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(0, 60));
        jToggleButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton1ItemStateChanged(evt);
            }
        });
        jPanel3.add(jToggleButton1);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton3.setText("Pre Order");
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setPreferredSize(new java.awt.Dimension(0, 60));
        jToggleButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton3ItemStateChanged(evt);
            }
        });
        jPanel3.add(jToggleButton3);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton4.setText("Reserve");
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.setPreferredSize(new java.awt.Dimension(0, 60));
        jToggleButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton4ItemStateChanged(evt);
            }
        });
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton4);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(43, 46, 56));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel4);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel5.setBackground(new java.awt.Color(43, 46, 56));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });
        jPanel5.setLayout(new java.awt.BorderLayout(0, 10));

        categoryPanel.setOpaque(false);
        categoryPanel.setPreferredSize(new java.awt.Dimension(725, 140));
        categoryPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jPanel10.setBackground(new java.awt.Color(43, 46, 56));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(43, 46, 56));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.setPreferredSize(new java.awt.Dimension(120, 82));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All");
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel12.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("20 items");
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel12.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/meal-32.png"))); // NOI18N
        jPanel12.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel12);

        jPanel10.add(jPanel13, java.awt.BorderLayout.WEST);

        jScrollPane2.setViewportView(jPanel10);

        categoryPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setText("Categories");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 30));
        categoryPanel.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(categoryPanel, java.awt.BorderLayout.NORTH);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane3.setOpaque(false);

        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel14MouseReleased(evt);
            }
        });
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(jPanel14);

        jPanel11.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setText("Menu Items (20)");
        jLabel9.setPreferredSize(new java.awt.Dimension(45, 30));
        jPanel11.add(jLabel9, java.awt.BorderLayout.NORTH);

        jPanel5.add(jPanel11, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        setCategory("");
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jToggleButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton2ItemStateChanged
        // TODO add your handling code here:
        setOrderType(Order.TAKE_AWAY);
    }//GEN-LAST:event_jToggleButton2ItemStateChanged

    private void jToggleButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton1ItemStateChanged
        // TODO add your handling code here:
        setOrderType(Order.DINE_IN);
    }//GEN-LAST:event_jToggleButton1ItemStateChanged

    private void jToggleButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton3ItemStateChanged
        // TODO add your handling code here:
        setOrderType(Order.PRE_ORDER);
    }//GEN-LAST:event_jToggleButton3ItemStateChanged

    private void jToggleButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton4ItemStateChanged
        // TODO add your handling code here:       

    }//GEN-LAST:event_jToggleButton4ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (invoiceItems.size() > 0) {
            openCheckout();
        } else {
            this.dashboard.setWarningStatus("Add items to Continue Payment");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        // TODO add your handling code here:
        setOrderType(Order.RESERVE);
        openReservationModel();
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3 && !invoiceItems.isEmpty()) {
            SwingUtilities.updateComponentTreeUI(jPopupMenu1);
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_jPanel4MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        resetInvoice();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        // TODO add your handling code here:
        JScrollBar scrollbar = jScrollPane1.getVerticalScrollBar();
        scrollbar.setValue(scrollbar.getValue() + evt.getWheelRotation() * 20);
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON3) {
            SwingUtilities.updateComponentTreeUI(jPopupMenu2);
            jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel5MouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        refreshSalesChannelData();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jPanel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseReleased
        // TODO add your handling code here:
        refreshSalesChannelData();
    }//GEN-LAST:event_jPanel14MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables

    public void setTakeAwayActive() {
        setOrderType(Order.TAKE_AWAY);
        jToggleButton2.setSelected(true);
    }

    private void openCheckout() {
        switch (orderType) {
            case TAKE_AWAY:
                TakeAway takeAway = new TakeAway(this.dashboard, true, this);
                takeAway.setBillTotal(billTotal);
                takeAway.setTotalDiscount(totalDiscount);
                takeAway.setBalance();
                takeAway.setTitle("Take Away Payment - Rs. " + (this.billTotal - this.totalDiscount));
                takeAway.setVisible(true);
                break;
            case DINE_IN:
                DineIn dineIn = new DineIn(this.dashboard, true, this);
                dineIn.setBillTotal(billTotal);
                dineIn.setTotalDiscount(totalDiscount);
                dineIn.setBalance();
                dineIn.setTitle("Dine In Payment - Rs. " + (this.billTotal - this.totalDiscount));
                dineIn.setVisible(true);
                break;
            case PRE_ORDER:
                PreOrder preOrder = new PreOrder(this.dashboard, true, this);
                preOrder.setBillTotal(billTotal);
                preOrder.setTotalDiscount(totalDiscount);
                preOrder.setBalance();
                preOrder.setTitle("Pre Order Payment - Rs. " + (this.billTotal - this.totalDiscount));
                preOrder.setVisible(true);
                break;
            case RESERVE:
                Reservation reservation = new Reservation(dashboard, true, this);
                reservation.setTitle("Table Reservation");
                reservation.setVisible(true);
                break;
        }
    }

    public void refreshSalesChannelData() {
        loadCategories();
        loadMenuItems();
    }

    public void loadMenuItems() {
        jPanel14.removeAll();
        try {

            ResultSet resultset = Mysql.execute("SELECT menu_item.id,menu_item.name,menu_item_category.name AS `category`,brand.name AS `brand`,"
                    + "menu_item.price AS price,`rate`,menu_item.image_path "
                    + "FROM menu_item LEFT JOIN menu_spec ON menu_item.id = menu_spec.menu_item_id "
                    + "INNER JOIN menu_item_category ON menu_item_category.id = menu_item.menu_item_category_id "
                    + "INNER JOIN brand ON menu_item.brand_id = brand.id LEFT JOIN discount "
                    + "ON discount.menu_item_id = menu_item.id AND discount.expire_date > NOW() "
                    + "LEFT JOIN direct_selling_stock ON menu_item.id = direct_selling_stock.menu_item_id  "
                    + "WHERE menu_item_category.name LIKE '" + this.activeCategory + "%' AND "
                    + "(direct_selling_stock.expiry_date > NOW() OR brand.name = 'cafe') AND `menu_item`.`active_state_state_id`=1");

            boolean hasNext = resultset.next();
            int itemCount = 0;
            if (hasNext) {
                System.out.println("ok");
                while (hasNext) {
                    ItemRow itemRow = new ItemRow();
                    for (int j = 0; j < itemsPerRow; j++) {
                        if (!hasNext) {
                            break;
                        }            
                        
                        ItemCard item = new ItemCard();
                        item.setId(resultset.getInt("menu_item.id"));
                        item.setItemName(resultset.getString("menu_item.name"));
                        item.setPrice(resultset.getDouble("price"));
                        item.setDiscount(resultset.getDouble("price") * (resultset.getDouble("rate") / 100));
                        item.setBrand(resultset.getString("brand"));
                        item.setImage(System.getProperty("user.dir") + File.separator + "Pictures" + File.separator + resultset.getInt("menu_item.id")+".png");
                        if (itemsPerRow == 7) {
                            item.setMaximumSize(new Dimension(180, 200));
                            item.setPreferredSize(new Dimension(180, 200));
                        }
                        item.setSalesChannel(this);
                        itemRow.add(item);
                        itemCount++;
                        hasNext = resultset.next();
                    }
                    jPanel14.add(itemRow);
                }
            }
            jLabel9.setText("Menu Items ("+itemCount+")");
            jPanel14.updateUI();
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

    }

    @Override
    public void setStyle() {
        setComponentTheme();
    }

    public void loadInvoiceItems(InvoiceItemCard invoiceItem) {
        boolean found = false;
        boolean unavailable = false;
        invoiceItem.setSalesChannel(this);
        for (InvoiceItemCard item : invoiceItems) {
            if (item.getId() == invoiceItem.getId()) {
                found = true;
                double currentQty = item.getQuantity();
                item.setQuantity(item.getQuantity() + invoiceItem.getQuantity());
                if (!checkStockAvailability(item)) {
                    item.setQuantity(currentQty);
                    unavailable = true;
                    break;
                }
                item.setTotal(item.getPrice() * item.getQuantity());
                break;
            }
        }
        if (!found) {
            if (checkStockAvailability(invoiceItem)) {
                invoiceItems.add(invoiceItem);
                jPanel4.add(invoiceItem);
            } else {
                unavailable = true;
            }

        }

        if (unavailable) {
            dashboard.setWarningStatus("Unavaibale quantity please check again");
        }

        calculateBill();
        jPanel4.updateUI();
    }

    public void removeInvoiceItem(InvoiceItemCard invoiceItem) {
        invoiceItems.remove(invoiceItem);
        jPanel4.remove(invoiceItem);
        calculateBill();
        jPanel4.updateUI();
    }

    public void setCategory(String category) {
        this.activeCategory = category;
        for (Component c : jPanel13.getComponents()) {
            JPanel card = (JPanel) c;
            card.putClientProperty(FlatClientProperties.STYLE, "border:5,5,5,5,#0000,0,50");
        }
        if (activeCategory.equals("")) {
            jPanel12.putClientProperty(FlatClientProperties.STYLE, "border:5,5,5,5,#4D78CC,1,50");
        }
        loadMenuItems();
    }

    private void loadCategories() {
        int totalItems = 0;
        jPanel13.removeAll();
        jPanel13.add(jPanel12);
        try {
            ResultSet resultset = Mysql.execute("SELECT COUNT(menu_item_category.id) AS `count`,"
                    + "menu_item_category.id,menu_item_category.name AS `name`, "
                    + "menu_item_category.image_path FROM menu_item "
                    + "INNER JOIN menu_item_category "
                    + "ON menu_item.menu_item_category_id = menu_item_category.id "
                    + "LEFT JOIN direct_selling_stock ON direct_selling_stock.menu_item_id = menu_item.id "
                    + "INNER JOIN brand ON menu_item.brand_id = brand.id "
                    + "WHERE (direct_selling_stock.expiry_date > NOW() OR brand.name = 'cafe') AND menu_item.active_state_state_id=1 "
                    + "GROUP BY menu_item_category.id");
            while (resultset.next()) {
                CategoryCard categoryCard = new CategoryCard();
                categoryCard.setCategoryName(resultset.getString("name"));
                categoryCard.setId(resultset.getInt("id"));
                categoryCard.setNumberofItems(resultset.getString("count"));
                categoryCard.setSalesChannel(this);
                categoryCard.setImage(resultset.getString("image_path"));
                jPanel13.add(categoryCard);

                totalItems += Integer.parseInt(resultset.getString("count"));
            }

            /**
             * Set the total number of menu Items to the All items card
             */
            jLabel6.setText(String.valueOf(totalItems) + " Items");
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
        }
        jPanel13.updateUI();
    }

    public void calculateBill() {
        int itemCount = 0;
        double totalBill = 0;
        double totalDiscount = 0;
        Iterator<InvoiceItemCard> iterator = invoiceItems.iterator();

        while (iterator.hasNext()) {
            InvoiceItemCard item = iterator.next();
            itemCount += item.getQuantity();
            totalBill += item.getTotal();
            totalDiscount += (item.getDiscount() * item.getQuantity());
        }

        this.totalItems = itemCount;
        this.totalDiscount = totalDiscount;
        this.billTotal = totalBill;

        jLabel3.setText(String.valueOf(itemCount));
        jLabel4.setText(String.valueOf(totalDiscount));
        jLabel11.setText(String.valueOf(totalBill));
        jButton1.setText("PROCEED PAYMENT - Rs. " + (totalBill - totalDiscount));
    }

    @Override
    public void setComponentTheme() {
        CustomStyle.setComponentBackground(
                jPanel4, jPanel5, jPanel1, jPanel13, jPanel10, jPanel14
        );
        CustomStyle.setButtonsTransparent(jPanel3.getComponents());
    }

    private void openReservationModel() {
        resetInvoice();
        Reservation reservation = new Reservation(dashboard, true, this);
        reservation.setTitle("Table Reservation");
        reservation.setVisible(true);
    }

    private boolean checkStockAvailability(InvoiceItemCard item) {
        if (!item.getBrand().equals("Cafe")) {
            try {
                ResultSet result = Mysql.execute("SELECT MAX(`qty`) AS `qty` FROM `direct_selling_stock` WHERE `menu_item_id`='" + item.getId() + "'");
                if (result.next()) {
                    if (result.getDouble("qty") >= item.getQuantity()) {
                        return true;
                    }
                }
                return false;
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                return false;
            }
        } else {
            return true;
        }
    }

    public void resetInvoice() {
        jPanel4.removeAll();
        invoiceItems.clear();
        calculateBill();
        dashboard.loadTodayInvoiceCount();
        jPanel4.updateUI();
    }

}
