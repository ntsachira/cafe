/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cafe.gui;

import com.cafe.Handlers.KeyStrokeHandler;
import com.cafe.model.GRNbean;
import com.cafe.model.GrnItem;
import com.cafe.model.Mysql;
import com.cafe.model.SetupUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class GRN extends javax.swing.JPanel implements SetupUI {
    
    HashMap<String, GRNbean> grnBeanMap = new HashMap<>();
    
    ArrayList<GrnItem> itemList = new ArrayList<>();
    
    private Dashboard dashboard;
    
    public Dashboard getDashboard() {
        return dashboard;
    }
    
    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    /**
     * Creates new form GRN
     */
    public GRN() {
        initComponents();
        initializeUI();
    }
    
    @Override
    public void initializeUI() {
        loadItems();
        jDateChooser1.setMinSelectableDate(new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000));
        loadSupplierMobile();
    }
    
    private void loadSupplierMobile() {
        
        ResultSet resultSet = Mysql.execute("SELECT `supplier`.`mobile` ,`supplier`.`name` FROM `supplier`");
        
        Vector v = new Vector();
        v.add("Select Mobile");
        try {
            
            while (resultSet.next()) {
                String mobile = resultSet.getString("mobile");               
                 String name  =  resultSet.getString("name");
                 v.add(mobile +"- "+ name);

            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(v);
            jComboBox3.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(GRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void reset() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jDateChooser1.setDate(null);
        jComboBox1.setSelectedIndex(0);
    }
    
    private void loadKitchenItems() {
        
        ResultSet resultSet = Mysql.execute("SELECT `kitchen_item`.`id`, `kitchen_item`.`name` FROM `kitchen_item`");
        
        Vector v = new Vector();
        v.add("Select Item");
        try {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                
                v.add(id + "-" + name);
                
            }
            
            DefaultComboBoxModel model = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(GRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void loadDirctSellingItems() {
        
        ResultSet resultSet = Mysql.execute("SELECT `menu_item`.id, `menu_item`.`name` FROM `menu_item` "
                + "INNER JOIN `direct_selling_stock` ON `menu_item`.`id` = `direct_selling_stock`.`menu_item_id` GROUP BY `menu_item`.id");
        
        Vector v = new Vector();
        v.add("Select Item");
        try {
            while (resultSet.next()) {
                
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                
                v.add(id + "-" + name);
                
            }
            
            DefaultComboBoxModel model = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(GRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private GrnItem validateItemData(
            Date expire_date,
            String qty,
            String selling_price,
            String purchase_price
    ) {
        if (purchase_price.isBlank()) {
            this.dashboard.setWarningStatus("Please Enter Purchase Price");
        } else if (directSellingRadioButton.isSelected() && selling_price.isBlank()) {
            this.dashboard.setWarningStatus("Please Enter Selling Price");
        } else if (expire_date == null) {
            this.dashboard.setWarningStatus("Please Select Valid Expire Date");
        } else if (qty.isBlank()) {
            this.dashboard.setWarningStatus("Quantity cannot be empty");
        } else if (Double.parseDouble(qty) <= 0) {
            this.dashboard.setWarningStatus("Quantity must be more than 0");
        } else {
            GrnItem new_item = new GrnItem();
            
            new_item.setId(jTextField1.getText());
            new_item.setName(jTextField2.getText());
            new_item.setCategory(jTextField3.getText());
            new_item.setBrand(jTextField6.getText());
            new_item.setExpire_date(jDateChooser1.getDate());
            new_item.setUnit_of_measure(jTextField4.getText());
            new_item.setQuantity(Double.parseDouble(jTextField10.getText()));
            if (directSellingRadioButton.isSelected()) {
                new_item.setUnit_price(Double.parseDouble(jTextField8.getText()));
            }            
            new_item.setPurchase_price(Double.parseDouble(jTextField7.getText()));
            
            return new_item;
        }
        return null;
    }
    
    private void addItem() {
        GrnItem new_item = validateItemData(
                jDateChooser1.getDate(),
                jTextField10.getText(),
                jTextField8.getText(),
                jTextField7.getText()
        );
        
        if (new_item != null) {
            if (isItemNew(new_item)) {
                new_item.setTotal(new_item.getQuantity() * new_item.getPurchase_price());
                
                if (kitchenRadioButton.isSelected()) {
                    new_item.setGrn_type("kitchen");
                } else {
                    new_item.setGrn_type("direct");
                }
                
                itemList.add(new_item);
            }
            loadTable();
            reset();
        }
        
    }
    
    private boolean isItemNew(GrnItem new_item) {
        ArrayList<GrnItem> matchingItemList = new ArrayList();
        
        boolean addAsNewItem = true;
        
        for (GrnItem grnItem : this.itemList) {
            if (grnItem.getId().equals(new_item.getId())) {
                matchingItemList.add(grnItem);
            }
        }
        if (!matchingItemList.isEmpty()) {
            addAsNewItem = isAddAsNewItem(matchingItemList, new_item);
        }
        return addAsNewItem;
    }
    
    private boolean isAddAsNewItem(ArrayList<GrnItem> matchingItemList, GrnItem new_item) {
        boolean isAddAsNewItem = false;
        for (GrnItem old_item : matchingItemList) {
            boolean increaseQuantity = false;
            
            if (isSameSellingPrice(old_item, new_item) && isSameExpiryDate(old_item, new_item)) {
                increaseQuantity = true;
            } else if (matchingItemList.get(matchingItemList.size() - 1).equals(old_item)) { //checking if the last item of the matching list
                int option = JOptionPane.showConfirmDialog(this, "Same item found with different selling price or expiry date,"
                        + "Do you want to add this as a new item? \n(Click 'No' to update quantity of existing item)",
                        "Item Already Exists", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                
                if (option == JOptionPane.YES_OPTION) {
                    isAddAsNewItem = true;
                } else if (option == JOptionPane.NO_OPTION) {
                    increaseQuantity = true;
                }
            }
            if (increaseQuantity) {
                old_item.setQuantity(new_item.getQuantity() + old_item.getQuantity());
                break;
            }
        }
        return isAddAsNewItem;
    }
    
    private boolean isSameSellingPrice(GrnItem old_item, GrnItem new_item) {
        return old_item.getUnit_price() == new_item.getUnit_price();
    }
    
    private boolean isSameExpiryDate(GrnItem old_item, GrnItem new_item) {
        return old_item.getExpire_date().equals(new_item.getExpire_date());
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
        jPanel42 = new javax.swing.JPanel();
        kitchenRadioButton = new javax.swing.JRadioButton();
        directSellingRadioButton = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel27 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel50 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setLayout(new java.awt.BorderLayout(10, 10));

        jPanel1.setPreferredSize(new java.awt.Dimension(912, 70));
        jPanel1.setLayout(new java.awt.BorderLayout(30, 10));

        jPanel42.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 16)), javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10))); // NOI18N
        jPanel42.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel42.setLayout(new java.awt.GridLayout(0, 2));

        buttonGroup1.add(kitchenRadioButton);
        kitchenRadioButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        kitchenRadioButton.setSelected(true);
        kitchenRadioButton.setText("Kitchen");
        kitchenRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kitchenRadioButtonItemStateChanged(evt);
            }
        });
        kitchenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenRadioButtonActionPerformed(evt);
            }
        });
        jPanel42.add(kitchenRadioButton);
        kitchenRadioButton.getAccessibleContext().setAccessibleName("kitchen_grn");

        buttonGroup1.add(directSellingRadioButton);
        directSellingRadioButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        directSellingRadioButton.setText("Direct Selling");
        directSellingRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                directSellingRadioButtonItemStateChanged(evt);
            }
        });
        directSellingRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directSellingRadioButtonActionPerformed(evt);
            }
        });
        jPanel42.add(directSellingRadioButton);
        directSellingRadioButton.getAccessibleContext().setAccessibleName("direct_selling_grn");

        jPanel1.add(jPanel42, java.awt.BorderLayout.WEST);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(72, 40));
        jComboBox1.setPreferredSize(new java.awt.Dimension(72, 40));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, java.awt.BorderLayout.SOUTH);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setText("Item");
        jPanel2.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel2, java.awt.BorderLayout.WEST);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("* You only can add items of one category to a single GRN");
        jPanel9.add(jLabel14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout(10, 15));

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECTED ITEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14)), javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(940, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 20, 10));

        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 20, 10));

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel6.add(jTextField1, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Name");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel7.add(jTextField2, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Category");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel8.add(jLabel3, java.awt.BorderLayout.CENTER);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel8.add(jTextField3, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel8);

        jPanel10.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel10.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Unit of Measure");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel10.add(jLabel4, java.awt.BorderLayout.CENTER);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel10.add(jTextField4, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel10);

        jPanel12.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Brand");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel12.add(jLabel6, java.awt.BorderLayout.CENTER);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel12.add(jTextField6, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel12);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel13.setLayout(new java.awt.BorderLayout(10, 15));

        jPanel14.setPreferredSize(new java.awt.Dimension(912, 70));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel17.setLayout(new java.awt.GridLayout(1, 5, 20, 10));

        jPanel18.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel18.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Purchase Price");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel18.add(jLabel7, java.awt.BorderLayout.CENTER);

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(72, 40));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel18.add(jTextField7, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel18);

        jPanel19.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel19.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Selling Price");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel19.add(jLabel8, java.awt.BorderLayout.CENTER);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(72, 40));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel19.add(jTextField8, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel19);

        jPanel20.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Expiry Date");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel20.add(jLabel9, java.awt.BorderLayout.CENTER);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jDateChooser1.setPreferredSize(new java.awt.Dimension(88, 40));
        jPanel20.add(jDateChooser1, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel20);

        jPanel27.setPreferredSize(new java.awt.Dimension(220, 40));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel13.setText("Quantity");
        jPanel27.add(jLabel13, java.awt.BorderLayout.CENTER);

        jTextField10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(77, 40));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel27.add(jTextField10, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel27);

        jPanel11.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD ITEM");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel11);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel23.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/remove-24.png"))); // NOI18N
        jButton4.setEnabled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton4);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/controlImg/edit-24.png"))); // NOI18N
        jButton5.setEnabled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/clear.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton6);

        jPanel22.add(jPanel23, java.awt.BorderLayout.SOUTH);

        jPanel17.add(jPanel22);

        jPanel14.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel21.setLayout(new java.awt.BorderLayout(10, 15));

        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel36.setPreferredSize(new java.awt.Dimension(912, 70));
        jPanel36.setLayout(new java.awt.BorderLayout(5, 0));

        jPanel38.setLayout(new java.awt.BorderLayout(5, 10));

        jPanel24.setPreferredSize(new java.awt.Dimension(912, 70));
        jPanel24.setLayout(new java.awt.GridLayout(0, 6, 20, 5));

        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel11.setText("Total Amount");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 10));
        jPanel25.add(jLabel11, java.awt.BorderLayout.CENTER);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextField11.setPreferredSize(new java.awt.Dimension(77, 40));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel25.add(jTextField11, java.awt.BorderLayout.PAGE_END);

        jPanel24.add(jPanel25);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Paid Amount");
        jLabel12.setPreferredSize(new java.awt.Dimension(43, 10));
        jPanel26.add(jLabel12, java.awt.BorderLayout.CENTER);

        jTextField12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextField12.setPreferredSize(new java.awt.Dimension(77, 40));
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        jPanel26.add(jTextField12, java.awt.BorderLayout.PAGE_END);

        jPanel24.add(jPanel26);

        jPanel49.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel17.setText("Supplier Mobile");
        jLabel17.setPreferredSize(new java.awt.Dimension(117, 10));
        jPanel49.add(jLabel17, java.awt.BorderLayout.CENTER);

        jComboBox3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jComboBox3.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel49.add(jComboBox3, java.awt.BorderLayout.PAGE_END);

        jPanel24.add(jPanel49);

        jPanel50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel50.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setText("Payment Method");
        jPanel50.add(jLabel10, java.awt.BorderLayout.CENTER);

        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel50.add(jComboBox2, java.awt.BorderLayout.PAGE_END);

        jPanel24.add(jPanel50);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel15.setText("Number of Items");
        jPanel16.add(jLabel15, java.awt.BorderLayout.CENTER);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("0");
        jLabel16.setPreferredSize(new java.awt.Dimension(59, 40));
        jPanel16.add(jLabel16, java.awt.BorderLayout.SOUTH);

        jPanel24.add(jPanel16);

        jPanel52.setLayout(new java.awt.BorderLayout());

        jPanel51.setLayout(new java.awt.BorderLayout(10, 0));

        jButton2.setBackground(new java.awt.Color(77, 120, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE GRN");
        jButton2.setPreferredSize(new java.awt.Dimension(75, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton2, java.awt.BorderLayout.CENTER);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/refresh.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton3, java.awt.BorderLayout.EAST);

        jPanel52.add(jPanel51, java.awt.BorderLayout.SOUTH);

        jPanel24.add(jPanel52);

        jPanel38.add(jPanel24, java.awt.BorderLayout.PAGE_END);

        jPanel53.setLayout(new java.awt.BorderLayout());

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Category", "Brand", "Expire Date", "Unit of Measure", "Quantity", "Unit Price", "Purchase Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setSelectionBackground(new java.awt.Color(77, 120, 204));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel53.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel53, java.awt.BorderLayout.CENTER);

        jPanel36.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel29.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  
        if (isItemSelected()) {
            addItem();
        } else {
            this.dashboard.setWarningStatus("Select an item to add");
        }
        
        if (!itemList.isEmpty()) {
            kitchenRadioButton.setEnabled(false);
            directSellingRadioButton.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kitchenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenRadioButtonActionPerformed
        loadItems();
    }//GEN-LAST:event_kitchenRadioButtonActionPerformed

    private void directSellingRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directSellingRadioButtonActionPerformed
        // TODO add your handling code here:
        loadItems();
    }//GEN-LAST:event_directSellingRadioButtonActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        KeyStrokeHandler.isDigit(evt);
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        KeyStrokeHandler.isDigit(evt);
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        KeyStrokeHandler.isDigit(evt);
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
        KeyStrokeHandler.isDigit(evt);
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:        
        loadSelectedItem();
        

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Confirm Reset GRN", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION)
            resetGrn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void kitchenRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kitchenRadioButtonItemStateChanged
        // TODO add your handling code here:
        loadItems();
    }//GEN-LAST:event_kitchenRadioButtonItemStateChanged

    private void directSellingRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_directSellingRadioButtonItemStateChanged
        // TODO add your handling code here:
        loadItems();
    }//GEN-LAST:event_directSellingRadioButtonItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        saveGrn();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            toggleEditButtons(true);
            jTable2.setEnabled(false);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cancelEditItem();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Enter new quantity", "Edit Quantity", JOptionPane.INFORMATION_MESSAGE);
        updateQuantity(input);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        removeItem();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton directSellingRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton kitchenRadioButton;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        double total = 0;
        int itemCount = 0;
        for (GrnItem grnItem : itemList) {
            grnItem.setListNo(++itemCount);
            Vector v = new Vector();
            v.add(grnItem.getListNo());
            v.add(grnItem.getName());
            v.add(grnItem.getCategory());
            v.add(grnItem.getBrand());
            v.add(grnItem.getExpire_date());
            v.add(grnItem.getUnit_of_measure());
            v.add(grnItem.getQuantity());
            v.add(grnItem.getUnit_price());
            v.add(grnItem.getPurchase_price());
            v.add(grnItem.getTotal());
            
            model.addRow(v);
            total += (grnItem.getQuantity() * grnItem.getPurchase_price());
        }
        jLabel16.setText(String.valueOf(model.getRowCount()));
        jTextField11.setText(String.valueOf(total));
        
    }
    
    private void loadSelectedItem() {
        if (jComboBox1.getSelectedIndex() == 0) {
            resetSelectedItem();
            
        } else {
            
            String id = String.valueOf(jComboBox1.getSelectedItem()).split("-")[0];
            
            ResultSet resultSet = null;
            
            if (kitchenRadioButton.isSelected()) {
                
                resultSet = Mysql.execute("SELECT `kitchen_item`.`id` AS `id`, `kitchen_item`.`name` AS `name`,`kitchen_item_category`.`name` AS `categoryName`,`unit_of_measure`.`name` AS `unit`,`brand`.`name` AS `brand` FROM `kitchen_item` "
                        + "INNER JOIN `kitchen_item_category` ON `kitchen_item`.`kitchen_item_category_id` = `kitchen_item_category`.`id` "
                        + "INNER JOIN `brand` ON `kitchen_item`.`brand_id` = `brand`.`id` INNER JOIN `unit_of_measure` ON `kitchen_item`.`unit_of_measure` = `unit_of_measure`.`id` WHERE `kitchen_item`.`id` = '" + id + "' ");
                
            } else {
                
                resultSet = Mysql.execute("SELECT `menu_item`.`id` AS `id`,`menu_item`.`name` AS `name`,`menu_item_category`.`name` AS `categoryName`,`unit_of_measure`.`name` AS `unit`,`brand`.`name` AS `brand` FROM `direct_selling_stock` "
                        + "INNER JOIN `menu_item` ON `direct_selling_stock`.`menu_item_id` = `menu_item`.`id` "
                        + "INNER JOIN `unit_of_measure` ON `direct_selling_stock`.`unit_of_measure_id` = `unit_of_measure`.`id` "
                        + "INNER JOIN `menu_item_category` ON `menu_item`.`menu_item_category_id` = `menu_item_category`.`id`"
                        + "INNER JOIN `brand` ON `menu_item`.`brand_id` = `brand`.`id` WHERE `menu_item`.`id` = '" + id + "'");
                
            }
            try {
                if (resultSet.next()) {
                    jTextField1.setText(resultSet.getString("id"));
                    jTextField2.setText(resultSet.getString("name"));
                    jTextField3.setText(resultSet.getString("categoryName"));
                    jTextField4.setText(resultSet.getString("unit"));
                    jTextField6.setText(resultSet.getString("brand"));
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GRN.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    private void resetSelectedItem() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
    }
    
    private void resetGrn() {
        kitchenRadioButton.setEnabled(true);
        directSellingRadioButton.setEnabled(true);
        
        jComboBox3.setSelectedIndex(0);
        
        resetSelectedItem();
        itemList.clear();
        
        jTextField11.setText("");
        jTextField12.setText("");
        
        loadTable();
    }
    
    private Grn validateGrnData() {
        String grn_type = kitchenRadioButton.getAccessibleContext().getAccessibleName();
        String grnId = "GRN-" + System.currentTimeMillis();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String grnTotal = jTextField11.getText();
        String supplier_mobile = String.valueOf(jComboBox3.getSelectedItem());
        String paid_amount = jTextField12.getText();
        if (directSellingRadioButton.isSelected()) {
            grn_type = directSellingRadioButton.getAccessibleContext().getAccessibleName();
        }
        
        if (paid_amount.isBlank()) {
            this.dashboard.setWarningStatus("Paid amount cannot be empty");
            jTextField12.grabFocus();
        } else if (Double.parseDouble(paid_amount) <= 0) {
            this.dashboard.setWarningStatus("Enter paid amount more than 0");
            jTextField12.grabFocus();
        } else if (jComboBox3.getSelectedIndex() == 0) {
            this.dashboard.setWarningStatus("Please select a supplier");
        } else {
            return new Grn(
                    grn_type,
                    grnId,
                    date,
                    grnTotal,
                    supplier_mobile.split("-")[0],
                    paid_amount
            );
        }
        return null;
    }
    
    private int isStockExist(GrnItem grnItem) {
        String query;
        if (kitchenRadioButton.isSelected()) {            
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
    
    private String getUpdateStockQuantityQuery(GrnItem grnItem, int existStockId) {
        String query = "UPDATE %s_stock SET qty=qty+'%s' WHERE id='%s'".formatted(
                grnItem.getGrn_type(),
                grnItem.getQuantity(),
                existStockId
        );        
        return query;        
    }
    
    private class Grn {
        
        private String grn_type;
        private String grnId;
        private String date;
        private String grnTotal;
        private String supplier_mobile;
        private String paid_amount;
        
        public Grn(String grn_type, String grnId, String date, String grnTotal, String supplier_mobile, String paid_amount) {
            this.grn_type = grn_type;
            this.grnId = grnId;
            this.date = date;
            this.grnTotal = grnTotal;
            this.supplier_mobile = supplier_mobile;
            this.paid_amount = paid_amount;
        }
        
        public String getGrn_type() {
            return grn_type;
        }
        
        public String getGrnId() {
            return grnId;
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
        
    }
    
    private void saveGrn() {
        Grn grn;
        if (itemList.isEmpty()) {
            this.dashboard.setWarningStatus("Please Add Items First");
        } else if ((grn = validateGrnData()) != null) {
            //insert grn
            String grnInsertQuery = "INSERT INTO %s (`id`,`date`,`total`,`payment_method_id`,"
                    + "`user_mobile`,`supplier_mobile`,`paid_amount`) "
                    + "VALUES('%s','%s','%s','%s','%s','%s','%s')";
            
            Mysql.execute(String.format(grnInsertQuery,
                    grn.getGrn_type(),
                    grn.getGrnId(),
                    grn.getDate(),
                    grn.getGrnTotal(),
                    getPaymentMethodId(),
                    this.dashboard.getUser().getMobile(),
                    grn.getSupplier_mobile(),
                    grn.getPaid_amount()
            ));
            
            for (GrnItem grnItem : itemList) {
                int existStockId;
                if ((existStockId = isStockExist(grnItem)) == -1) {
                    // kitchen stock
                    String stockId = updateStock(grnItem, grn);
                    if (stockId != null) {
                        grnItem.setStockId(Integer.parseInt(stockId));
                        Mysql.execute(getInsertGrnItemQuery(grnItem, grn));                        
                    }else{
                        this.dashboard.setWarningStatus("Something went wrong");
                    }                
                } else {
                    // update stock quantity
                    Mysql.execute(getUpdateStockQuantityQuery(grnItem, existStockId));
                }                
            }
            this.dashboard.setSuccessStatus("GRN Saved successfully");
            resetGrn();
        }
        
    }
    
    private String updateStock(GrnItem grnItem, Grn grn) {
        String query;
        if (kitchenRadioButton.isSelected()) {
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
    
    private String getInsertGrnItemQuery(GrnItem grnItem, Grn grn) {
        String query = "INSERT INTO %s_grn_item (`purchase_price`,`qty`,`%s_grn_id`,`%s_stock_id`)"
                + "VALUES('%s','%s','%s','%s')";
        String type = grn.getGrn_type().substring(0, grn.getGrn_type().lastIndexOf("_"));
        return String.format(query,
                type,
                type,
                type,
                grnItem.getPurchase_price(),
                grnItem.getQuantity(),
                grn.grnId,
                grnItem.getStockId()
        );
    }
    
    private void loadItems() {
        if (kitchenRadioButton.isSelected()) {
            jTextField8.setEnabled(false);
            loadKitchenItems();
        } else if (directSellingRadioButton.isSelected()) {
            jTextField8.setEnabled(true);
            loadDirctSellingItems();
        }
        resetSelectedItem();
    }
    
    private boolean isItemSelected() {
        return !jTextField1.getText().isBlank();
    }
    
    private void toggleEditButtons(boolean isEnabled) {
        jButton4.setEnabled(isEnabled);
        jButton5.setEnabled(isEnabled);
        jButton6.setEnabled(isEnabled);
        
        jButton1.setEnabled(!isEnabled);
        jButton2.setEnabled(!isEnabled);
        jButton3.setEnabled(!isEnabled);
    }
    
    private void cancelEditItem() {
        jTable2.setEnabled(true);
        toggleEditButtons(false);
        jTable2.clearSelection();
    }
    
    private void updateQuantity(String input) {
        if (isValidQuantityInput(input)) {
            int itemListNo = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
            for (GrnItem item : itemList) {
                if (item.getListNo() == itemListNo) {
                    item.setQuantity(Double.parseDouble(input));
                    cancelEditItem();
                    loadTable();
                    break;
                }
            }
        } else {
            this.dashboard.setWarningStatus("Invalid input for quantity!");
        }
    }
    
    private boolean isValidQuantityInput(String input) {
        if (input != null && !input.isBlank()) {
            for (char c : input.toCharArray()) {
                if (!String.valueOf(c).matches("[0-9]")) {
                    return false;
                }
            }
            if (Double.parseDouble(input) <= 0) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
    
    private void removeItem() {
        int itemListNo = Integer.parseInt(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
        for (GrnItem item : itemList) {
            if (item.getListNo() == itemListNo) {
                itemList.remove(item);
                cancelEditItem();
                loadTable();
                break;
            }
        }
    }
    
    private String getPaymentMethodId() {
        ResultSet resultSet = Mysql.execute("SELECT `payment_method`.`id` FROM `payment_method` "
                + "WHERE `name` = '" + String.valueOf(jComboBox2.getSelectedItem()) + "' ");
        
        try {
            if (resultSet.next()) {
                return resultSet.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
