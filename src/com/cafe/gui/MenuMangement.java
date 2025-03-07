package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.Theme;
import com.cafe.style.CustomStyle;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Prince
 */
public class MenuMangement extends javax.swing.JPanel implements Theme {

    private Dashboard dashboard;

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
        loadMenuItems("");
    }

    /**
     * Creates new form MenuMangement
     */
    public MenuMangement() {
        initComponents();
        loadCategories();
        loadMenuItems("");
        setStyle();

    }

    public void loadCategories() {
        ResultSet resultSet = Mysql.execute("SELECT * FROM `menu_item_category`");

        Vector<String> vector = new Vector<>();
        vector.add("Select Category");

        try {
            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                categoryMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiscountManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
        jComboBox1.setModel(model);
    }

    public void loadMenuItems(String query) {
        int count = 0;
        int offSet = (itemPanelNumber - 1) * 6;
        ResultSet resultSet = Mysql.execute("SELECT menu_item.id,`menu_item`.`name` AS 'name', price, `menu_item`.`image_path` AS 'img',\n"
                + "`menu_item`.`active_state_state_id` AS 'state', `brand`.`name` AS 'brand',\n"
                + "`menu_item_category`.`name` AS 'category' FROM `menu_item`\n"
                + "INNER JOIN `menu_item_category` ON `menu_item_category_id` = `menu_item_category`.`id`\n"
                + "INNER JOIN `brand` ON `brand_id` = `brand`.`id` " + query + " "
                + "ORDER BY `menu_item`.`id` LIMIT 6 OFFSET " + offSet + "");

        ResultSet resultSetC = Mysql.execute("SELECT COUNT(*) as 'count' FROM `menu_item` "
                + "INNER JOIN `menu_item_category` ON `menu_item_category_id` = `menu_item_category`.`id`\n"
                + "INNER JOIN `brand` ON `brand_id` = `brand`.`id` " + query + " ");

        itemPlagarism();
        try {
            if (resultSetC.next()) {
                int totalRecords = Integer.parseInt(resultSetC.getString("count"));
                totalPanels = (int) Math.ceil(totalRecords / 6.0);
            }
            while (resultSet.next()) {
                count++;
                String activeStateID = resultSet.getString("state");
                boolean status = activeStateID.equals("1") ? true : false;
                String name = resultSet.getString("name");
                String price = resultSet.getString("price");
                String brand = resultSet.getString("brand");
                String category = resultSet.getString("category");
                String img = resultSet.getString("img");

                ImageIcon image = new ImageIcon(getClass().getResource("/com/cafe/itemImg/emptyItem.png"));

                File file = new File(System.getProperty("user.dir") + File.separator + "Pictures" + File.separator + resultSet.getString("menu_item.id") + ".png");

                if (file.exists()) {
                    image = new ImageIcon(ImageIO.read(file));
                }

                MenuItemCard menuItem = new MenuItemCard(name, price, brand + " | " + category, image, status);
                menuItem.setMenuItemId(resultSet.getInt("menu_item.id"));
                menuItem.setDashboard(dashboard);
                menuItem.setBrand(brand);
                menuItem.setCategory(category);
                menuItem.setMenuMangement(this);
                jPanel7.add(menuItem);
            }

            if (count < 6) {
                for (int i = 0; i < 6 - count; i++) {
                    MenuItemCard component = new MenuItemCard(true);
                    jPanel7.add(component);
                }

            }

            SwingUtilities.updateComponentTreeUI(jPanel7);
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void itemPlagarism() {
        jPanel7.removeAll();
        SwingUtilities.updateComponentTreeUI(jPanel7);

        if (itemPanelNumber > 1) {
            jButton7.setEnabled(true);
        } else {
            jButton7.setEnabled(false);
        }

        if (itemPanelNumber == totalPanels) {
            jButton6.setEnabled(false);
        } else {
            jButton6.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setLayout(new java.awt.BorderLayout(0, 10));

        jButton3.setBackground(new java.awt.Color(77, 120, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/add_sign.png"))); // NOI18N
        jButton3.setText("ADD ITEM");
        jButton3.setBorderPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(107, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(64, 40));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEARCH");
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(72, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(77, 120, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/up.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setEnabled(false);
        jButton7.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(77, 120, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/down.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(839, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(43, 46, 56));
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel7.setLayout(new java.awt.GridLayout(2, 5, 10, 10));
        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        search();
        AddMenuItems component = new AddMenuItems(dashboard, true);
        component.setMenuMangement(this);
        component.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        search();
        search();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        itemPanelNumber--;
        search();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        itemPanelNumber++;
        search();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private int itemPanelNumber = 1;
    private int totalPanels = 0;
    private boolean isLastItemPanel = false;
    private HashMap<String, String> categoryMap = new HashMap<>();

    @Override
    public void setStyle() {
        setComponentTheme();
    }

    @Override
    public void setComponentTheme() {
        CustomStyle.setComponentBackground(
                jPanel7
        );

    }

    public void search() {
        String input = jTextField1.getText();
        String query = "WHERE `menu_item`.`name` LIKE '%" + input + "%'";
        String category = String.valueOf(jComboBox1.getSelectedItem());

        if (!category.equals("Select Category")) {
            query += " AND `menu_item_category_id` = '" + categoryMap.get(category) + "'";
        }

        loadMenuItems(query);
    }
}
