package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.style.CustomStyle;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TableManagement extends javax.swing.JPanel implements Theme {

    private Dashboard dashboard;
    private String capacity = "";
    private String amount = "";
    private int itemsPerRow = 5;

    public void setItemsPerRow(int itemsPerRow) {
        this.itemsPerRow = itemsPerRow;
        loadTables();
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public TableManagement() {
        initComponents();
        loadTables();
        loadCategoryTable();
        setStyle();
    }

    private void loadCategoryTable() {
        try {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.setDefaultRenderer(String.class, renderer);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            ResultSet rs = Mysql.execute("SELECT * FROM table_category");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("capacity"));
                v.add(rs.getString("qty"));

                model.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadTables() {
        jPanel49.removeAll();
        try {
            ResultSet resultSet = Mysql.execute("SELECT `table`.`id`,`table_category`.`name`, `table_status`.`name` FROM `table` "
                    + "INNER JOIN `table_category` "
                    + "ON `table`.`table_category_id` = `table_category`.`id`"
                    + "INNER JOIN `table_status` ON `table`.`table_status_id` = `table_status`.`id` "
                    + "WHERE `table_category`.`name` LIKE '%" + jTextField1.getText() + "%'");

            boolean hasnext = resultSet.next();

            if (hasnext) {
                while (hasnext) {
                    TableRowCard rowcard = new TableRowCard();

                    for (int i = 0; i < itemsPerRow; i++) {
                        if (!hasnext) {
                            break;
                        }
                        TableCard tableCard = new TableCard();
                        tableCard.setTableManagement(this);
                        tableCard.setId(resultSet.getString("table.id"));
                        tableCard.setCategory(resultSet.getString("table_category.name"));
                        tableCard.setStatus(resultSet.getString("table_status.name"));

                        rowcard.add(tableCard);
                        hasnext = resultSet.next();
                    }
                    jPanel49.add(rowcard);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jPanel49.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel49 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout(10, 20));

        jPanel4.setLayout(new java.awt.BorderLayout(15, 0));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLE LIST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 16))); // NOI18N
        jScrollPane2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane2MouseWheelMoved(evt);
            }
        });

        jPanel49.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel49MouseWheelMoved(evt);
            }
        });
        jPanel49.setLayout(new javax.swing.BoxLayout(jPanel49, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(jPanel49);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel48.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD TABLES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 16)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15))); // NOI18N
        jPanel48.setPreferredSize(new java.awt.Dimension(300, 270));
        jPanel48.setLayout(new java.awt.BorderLayout(10, 20));

        jPanel40.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel40.setLayout(new java.awt.BorderLayout(10, 0));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/refresh.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(43, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel40.add(jButton2, java.awt.BorderLayout.EAST);

        jButton3.setBackground(new java.awt.Color(77, 120, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPDATE TABLE CATEGORY");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel40.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel48.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel44.setPreferredSize(new java.awt.Dimension(120, 150));
        jPanel44.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 20, 10));

        jPanel46.setPreferredSize(new java.awt.Dimension(145, 100));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Name");
        jLabel12.setPreferredSize(new java.awt.Dimension(43, 40));
        jPanel46.add(jLabel12, java.awt.BorderLayout.CENTER);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(43, 40));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel46.add(jTextField8, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel46);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Capacity");
        jLabel1.setPreferredSize(new java.awt.Dimension(43, 40));
        jPanel7.add(jLabel1, java.awt.BorderLayout.CENTER);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(72, 40));
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        jPanel7.add(jButton4, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Amount");
        jLabel2.setPreferredSize(new java.awt.Dimension(43, 40));
        jPanel8.add(jLabel2, java.awt.BorderLayout.CENTER);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(72, 40));
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        jPanel8.add(jButton5, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel8);

        jPanel43.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TABLES");
        jButton1.setPreferredSize(new java.awt.Dimension(43, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel43.add(jButton1, java.awt.BorderLayout.SOUTH);

        jPanel6.add(jPanel43);

        jPanel44.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel48.add(jPanel44, java.awt.BorderLayout.NORTH);

        jPanel5.add(jPanel48, java.awt.BorderLayout.NORTH);

        jPanel47.setLayout(new java.awt.BorderLayout(5, 10));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CAPACITY", "AVAILABILITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Single Click tor filter\nDouble click to update");
        jTable1.setFocusable(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel47.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel28.setText("TABLE CATEGORIES");
        jPanel47.add(jLabel28, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jButton6.setBackground(new java.awt.Color(77, 120, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("FILTER TABLES");
        jButton6.setBorderPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(106, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, java.awt.BorderLayout.CENTER);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/refresh.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, java.awt.BorderLayout.LINE_END);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setFocusable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel1.add(jTextField1, java.awt.BorderLayout.WEST);

        jPanel47.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel47, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addNewTables();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        validateAndSetCapacity(evt);
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
        validateAndSetAmount(evt);
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        resetFilter();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        loadTables();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            jButton1.setEnabled(false);
            jButton3.setEnabled(true);
            loadSelectedDataToUpdate();
        }
        loadDataToFilter();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        updateTables();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel49MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel49MouseWheelMoved
        // TODO add your handling code here:
         JScrollBar scrollbar = jScrollPane2.getVerticalScrollBar(); 
        scrollbar.setValue(scrollbar.getValue()+evt.getWheelRotation()*20); 
    }//GEN-LAST:event_jPanel49MouseWheelMoved

    private void jScrollPane2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane2MouseWheelMoved
        // TODO add your handling code here:
        JScrollBar scrollbar = jScrollPane2.getVerticalScrollBar(); 
        scrollbar.setValue(scrollbar.getValue()+evt.getWheelRotation()*20); 
    }//GEN-LAST:event_jScrollPane2MouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setStyle() {
        CustomStyle.setComponentBackground(
                jPanel49
        );
    }

    @Override
    public void setComponentTheme() {
        setStyle();
    }

    private void validateAndSetCapacity(KeyEvent evt) {
        String key = String.valueOf(evt.getKeyChar());
        if (key.matches("[0-9]")) {
            capacity += key;
        }

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if (capacity.length() > 1) {
                capacity = capacity.substring(0, capacity.length() - 1);
            } else {
                capacity = "";
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            capacity = "";
        }

        if (capacity.isBlank()) {
            jButton4.setText("0");
        } else {
            jButton4.setText(capacity);
        }
    }

    private void validateAndSetAmount(KeyEvent evt) {
        String key = String.valueOf(evt.getKeyChar());
        if (key.matches("[0-9]")) {
            amount += key;
        }

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if (amount.length() > 1) {
                amount = amount.substring(0, amount.length() - 1);
            } else {
                amount = "";
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            amount = "";
        }

        if (amount.isBlank()) {
            jButton5.setText("0");
        } else {
            jButton5.setText(amount);
        }
    }

    private void reset() {
        jButton1.setEnabled(true);
        jButton3.setEnabled(false);
        jTable1.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jTextField8.setText("");
        jTextField1.setText("");
        jButton4.setText("");
        jButton5.setText("");
        amount = "";
        capacity = "";
        loadTables();
        loadCategoryTable();
    }

    private void addNewTables() {
        String name = jTextField8.getText();
        String capacity = this.capacity;
        String amount = this.amount;

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter  Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (capacity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Capacity ", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (amount.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Amount", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                ResultSet resultSet = Mysql.execute("SELECT * FROM `table_category` "
                        + "WHERE `name` = '" + name + "' ");

                if (resultSet.next()) {
                    int response = JOptionPane.showConfirmDialog(this, "Do you want to add this table amount to the exisiting category : " + name,
                            "Category name already Exsists", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        //add quantity
                        Mysql.execute("UPDATE `table_category` SET `qty`=`qty`+'" + amount + "' "
                                + "WHERE `id`='" + resultSet.getString("id") + "' ");

                        ResultSet categoryIdResult = Mysql.execute("SELECT id FROM table_category WHERE table_category.name = '" + name + "' ");
                        ResultSet tableStatusIdResult = Mysql.execute("SELECT id FROM table_status WHERE name = 'Available' ");
                        ResultSet activeStateIdResult = Mysql.execute("SELECT state_id FROM active_state WHERE status = 'Active' ");

                        if (categoryIdResult.next() && tableStatusIdResult.next() && activeStateIdResult.next()) {
                            ResultSet capacityResult = Mysql.execute("SELECT table.id FROM `table` "
                                    + "INNER JOIN  table_category ON table.table_category_id = table_category.id "
                                    + "WHERE capacity = '" + resultSet.getString("capacity") + "' "
                                    + "ORDER BY table.id DESC LIMIT 1");

                            if (capacityResult.next()) {
                                //continue table id numbering
                                String[] split = capacityResult.getString("table.id").split("-");
                                int initialID = Integer.parseInt(split[1]) + 1;
                                for (int i = initialID; i < initialID + Integer.parseInt(amount); i++) {
                                    String id = split[0] + "-" + i;
                                    Mysql.execute("INSERT INTO `table` (`id`,`table_category_id`,`table_status_id`,`active_state_state_id`) "
                                            + "VALUES('" + id + "','" + categoryIdResult.getString("id") + "','" + tableStatusIdResult.getString("id") + "',"
                                            + "'" + activeStateIdResult.getString("state_id") + "')");
                                }
                                if (dashboard != null) {
                                    dashboard.setSuccessStatus("Tables added successfully");
                                    dashboard.getUser().updateUserActivity(User.UserActivity.NEW_TABLE_ADDED);
                                }
                            }
                        } else {
                            dashboard.setWarningStatus("Error saving tables | Database error");
                        }
                    } else {
                        reset();
                        dashboard.setSuccessStatus("Operation cancelled");
                    }

                } else {
                    //add table category
                    Mysql.execute("INSERT INTO `table_category` (`name`,`capacity`,`qty`) "
                            + "VALUES ('" + name + "','" + capacity + "','" + amount + "')");

                    //Add tables
                    ResultSet categoryIdResult = Mysql.execute("SELECT id FROM table_category WHERE table_category.name = '" + name + "' ");
                    ResultSet tableStatusIdResult = Mysql.execute("SELECT id FROM table_status WHERE name = 'Available' ");
                    ResultSet activeStateIdResult = Mysql.execute("SELECT state_id FROM active_state WHERE status = 'Active' ");

                    if (categoryIdResult.next() && tableStatusIdResult.next() && activeStateIdResult.next()) {
                        ResultSet capacityResult = Mysql.execute("SELECT table.id FROM `table` "
                                + "INNER JOIN  table_category ON table.table_category_id = table_category.id "
                                + "WHERE capacity = '" + capacity + "' "
                                + "ORDER BY table.id DESC LIMIT 1");

                        if (capacityResult.next()) {
                            //continue table id numbering
                            String[] split = capacityResult.getString("table.id").split("-");
                            int initialID = Integer.parseInt(split[1]) + 1;
                            for (int i = initialID; i < initialID + Integer.parseInt(amount); i++) {
                                String id = split[0] + "-" + i;
                                Mysql.execute("INSERT INTO `table` (`id`,`table_category_id`,`table_status_id`,`active_state_state_id`) "
                                        + "VALUES('" + id + "','" + categoryIdResult.getString("id") + "','" + tableStatusIdResult.getString("id") + "',"
                                        + "'" + activeStateIdResult.getString("state_id") + "')");
                            }
                        } else {
                            //add new table numbering
                            System.out.println("out");
                            for (int i = 1; i <= Integer.parseInt(amount); i++) {
                                System.out.println("for");
                                String id = "TBL" + capacity + "-" + i;
                                Mysql.execute("INSERT INTO `table` (`id`,`table_category_id`,`table_status_id`,`active_state_state_id`) "
                                        + "VALUES('" + id + "','" + categoryIdResult.getString("id") + "','" + tableStatusIdResult.getString("id") + "',"
                                        + "'" + activeStateIdResult.getString("state_id") + "')");
                            }
                        }
                        if (dashboard != null) {
                            dashboard.setSuccessStatus("Tables added successfully");
                            dashboard.getUser().updateUserActivity(User.UserActivity.NEW_TABLE_ADDED);
                        }
                    } else {
                        dashboard.setWarningStatus("Error saving tables | Database error");
                    }

                }

                reset();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void resetFilter() {
        jTable1.clearSelection();
        jTextField1.setText("");
        loadTables();
    }

    private void loadSelectedDataToUpdate() {
        jTable1.setEnabled(false);
        jTextField8.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
        jButton4.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)) + " (Cannot update)");
        jButton5.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)) + " (Cannot update)");
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);

    }

    private void loadDataToFilter() {
        jTextField1.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
    }

    private void updateTables() {
        String name = jTextField8.getText();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter  Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            ResultSet resultSet = Mysql.execute("SELECT `id` FROM `table_category` "
                    + "WHERE `id` = '" + String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)) + "' ");

            try {
                if (resultSet.next()) {
                    Mysql.execute("UPDATE `table_category` SET `name`='" + name + "' "
                            + "WHERE `id`='" + String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)) + "' ");
                    dashboard.setSuccessStatus("Updated successfully");
                    dashboard.getUser().updateUserActivity(User.UserActivity.TABLE_CATEGORY_UPDATED);
                    reset();
                } else {
                    dashboard.setWarningStatus("Cannot be updated");
                }
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }
}
