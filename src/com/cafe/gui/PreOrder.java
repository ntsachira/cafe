package com.cafe.gui;

import static com.cafe.gui.Dashboard.alignFrame;
import com.cafe.model.Mysql;
import com.cafe.model.Theme;
import com.cafe.style.CustomStyle;
import com.cafe.style.NewTheme;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import static java.awt.Component.LEFT_ALIGNMENT;
import static java.awt.Component.RIGHT_ALIGNMENT;
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
import java.util.Vector;
import java.util.logging.Level;
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
public class PreOrder extends javax.swing.JDialog implements Theme {

    private SalesChannel salesChannel;
    private SalesChannel.Payment paymentMethod = SalesChannel.Payment.Cash;

    private double billTotal;
    private double totalDiscount;
    private String payment = "";

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
     * Creates new form PreOrder
     */
    public PreOrder(Frame parent, boolean modal, SalesChannel salesChannel) {
        super(parent, modal);
        initComponents();
        setSalesChannel(salesChannel);
        setStyle();
        setupDateTimeComponents();
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
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTimeChooser2 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jPanel15 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(613, 483));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(613, 483));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel2.setPreferredSize(new java.awt.Dimension(756, 110));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Order Data & Time");
        jLabel1.setPreferredSize(new java.awt.Dimension(107, 30));
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanel5.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 84));
        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel7.setPreferredSize(new java.awt.Dimension(500, 70));
        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel16.setPreferredSize(new java.awt.Dimension(358, 70));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Date");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 30));
        jPanel16.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135785724000L));
        jPanel16.add(jDateChooser1, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel16);

        jPanel17.setPreferredSize(new java.awt.Dimension(358, 70));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Time");
        jLabel9.setPreferredSize(new java.awt.Dimension(37, 30));
        jPanel17.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jTimeChooser2.setBackground(new java.awt.Color(204, 204, 204));
        jTimeChooser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTimeChooser2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTimeChooser2.setOpaque(true);
        jTimeChooser2.setShowIcon(true);
        jPanel17.add(jTimeChooser2, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel17);

        jPanel6.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel15.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(351, 110));
        jPanel4.setLayout(new java.awt.BorderLayout(30, 0));

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 123));
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

        jPanel3.setPreferredSize(new java.awt.Dimension(716, 130));
        jPanel3.setLayout(new java.awt.BorderLayout());

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
        jButton3.setPreferredSize(new java.awt.Dimension(75, 40));
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

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("...");
        jPanel3.add(jLabel11, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Payment");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel15.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        validateAndSetPayementInput(evt);
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addPayment();
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        processPayment();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private lu.tudor.santec.jtimechooser.JTimeChooser jTimeChooser2;
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

    @Override
    public void setStyle() {
        jToggleButton1.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        jToggleButton2.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        FlatLightLaf.setup();
        SwingUtilities.updateComponentTreeUI(this);
        salesChannel.getDashboard().setMode(salesChannel.getDashboard().getMODE());
        setComponentTheme();
    }

    @Override
    public void setComponentTheme() {

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
        jLabel11.setText(systemStatus);
        jLabel11.setForeground(Color.red);
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                jLabel11.setText("");
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

    private void processPayment() {
        if (Double.parseDouble(jLabel7.getText()) >= 0) {
            if (jDateChooser1.getDate().after(new Date()) && jDateChooser1.getDate() != null) {
                String[] split = jTimeChooser2.getTimeField().getText().split(":");
                double time = Double.parseDouble(split[0]);
                if (time > 9 && time < 20) {
                    if (saveBill()) {
                        this.salesChannel.getDashboard().setSuccessStatus("Bill saved successfully");
                    } else {
                        this.salesChannel.getDashboard().setWarningStatus("Error Saving the Bill! please contact admin");
                    }
                    this.salesChannel.resetInvoice();
                    this.dispose();
                } else {
                    setWarningStatus("> Invalid order time, please Select between 9AM - 8PM");
                }
            } else {
                setWarningStatus("> Invalid order date, please change");
            }

        } else {
            setWarningStatus("> Low payment amount, add payment to continue");
        }

    }

    private boolean saveBill() {
        //invoice - id,date,discount,total,payment method,user mobile, customer mobile        
        String invoiceID = this.salesChannel.getUser().getMobile().substring(7) + "_" + System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String date = formatter.format(new Date());

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
                            } else {
                                return false;
                            }
                        } catch (SQLException ex) {
                            Splash.logger.log(Level.SEVERE, null, ex);
                            ex.printStackTrace();
                            return false;
                        }
                    }
                }

                //Pre order - time,date,pre order status id, invoice id
                ResultSet poresult = Mysql.execute("SELECT `id` FROM `pre_order_status` WHERE `name`='" + SalesChannel.PreOrderStatus.Pending.name() + "'");
                if (poresult.next()) {
                    Mysql.execute("INSERT INTO `pre_orders` (`time`,`date`,`pre_order_status_id`,`invoice_id`) "
                            + "VALUES('" + jTimeChooser2.getTimeField().getText() + "','" + formatter.format(jDateChooser1.getDate()) + "','" + poresult.getString("id") + "','" + invoiceID + "')");
                } else {
                    return false;
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
        DecimalFormat decimalFormatter = new DecimalFormat("#,##0.0");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        //parameters
        HashMap<String, Object> parameters = new HashMap<>();        
        parameters.put("invoice_id", invoiceID);
        parameters.put("pickupDate", formatter.format(jDateChooser1.getDate()) + " " + jTimeChooser2.getTimeField().getText());
        parameters.put("cashier", this.salesChannel.getUser().getDisplay_name());
        parameters.put("customer", "Unknown");
        parameters.put("itemCount", this.salesChannel.getTotalItems());
        parameters.put("netTotal", decimalFormatter.format(this.billTotal));
        parameters.put("discount", decimalFormatter.format(this.totalDiscount));
        parameters.put("payable", decimalFormatter.format(this.billTotal - this.totalDiscount));
        parameters.put("paymentMethod", this.paymentMethod.name());
        parameters.put("payment", decimalFormatter.format(Double.parseDouble(jLabel3.getText())));
        parameters.put("balance", decimalFormatter.format(Double.parseDouble(jLabel3.getText()) - (this.billTotal - this.totalDiscount)));
        
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
            URL billResource = getClass().getResource("/com/cafe/reports/cafe_Preorder_bill.jasper");
            URL kotResource = getClass().getResource("/com/cafe/reports/cafe_preOrder_kot.jasper");
            
            JasperPrint billReport = JasperFillManager.fillReport(billResource.getPath(), parameters, new JRBeanCollectionDataSource(datasource));
            JasperViewer bill = new JasperViewer(billReport, false);
            bill.setAlwaysOnTop(true);
            bill.setFitPageZoomRatio();
            alignFrame(bill, LEFT_ALIGNMENT);
            bill.setVisible(true);

            JasperPrint kotReport = JasperFillManager.fillReport(kotResource.getPath(), parameters, new JRBeanCollectionDataSource(datasource));
            JasperViewer kot = new JasperViewer(kotReport, false);
            kot.setAlwaysOnTop(true);
            kot.setFitPageZoomRatio();
            alignFrame(kot, RIGHT_ALIGNMENT);
            kot.setVisible(true);

            //KOT print
            return true;
        } catch (JRException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }
    }

    private void setupDateTimeComponents() {
        Date date = new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24));
        jDateChooser1.setMinSelectableDate(date);
        jDateChooser1.setDate(date);
        jTimeChooser2.getTimeField().setFont(CustomStyle.getCustomFont(16));
        jTimeChooser2.getTimeField().setBackground(Color.WHITE);
        jTimeChooser2.setTime(new Date(System.currentTimeMillis() + (1000 * 60 * 60))); // 1 hour from now
    }
}
