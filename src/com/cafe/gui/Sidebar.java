/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cafe.gui;

import com.cafe.style.CustomStyle;
import com.cafe.style.Pallet;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Dell
 */
public class Sidebar extends javax.swing.JPanel {

    private Dashboard dashboard;

    /**
     * Creates new form Sidebar
     */
    public Sidebar() {
        initComponents();
        addSidebarButtonStyle();
    }

    public void addSidebarButtonStyle() {
        CustomStyle.setButtonsTransparent(jPanel1.getComponents());
        CustomStyle.setButtonsTransparent(jPanel2.getComponents());
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jButton18 = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(260, 100));

        jPanel3.setMinimumSize(new java.awt.Dimension(260, 900));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 1000));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(255, 850));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59267_home_home_house_house.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Dashboard");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.setIconTextGap(10);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59269_invoice_invoice.png"))); // NOI18N
        jToggleButton2.setText("Sales Channel");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.setIconTextGap(10);
        jToggleButton2.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/menu-32.png"))); // NOI18N
        jToggleButton3.setText("Menu Management");
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setIconTextGap(10);
        jToggleButton3.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton3.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton3.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59297_product_product.png"))); // NOI18N
        jToggleButton4.setText("Stock Management");
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.setIconTextGap(10);
        jToggleButton4.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton4.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton4.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4);

        buttonGroup1.add(jToggleButton17);
        jToggleButton17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/grn_32.png"))); // NOI18N
        jToggleButton17.setText("GRN");
        jToggleButton17.setBorderPainted(false);
        jToggleButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton17.setIconTextGap(10);
        jToggleButton17.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton17.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton17.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton17);

        buttonGroup1.add(jToggleButton18);
        jToggleButton18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/po_32.png"))); // NOI18N
        jToggleButton18.setText("Pre Orders");
        jToggleButton18.setBorderPainted(false);
        jToggleButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton18.setIconTextGap(10);
        jToggleButton18.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton18.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton18.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton18);

        buttonGroup1.add(jToggleButton19);
        jToggleButton19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/reserve_32.png"))); // NOI18N
        jToggleButton19.setText("Reservations");
        jToggleButton19.setBorderPainted(false);
        jToggleButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton19.setIconTextGap(10);
        jToggleButton19.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton19.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton19.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton19);

        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59240_cost_cost.png"))); // NOI18N
        jToggleButton5.setText("Discounts");
        jToggleButton5.setBorderPainted(false);
        jToggleButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setIconTextGap(10);
        jToggleButton5.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton5.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton5.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5);

        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/table-2-32.png"))); // NOI18N
        jToggleButton6.setText("Table Management");
        jToggleButton6.setBorderPainted(false);
        jToggleButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.setIconTextGap(10);
        jToggleButton6.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton6.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton6.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton6);

        buttonGroup1.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59312_suppliers_suppliers.png"))); // NOI18N
        jToggleButton7.setText("Supplier Management");
        jToggleButton7.setBorderPainted(false);
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.setIconTextGap(10);
        jToggleButton7.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton7.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton7.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton7);

        buttonGroup1.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59244_customers_customers.png"))); // NOI18N
        jToggleButton8.setText("Customer Management");
        jToggleButton8.setBorderPainted(false);
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.setIconTextGap(10);
        jToggleButton8.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton8.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton8.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton8);

        buttonGroup1.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59317_user_user.png"))); // NOI18N
        jToggleButton9.setText("User Management");
        jToggleButton9.setBorderPainted(false);
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.setIconTextGap(10);
        jToggleButton9.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton9.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton9.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton9);

        buttonGroup1.add(jToggleButton10);
        jToggleButton10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59262_time_time_full_full.png"))); // NOI18N
        jToggleButton10.setText("User Activity");
        jToggleButton10.setBorderPainted(false);
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton10.setIconTextGap(10);
        jToggleButton10.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton10.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton10.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton10);

        buttonGroup1.add(jToggleButton11);
        jToggleButton11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59283_order_order.png"))); // NOI18N
        jToggleButton11.setText("Purchase Order");
        jToggleButton11.setBorderPainted(false);
        jToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton11.setIconTextGap(10);
        jToggleButton11.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton11.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton11.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton11);

        buttonGroup1.add(jToggleButton12);
        jToggleButton12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59232_category_category.png"))); // NOI18N
        jToggleButton12.setText("Manage Categories");
        jToggleButton12.setBorderPainted(false);
        jToggleButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton12.setIconTextGap(10);
        jToggleButton12.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton12.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton12.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton12);

        buttonGroup1.add(jToggleButton13);
        jToggleButton13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59224_basket_basket.png"))); // NOI18N
        jToggleButton13.setText("Damaged Stock");
        jToggleButton13.setBorderPainted(false);
        jToggleButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton13.setIconTextGap(10);
        jToggleButton13.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton13.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton13.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton13);

        buttonGroup1.add(jToggleButton14);
        jToggleButton14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59311_statistics_statistics.png"))); // NOI18N
        jToggleButton14.setText("Reports");
        jToggleButton14.setBorderPainted(false);
        jToggleButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton14.setIconTextGap(10);
        jToggleButton14.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton14.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton14.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton14);

        jPanel3.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        buttonGroup1.add(jToggleButton15);
        jToggleButton15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59302_settings_settings.png"))); // NOI18N
        jToggleButton15.setText("Settings");
        jToggleButton15.setBorderPainted(false);
        jToggleButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton15.setIconTextGap(10);
        jToggleButton15.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton15.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton15.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton15);

        jToggleButton16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/moon.png"))); // NOI18N
        jToggleButton16.setText("Toggle Theme");
        jToggleButton16.setBorderPainted(false);
        jToggleButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton16.setIconTextGap(10);
        jToggleButton16.setMaximumSize(new java.awt.Dimension(255, 50));
        jToggleButton16.setMinimumSize(new java.awt.Dimension(240, 50));
        jToggleButton16.setPreferredSize(new java.awt.Dimension(255, 50));
        jToggleButton16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/sun.png"))); // NOI18N
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton16);

        jButton18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/59277_logout_logout.png"))); // NOI18N
        jButton18.setText("Log Out");
        jButton18.setBorderPainted(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.setIconTextGap(10);
        jButton18.setMaximumSize(new java.awt.Dimension(255, 50));
        jButton18.setMinimumSize(new java.awt.Dimension(240, 50));
        jButton18.setPreferredSize(new java.awt.Dimension(255, 50));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jPanel3.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        logOut();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setSalesChannel();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setMenuManagement();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setStockManagement();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setDiscount();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setTableManagement();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setSupplierRegistration();
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setCustomerRegistration();
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setUserManagement();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setUserAvtivity();
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setPurchaseOrder();
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setCategoryManagement();
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setDamagedStock();
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setReport();
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setSettings();
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        // TODO add your handling code here:
        toggleTheme();
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setDashPanel();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setGrn();
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setPreorderManagement();
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // TODO add your handling code here:
        this.dashboard.setReservationManagement();
    }//GEN-LAST:event_jToggleButton19ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables

   
    public void logOut() {
        int option = JOptionPane.showConfirmDialog(getDashboard(), "Confirm Log out", "Confirmation Message", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
            getDashboard().dispose();
            FlatLightLaf.setup();
            new Splash().setVisible(true);
        }
    }

    
    public void toggleTheme() {
        Pallet.toggleTheme();
    }

    public void setCashierContent() {
        jToggleButton2.setSelected(true);
        this.dashboard.setSalesChannel();

        removeSidebarButtons(
                jToggleButton1, jToggleButton17, jToggleButton6, jToggleButton7, jToggleButton9, jToggleButton10, jToggleButton11,
                jToggleButton12, jToggleButton13, jToggleButton14
        );
        jPanel2.remove(jToggleButton15);
        jPanel3.setPreferredSize(new Dimension((int) jPanel3.getPreferredSize().getWidth(), 800));
        jPanel1.setPreferredSize(new Dimension((int) jPanel1.getPreferredSize().getWidth(), 400));
        this.updateUI();
    }

    private void removeSidebarButtons(JToggleButton... buttons) {
        for (JToggleButton tb : buttons) {
            jPanel1.remove(tb);
        }
    }
}
