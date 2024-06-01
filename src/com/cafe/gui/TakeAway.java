package com.cafe.gui;

import static com.cafe.gui.Dashboard.alignFrame;
import com.cafe.model.Mysql;
import com.cafe.style.CustomStyle;
import com.cafe.style.Pallet;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TakeAway extends javax.swing.JDialog {

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
        jLabel4.setText(String.valueOf(totalDiscount));
    }

    public void setSalesChannel(SalesChannel salesChannel) {
        this.salesChannel = salesChannel;
    }

    public TakeAway(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setStyle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Take away payment process");
        setMinimumSize(new java.awt.Dimension(578, 360));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(578, 360));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 110));
        jPanel2.setLayout(new java.awt.BorderLayout(40, 0));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 123));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

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
        jPanel3.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton2.setText("Card");
        jToggleButton2.setPreferredSize(new java.awt.Dimension(0, 90));
        jToggleButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton2ItemStateChanged(evt);
            }
        });
        jPanel3.add(jToggleButton2);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(3, 0));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("PAID AMOUNT");
        jPanel5.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setText("TOTAL DISCOUNT");
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("0");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setText("BALANCE");
        jPanel7.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0");
        jPanel7.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel9.setMinimumSize(new java.awt.Dimension(200, 39));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 70));
        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

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
        jPanel9.add(jButton2, java.awt.BorderLayout.EAST);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Payment");
        jLabel7.setPreferredSize(new java.awt.Dimension(37, 30));
        jPanel9.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel9.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new java.awt.BorderLayout());

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
        jPanel10.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("...");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        validateAndSetPayementInput(evt);
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addPayment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        processPayment();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TakeAway dialog = new TakeAway(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    public void setBalance() {
        jLabel6.setText(String.valueOf(-(billTotal - totalDiscount)));
    }

    private void setBillforCardPay() {
        payment = String.valueOf(this.billTotal - this.totalDiscount);
        jLabel2.setText(payment);
        jButton3.setText("");
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);
        addPayment();
    }

    private void setBillforCashPay() {
        jButton3.setEnabled(true);
        jButton2.setEnabled(true);
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

    private void addPayment() {
        if (payment.isBlank()) {
            setWarningStatus("Warning: Enter payment amount to add");
        } else {
            jLabel2.setText(payment);
            jLabel6.setText(String.valueOf((Double.parseDouble(payment) + this.totalDiscount) - this.billTotal));
            payment = "";
            jButton3.setText("0");
        }
    }

    public void setWarningStatus(String systemStatus) {
        Toolkit.getDefaultToolkit().beep();
        jLabel8.setText(systemStatus);
        jLabel8.setForeground(Color.red);
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                jLabel8.setText("");
            } catch (InterruptedException ex) {
                Splash.logger.log(Level.SEVERE, "Thread interupption", ex);
                ex.printStackTrace();
            }
        }).start();
    }

    private void saveBill() {
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

                this.salesChannel.getInvoiceItems().forEach((item) -> {
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
                        }
                    }
                });

                this.salesChannel.getDashboard().setSuccessStatus("Invoice saved successfully");
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, "Save invoice", ex);
                ex.printStackTrace();
            }
        } else {
            this.salesChannel.getDashboard().setWarningStatus("Report error please contact admin");
        }
    }

    private boolean printBill(String invoiceID, String date) {
        String datetime = new SimpleDateFormat("MMM d, y HH:mm:ss").format(new Date());
        DecimalFormat decimalFormat = new DecimalFormat("#,###.0");
        //parameters
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("date", date);
        parameters.put("datetime", datetime);
        parameters.put("invoice_id", invoiceID);
        parameters.put("cashier", this.salesChannel.getUser().getDisplay_name());
        parameters.put("customer", "Unknown");
        parameters.put("itemCount", this.salesChannel.getTotalItems());
        parameters.put("netTotal", this.billTotal);
        parameters.put("discount", this.totalDiscount);
        parameters.put("payable", (this.billTotal - this.totalDiscount));
        parameters.put("paymentMethod", this.paymentMethod.name());
        parameters.put("payment", decimalFormat.format(Double.parseDouble(jLabel2.getText())));
        parameters.put("balance", (Double.parseDouble(jLabel2.getText()) - (this.billTotal - this.totalDiscount)));

        Vector<Object> datasource = new Vector<>();
        for (InvoiceItemCard item : this.salesChannel.getInvoiceItems()) {
            datasource.add(item);
        }

        try {
            JasperPrint billReport = JasperFillManager.fillReport("src/com/cafe/reports/cafe_invoice.jasper", parameters, new JRBeanCollectionDataSource(datasource));
            JasperViewer bill = new JasperViewer(billReport, false);
            bill.setAlwaysOnTop(true);
            bill.setFitPageZoomRatio();
            alignFrame(bill, LEFT_ALIGNMENT);
            bill.setVisible(true);
            //KOT print
            JasperPrint kotReport = JasperFillManager.fillReport("src/com/cafe/reports/cafe_kot.jasper", parameters, new JRBeanCollectionDataSource(datasource));
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
        if (Double.parseDouble(jLabel6.getText()) >= 0) {
            saveBill();
            this.salesChannel.resetInvoice();
            this.dispose();
        } else {
            setWarningStatus("Low payment amount, add payment to continue");
        }

    }

    private void setStyle() {
        jToggleButton1.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        jToggleButton2.putClientProperty(FlatClientProperties.STYLE, "selectedBackground:rgba(77, 120, 204,40)");
        FlatLightLaf.setup();
        SwingUtilities.updateComponentTreeUI(this);
        Pallet.ResetTheme();
    }

}
