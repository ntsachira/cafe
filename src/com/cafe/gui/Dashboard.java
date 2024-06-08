package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.Tabs;
import com.cafe.style.CustomStyle;
import com.cafe.style.Pallet;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import com.lowagie.text.pdf.PdfObject;
import static java.awt.Component.LEFT_ALIGNMENT;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public class Dashboard extends javax.swing.JFrame implements Theme, Tabs {

    //system status
    final String DEFAULT_STATUS = "System functions properly";

    //system user
    private User user;
    private String date = "";

    private Tab activeTab;

    private JFreeChart salesChart;
    private JFreeChart categorySalesChart;

    //components
    private Sidebar sidebar;
    private SalesChannel salesChannel;
    private ReservationManagement reservationManagement;
    private PreorderManagement preorderManagement;
    private Reports report;
    private RegisterSupplier registerSupplier;
    private CustomerRegistration customerRegistration;
    private GRN grn;
    private PurchaseOrder purchaseOrder;
    private Settings settings;
    private TableManagement tableManagement;
    private MenuMangement menuMangement;
    private StockManagement stockManagement;
    private DiscountManagement discountManagement;
    private UserManagement userManagement;
    private UserActivityManagement userActivityManagement;
    private CategoryManagement categoryManagement;
    private DamageStockManagement damageStockManagement;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        setSidebar();
        loadContentByUserRole();
        loadTodayInvoiceCount();
    }

    /**
     * Creates new form Dashboard
     */
    public Dashboard(User user) {
        if (user.getRole().equals(UserRole.Role.Cashier)) {
            if (!this.isDisplayable()) {
                this.setUndecorated(true);
            }
        }
        initComponents();
        setUser(user);
        loadSystemData();
        setStyle();
                
        setExtendedState(MAXIMIZED_BOTH);
    }

    public void setActiveTab(Tab activeTab) {
        this.activeTab = activeTab;
        jLabel8.setText(arrangeTitle(this.activeTab.name()));
    }

    public Tab getActiveTab() {
        return activeTab;
    }

    public void setWarningStatus(String systemStatus) {
        Toolkit.getDefaultToolkit().beep();
        status.setText(systemStatus);
        status.setForeground(Color.red);
        new Thread(() -> {
            try {
                Thread.sleep(6000);
                setDefaultSystemStatus();
            } catch (InterruptedException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void setSuccessStatus(String systemStatus) {
        status.setText(systemStatus);
        status.setForeground(Color.GREEN);
        new Thread(() -> {
            try {
                Thread.sleep(6000);
                setDefaultSystemStatus();
            } catch (InterruptedException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public String arrangeTitle(String tabName) {
        String title = "";
        for (String s : tabName.split("_")) {
            title += s;
            title += " ";
        }
        return title.toUpperCase().trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        menuButton = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        dashPanel = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        chartPanel1 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel36 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        card3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        card4 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel39 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel41 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 1080));
        setMinimumSize(new java.awt.Dimension(1260, 720));
        setSize(new java.awt.Dimension(1260, 720));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 60));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(43, 46, 56));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/arro-24.png"))); // NOI18N
        menuButton.setBorderPainted(false);
        menuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButton.setIconTextGap(0);
        menuButton.setMargin(new java.awt.Insets(5, 0, 5, 0));
        menuButton.setMaximumSize(new java.awt.Dimension(40, 40));
        menuButton.setMinimumSize(new java.awt.Dimension(26, 40));
        menuButton.setPreferredSize(new java.awt.Dimension(40, 40));
        menuButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jPanel5.add(menuButton, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("Sachira");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel7.add(jLabel1, java.awt.BorderLayout.EAST);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText(" Admin:");
        jLabel2.setRequestFocusEnabled(false);
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(450, 57));
        jPanel9.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CAFE-POS");
        jPanel9.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Restaurant Management System");
        jPanel9.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 57));
        jPanel10.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Sales:");
        jPanel10.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setText("0");
        jPanel10.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("May 11, 2024");
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel11.add(jLabel7, java.awt.BorderLayout.LINE_END);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DASHBOARD");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);
        jPanel2.add(jSeparator1, java.awt.BorderLayout.SOUTH);
        jPanel2.add(jSeparator5, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(1260, 40));
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(jSeparator3, java.awt.BorderLayout.PAGE_START);

        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel14.setPreferredSize(new java.awt.Dimension(500, 37));
        jPanel14.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Status:");
        jPanel14.add(jLabel9, java.awt.BorderLayout.LINE_START);

        status.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        status.setText("System functions properly");
        jPanel14.add(status, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14, java.awt.BorderLayout.EAST);

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jPanel15.setLayout(new java.awt.BorderLayout(10, 0));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel15.add(jSeparator4, java.awt.BorderLayout.LINE_END);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("System time:");
        jPanel15.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("4:20 PM");
        jPanel15.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        mainPanel.setLayout(new java.awt.BorderLayout());

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator2, java.awt.BorderLayout.LINE_START);

        dashPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 20));
        dashPanel.setPreferredSize(new java.awt.Dimension(1237, 700));
        dashPanel.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel16.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel16.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel33.setBackground(new java.awt.Color(43, 46, 56));
        jPanel33.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 10, 10, 10)));
        jPanel33.setPreferredSize(new java.awt.Dimension(400, 250));
        jPanel33.setLayout(new java.awt.BorderLayout());

        chartPanel1.setOpaque(false);
        chartPanel1.setPreferredSize(new java.awt.Dimension(300, 200));
        chartPanel1.setLayout(new java.awt.BorderLayout());
        jPanel33.add(chartPanel1, java.awt.BorderLayout.CENTER);

        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(201, 30));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel29.setText("TOTAL SALES OVER TIME");
        jPanel32.add(jLabel29, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel32, java.awt.BorderLayout.NORTH);

        jPanel16.add(jPanel33, java.awt.BorderLayout.NORTH);

        jPanel34.setBackground(new java.awt.Color(43, 46, 56));
        jPanel34.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        jPanel34.setLayout(new java.awt.BorderLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel30.setText("EXPIRING SOON | LIMITED STOCK");
        jLabel30.setPreferredSize(new java.awt.Dimension(217, 30));
        jPanel34.add(jLabel30, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel36.setLayout(new java.awt.BorderLayout());

        jPanel45.setLayout(new java.awt.GridLayout(0, 1, 0, 7));
        jPanel36.add(jPanel45, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setViewportView(jPanel36);

        jPanel34.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel42.setBackground(new java.awt.Color(43, 46, 56));
        jPanel42.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 10));
        jPanel42.setPreferredSize(new java.awt.Dimension(250, 260));
        jPanel42.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel33.setText("SALES BY CATEGORY");
        jPanel42.add(jLabel33, java.awt.BorderLayout.PAGE_START);

        jPanel44.setLayout(new java.awt.BorderLayout());
        jPanel42.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel42, java.awt.BorderLayout.SOUTH);

        dashPanel.add(jPanel16, java.awt.BorderLayout.EAST);

        jPanel17.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel18.setPreferredSize(new java.awt.Dimension(786, 120));
        jPanel18.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        card1.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(0, 204, 204));
        jPanel20.setPreferredSize(new java.awt.Dimension(5, 100));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        card1.add(jPanel20, java.awt.BorderLayout.WEST);

        jPanel21.setBackground(new java.awt.Color(43, 46, 56));
        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(43, 30));
        jPanel19.setLayout(new java.awt.GridLayout(1, 2));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel14.setText("TOTAL SALES");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel14);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/total_light.png"))); // NOI18N
        jPanel19.add(jLabel15);

        jPanel21.add(jPanel19, java.awt.BorderLayout.NORTH);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RS. 170,500.00");
        jPanel21.add(jLabel10, java.awt.BorderLayout.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Updated: 2024-05-12");
        jPanel21.add(jLabel13, java.awt.BorderLayout.PAGE_END);

        card1.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel18.add(card1);

        card2.setBackground(new java.awt.Color(255, 255, 255));
        card2.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 204, 0));
        jPanel22.setPreferredSize(new java.awt.Dimension(5, 100));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        card2.add(jPanel22, java.awt.BorderLayout.WEST);

        jPanel23.setBackground(new java.awt.Color(43, 46, 56));
        jPanel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(43, 30));
        jPanel24.setLayout(new java.awt.GridLayout(1, 2));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel16.setText("MONTHLY SALES");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel24.add(jLabel16);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/monthly_light.png"))); // NOI18N
        jPanel24.add(jLabel17);

        jPanel23.add(jPanel24, java.awt.BorderLayout.NORTH);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("RS. 170,500.00");
        jPanel23.add(jLabel18, java.awt.BorderLayout.CENTER);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Updated: 2024-05-12");
        jPanel23.add(jLabel19, java.awt.BorderLayout.PAGE_END);

        card2.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel18.add(card2);

        card3.setBackground(new java.awt.Color(255, 255, 255));
        card3.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(204, 0, 204));
        jPanel25.setPreferredSize(new java.awt.Dimension(5, 100));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        card3.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel26.setBackground(new java.awt.Color(43, 46, 56));
        jPanel26.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(43, 30));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel20.setText("REGISTERED CUSTOMERS");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel27.add(jLabel20, java.awt.BorderLayout.CENTER);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/customer_light.png"))); // NOI18N
        jPanel27.add(jLabel21, java.awt.BorderLayout.EAST);

        jPanel26.add(jPanel27, java.awt.BorderLayout.NORTH);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("54");
        jPanel26.add(jLabel22, java.awt.BorderLayout.CENTER);

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Updated: 2024-05-12");
        jPanel26.add(jLabel23, java.awt.BorderLayout.PAGE_END);

        card3.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel18.add(card3);

        card4.setBackground(new java.awt.Color(255, 255, 255));
        card4.setLayout(new java.awt.BorderLayout());

        jPanel28.setBackground(new java.awt.Color(255, 102, 0));
        jPanel28.setPreferredSize(new java.awt.Dimension(5, 100));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        card4.add(jPanel28, java.awt.BorderLayout.WEST);

        jPanel29.setBackground(new java.awt.Color(43, 46, 56));
        jPanel29.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(43, 30));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel24.setText("TOTAL MENU ITEMS");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel30.add(jLabel24, java.awt.BorderLayout.CENTER);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/menu_item_light.png"))); // NOI18N
        jPanel30.add(jLabel25, java.awt.BorderLayout.EAST);

        jPanel29.add(jPanel30, java.awt.BorderLayout.NORTH);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("24");
        jPanel29.add(jLabel26, java.awt.BorderLayout.CENTER);

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Updated: 2024-05-12");
        jPanel29.add(jLabel27, java.awt.BorderLayout.PAGE_END);

        card4.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel18.add(card4);

        jPanel17.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel31.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel35.setLayout(new java.awt.BorderLayout(15, 0));

        jPanel37.setPreferredSize(new java.awt.Dimension(300, 522));
        jPanel37.setLayout(new java.awt.BorderLayout(0, 15));

        jPanel46.setBackground(new java.awt.Color(43, 46, 56));
        jPanel46.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        jPanel46.setLayout(new java.awt.BorderLayout(0, 5));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jPanel39.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel43.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.GridLayout(0, 1, 0, 7));
        jPanel39.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(jPanel39);

        jPanel46.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel32.setText("  TOP SELLING ITEMS");
        jPanel46.add(jLabel32, java.awt.BorderLayout.PAGE_START);

        jPanel37.add(jPanel46, java.awt.BorderLayout.CENTER);

        jPanel35.add(jPanel37, java.awt.BorderLayout.WEST);

        jPanel38.setLayout(new java.awt.GridLayout(2, 0, 0, 15));

        jPanel40.setBackground(new java.awt.Color(43, 46, 56));
        jPanel40.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 10));
        jPanel40.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel28.setText("RECENT INVOICES");
        jPanel40.add(jLabel28, java.awt.BorderLayout.PAGE_START);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "DISCOUNTS", "TOTAL", "CASHIER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel40.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(43, 46, 56));
        jPanel41.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 10, 10));
        jPanel41.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel31.setText("RECENT GOOD RECEIVE NOTES");
        jPanel41.add(jLabel31, java.awt.BorderLayout.PAGE_START);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "TOTAL", "SUPPLIER", "PAYMENT METHOD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel41.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel41);

        jPanel35.add(jPanel38, java.awt.BorderLayout.CENTER);

        jPanel31.add(jPanel35, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel31, java.awt.BorderLayout.CENTER);

        dashPanel.add(jPanel17, java.awt.BorderLayout.CENTER);

        mainPanel.add(dashPanel, java.awt.BorderLayout.CENTER);

        jPanel1.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        toggleSidebar();
    }//GEN-LAST:event_menuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatOneDarkIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                Pallet.setDarkMode();
//                Dashboard d = new Dashboard(new User());
//                Pallet.setDashboard(d);
//
//                d.setComponentTheme();
//
//                d.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel chartPanel1;
    private javax.swing.JPanel dashPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToggleButton menuButton;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setStyle() {
        CustomStyle.setIcon(this);
    }

    public void setDefaultSystemStatus() {
        status.setText(DEFAULT_STATUS);
        status.setForeground(jLabel9.getForeground());
    }

    public void setDarkModeIcons() {
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/total_light.png")));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/monthly_light.png")));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/customer_light.png")));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/menu_item_light.png")));
    }

    public void setLightModeIcons() {
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/total_dark.png")));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/monthly_dark.png")));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/customer_dark.png")));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/menu_item_dark.png")));
    }

    private void toggleSidebar() {
        if (menuButton.isSelected()) {
            if (this.salesChannel != null) {
                this.salesChannel.setItemsPerRow(7);
            }
            if (this.purchaseOrder != null) {
                this.purchaseOrder.setItemsPerRow(7);
            }
            closeSidebar();
        } else {
            openSidebar();
            if (this.salesChannel != null) {
                this.salesChannel.setItemsPerRow(6);
            }
            if (this.purchaseOrder != null) {
                this.purchaseOrder.setItemsPerRow(6);
            }
        }

    }

    private void loadTopSellingItems() {
        try {

            ResultSet resultset = Mysql.execute("SELECT menu_invoice_item.menu_item_id,`name`,`image_path`,menu_invoice_item.selling_price AS `price`"
                    + ",SUM(qty) AS `count`,menu_item.image_path FROM invoice "
                    + "INNER JOIN menu_invoice_item ON invoice.id = menu_invoice_item.invoice_id "
                    + "INNER JOIN menu_item ON menu_invoice_item.menu_item_id = menu_item.id "
                    + "INNER JOIN menu_spec ON menu_item.id = menu_spec.menu_item_id "
                    + "GROUP BY menu_invoice_item.menu_item_id ORDER BY `count` DESC LIMIT 4");

            jPanel43.removeAll();
            while (resultset.next()) {
                ItemCard item = new ItemCard();
                item.setSoldQuantity(resultset.getInt("count"));
                item.setPrice(resultset.getDouble("price"));
                item.setItemName(resultset.getString("name"));
                item.setImage(resultset.getString("image_path"));
                item.setStyleforDashboard();
                jPanel43.add(item);
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
        }
        jPanel43.updateUI();
    }

    public SalesChannel getSalesChannel() {
        return salesChannel;
    }

    public void setDamagedStock() {
        if (this.damageStockManagement == null) {
            DamageStockManagement damageStockManagement = new DamageStockManagement();
            this.damageStockManagement = damageStockManagement;
            this.damageStockManagement.setDashboard(this);
        }
        setMainPanel(this.damageStockManagement);
        setActiveTab(Tab.Damaged_Stock);
    }

    public void setCategoryManagement() {
        if (this.categoryManagement == null) {
            CategoryManagement categoryManagement = new CategoryManagement();
            this.categoryManagement = categoryManagement;
            this.categoryManagement.setDashboard(this);
        }
        setMainPanel(this.categoryManagement);
        setActiveTab(Tab.Manage_Categories);
    }

    public void setUserAvtivity() {
        if (this.userActivityManagement == null) {
            UserActivityManagement userActivityManagement = new UserActivityManagement();
            this.userActivityManagement = userActivityManagement;
            this.userActivityManagement.setDashboard(this);
        }
        setMainPanel(this.userActivityManagement);
        setActiveTab(Tab.User_Activity);
    }

    public void setDiscount() {
        if (this.discountManagement == null) {
            DiscountManagement discountManagement = new DiscountManagement();
            this.discountManagement = discountManagement;
            this.discountManagement.setDashboard(this);
        }
        setMainPanel(this.discountManagement);
        setActiveTab(Tab.Discounts);
    }

    public void setUserManagement() {
        if (this.userManagement == null) {
            UserManagement userManagement = new UserManagement();
            this.userManagement = userManagement;
            this.userManagement.setDashboard(this);
        }
        setMainPanel(this.userManagement);
        setActiveTab(Tab.User_Management);
    }

    public void setStockManagement() {
        if (this.stockManagement == null) {
            StockManagement stockManagement = new StockManagement();
            this.stockManagement = stockManagement;
            this.stockManagement.setDashboard(this);
        }
        setMainPanel(this.stockManagement);
        setActiveTab(Tab.Stock_Management);
    }

    public void setMenuManagement() {
        if (this.menuMangement == null) {
            MenuMangement menuMangement = new MenuMangement();
            this.menuMangement = menuMangement;
            this.menuMangement.setDashboard(this);
        }
        setMainPanel(this.menuMangement);
        setActiveTab(Tab.Menu_Management);
    }

    public void setTableManagement() {
        if (this.tableManagement == null) {
            TableManagement tableManagement = new TableManagement();
            this.tableManagement = tableManagement;
            this.tableManagement.setDashboard(this);
        }
        setMainPanel(this.tableManagement);
        setActiveTab(Tab.Table_Management);
    }

    public void setSettings() {
        if (this.settings == null) {
            Settings settings = new Settings();
            this.settings = settings;
            this.settings.setDashboard(this);
        }
        setMainPanel(this.settings);
        setActiveTab(Tab.Settings);
    }

    public void setPurchaseOrder() {
        if (this.purchaseOrder == null) {
            PurchaseOrder purchaseOrder = new PurchaseOrder();
            this.purchaseOrder = purchaseOrder;
            this.purchaseOrder.setDashboard(this);
        }
        setMainPanel(this.purchaseOrder);
        setActiveTab(Tab.Purchase_Order);
    }

    public void setGrn() {
        if (this.grn == null) {
            GRN grn = new GRN();
            this.grn = grn;
            this.grn.setDashboard(this);
        }
        setMainPanel(this.grn);
        setActiveTab(Tab.GRN);
    }

    public void setCustomerRegistration() {
        if (this.customerRegistration == null) {
            CustomerRegistration customerRegistration = new CustomerRegistration();
            this.customerRegistration = customerRegistration;
            this.customerRegistration.setDashboard(this);
        }
        setMainPanel(this.customerRegistration);
        setActiveTab(Tab.Customer_Management);
    }

    public void setSupplierRegistration() {
        if (this.registerSupplier == null) {
            RegisterSupplier registerSupplier = new RegisterSupplier();
            this.registerSupplier = registerSupplier;
            this.registerSupplier.setDashboard(this);
        }
        setMainPanel(this.registerSupplier);
        setActiveTab(Tab.Supplier_Management);
    }

    public void setReport() {
        if (this.report == null) {
            Reports reports = new Reports();
            this.report = reports;
            this.report.setDashboard(this);
        }
        setMainPanel(this.report);
        setActiveTab(Tab.Analytics_AndReports);
    }

    public void setPreorderManagement() {
        if (this.preorderManagement == null) {
            PreorderManagement preorderManagement = new PreorderManagement();
            this.preorderManagement = preorderManagement;
            this.preorderManagement.setDashboard(this);
        }
        setMainPanel(this.preorderManagement);
        setActiveTab(Tab.Pre_Orders);
    }

    public void setReservationManagement() {
        if (this.reservationManagement == null) {
            ReservationManagement reservationManagement = new ReservationManagement();
            this.reservationManagement = reservationManagement;
            this.reservationManagement.setDashboard(this);
        }
        setMainPanel(this.reservationManagement);
        setActiveTab(Tab.Reservations);
    }

    public void setSalesChannel() {
        if (this.salesChannel == null) {
            SalesChannel salesChannel = new SalesChannel();
            this.salesChannel = salesChannel;
            this.salesChannel.setDashboard(this);
        }
        setMainPanel(this.salesChannel);
        setActiveTab(Tab.Sales_Channel);
    }

    public void setDashPanel() {
        setMainPanel(dashPanel);
        setActiveTab(Tab.Dashboard);
        loadDashboardContent();
    }

    private void setMainPanel(JPanel panel) {
        mainPanel.remove(1);
        mainPanel.add(panel);
        SwingUtilities.updateComponentTreeUI(mainPanel);
    }

    private void loadLimitedStock() {
        try {
            jPanel45.removeAll();
            ResultSet result1 = Mysql.execute("SELECT direct_selling_stock.id,`name`,expiry_date,qty,menu_item.image_path "
                    + "from direct_selling_stock INNER JOIN menu_item ON menu_item_id= menu_item.id "
                    + "WHERE qty < 10 OR `expiry_date` < NOW() ");
            while (result1.next()) {
                LimitedStockCard limitedStockCard = new LimitedStockCard();
                limitedStockCard.putClientProperty(FlatClientProperties.STYLE, "border:3,10,3,10,#4D78CC,1,40");
                limitedStockCard.setId(result1.getInt("direct_selling_stock.id"));
                limitedStockCard.setItemName(result1.getString("name"));
                limitedStockCard.setQuantity(result1.getDouble("qty"));
                limitedStockCard.setExpire(result1.getString("expiry_date"));
                limitedStockCard.setImage(result1.getString("menu_item.image_path"));
                jPanel45.add(limitedStockCard);
            }

            jPanel45.updateUI();
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void styleSideBarToggleButton() {
        menuButton.setBackground(new Color(0, 0, 0, 20));
        menuButton.putClientProperty(FlatClientProperties.STYLE, "hoverBackground: rgba(0,0,0,30)");
    }

    @Override
    public void setComponentTheme() {
        styleSideBarToggleButton();
        sidebar.addSidebarButtonStyle();
        CustomStyle.setComponentBackground(jPanel3);

        if (this.user != null && this.user.getRole().equals(UserRole.Role.Admin)) {
            setDashPanelTheme();
        }

        if (salesChannel != null) {
            salesChannel.setComponentTheme();
        }
        
        if(purchaseOrder != null){
            purchaseOrder.setComponentTheme();
        }
        
    }

    private void setCharts() {
        setSalesChart();
        setCategorySalesChart();
    }

    private void setCategorySalesChart() {
        try {
            ResultSet result = Mysql.execute("SELECT menu_item_category.name,SUM(menu_invoice_item.qty) AS amount FROM invoice INNER JOIN menu_invoice_item "
                    + "ON invoice.id = menu_invoice_item.invoice_id INNER JOIN menu_item "
                    + "ON menu_item.id = menu_invoice_item.menu_item_id INNER JOIN menu_item_category "
                    + "ON menu_item_category.id = menu_item.menu_item_category_id GROUP BY menu_item_category.id");

            ResultSet result2 = Mysql.execute("SELECT menu_item_category.name,SUM(direct_invoice_item.qty) AS amount FROM invoice "
                    + "INNER JOIN direct_invoice_item ON invoice.id = direct_invoice_item.invoice_id "
                    + "INNER JOIN direct_selling_stock ON direct_invoice_item.direct_selling_stock_id = direct_selling_stock.id "
                    + "INNER JOIN menu_item ON menu_item.id = direct_selling_stock.menu_item_id "
                    + "INNER JOIN menu_item_category ON menu_item_category.id = menu_item.menu_item_category_id "
                    + "GROUP BY menu_item_category.id");

            HashMap<String, Double> dataMap = new HashMap<>();
            while (result.next()) {
                dataMap.put(result.getString("menu_item_category.name"), result.getDouble("amount"));
            }
            while (result2.next()) {
                dataMap.put(result2.getString("menu_item_category.name"), result2.getDouble("amount"));
            }

            categorySalesChart = createPieChart(dataMap);

            ChartPanel chartPanel = new ChartPanel(categorySalesChart);

            jPanel44.add(chartPanel);
            SwingUtilities.updateComponentTreeUI(jPanel44);
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private JFreeChart createPieChart(HashMap<String, Double> dataMap) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataMap.forEach((key, value) -> {
            dataset.setValue(key + "(" + value + ")", value);
        });

        JFreeChart pieChart = ChartFactory.createPieChart("", dataset, true, false, false);
        PiePlot plot = (PiePlot) pieChart.getPlot();
//        plot.setT
        plot.setBackgroundAlpha(0f);
        plot.setShadowPaint(Pallet.TRANSPARENT);
        plot.setLabelBackgroundPaint(Pallet.TRANSPARENT);
        plot.setLabelShadowPaint(Pallet.TRANSPARENT);
        plot.setLabelOutlinePaint(Pallet.TRANSPARENT);
        plot.setLabelFont(CustomStyle.getCustomFont(13));

        LegendTitle legend = pieChart.getLegend();
        legend.setBackgroundPaint(Pallet.TRANSPARENT);
        legend.setItemFont(CustomStyle.getCustomFont(13));

        return pieChart;
    }

    private void setSalesChart() {
        GregorianCalendar calender = (GregorianCalendar) GregorianCalendar.getInstance();
        String[] months = new String[5];
        double[] amounts = new double[5];
        for (int i = 0; i < 5; i++) {
            try {
                Date dateObj = calender.getTime();
                String date = new SimpleDateFormat("yyyy-MM").format(dateObj);
                String month = new SimpleDateFormat("MMM").format(dateObj);
                ResultSet result = Mysql.execute("SELECT SUM(total-discount) AS 'amount' FROM invoice WHERE `date` LIKE '" + date + "%'");
                if (result.next()) {
                    months[4 - i] = month;
                    amounts[4 - i] = result.getDouble("amount");
                }
                if (calender.get(Calendar.MONTH) + 1 == 1) {
                    calender.roll(Calendar.YEAR, -1);
                }
                calender.roll(GregorianCalendar.MONTH, -1);
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
        salesChart = createBarChart(months, amounts);
        ChartPanel chartPanel = new ChartPanel(salesChart);

        chartPanel1.add(chartPanel);
        SwingUtilities.updateComponentTreeUI(chartPanel1);

    }

    private JFreeChart createBarChart(String[] x_values, double[] y_values) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < x_values.length; i++) {
            dataset.addValue(y_values[i], "", x_values[i]);

        }

        BarRenderer renderer = new BarRenderer();
        renderer.setSeriesPaint(0, new Color(77, 120, 204));
        renderer.setShadowVisible(false);

        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis(), new NumberAxis(), renderer);
        plot.setBackgroundAlpha(0f); //set plot background transparent        

        ValueAxis rangeAxis = plot.getRangeAxis();
        rangeAxis.setTickLabelFont(CustomStyle.getCustomFont(13));

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(CustomStyle.getCustomFont(13));

        return new JFreeChart("", null, plot, false);

    }

    private void setSidebar() {
        sidebar = new Sidebar();
        sidebar.setDashboard(this);
        jPanel1.add(sidebar, BorderLayout.WEST);
        SwingUtilities.updateComponentTreeUI(jPanel1);
        System.out.println(sidebar.getWidth());
    }

    private void closeSidebar() {
        new Thread(() -> {
            for (int i = sidebar.getWidth(); i >= 0; i -= 5) {
                sidebar.setPreferredSize(new Dimension(i, sidebar.getHeight()));
                jPanel1.revalidate();
                try {
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    status.setText("Sidebar closing is Interrupted");
                }
            }
            menuButton.setIcon(new ImageIcon(getClass().getResource("/com/cafe/img/menu-32-green.png")));
            menuButton.revalidate();
        }).start();
    }

    private void openSidebar() {
        new Thread(() -> {
            for (int i = 0; i <= 255; i += 5) {
                sidebar.setPreferredSize(new Dimension(i, sidebar.getHeight()));
                jPanel1.revalidate();
                try {
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    status.setText("Sidebar Opening is Interrupted");
                }
            }
            menuButton.setIcon(new ImageIcon(getClass().getResource("/com/cafe/img/arro-24.png")));
            menuButton.revalidate();
        }).start();
    }

    private void setDateTime() {
        new Thread(() -> {
            while (true) {
                String newDate = new SimpleDateFormat("MMM d, y").format(new Date());
                if (!date.equals(newDate)) {
                    this.date = newDate;
                    jLabel7.setText(this.date);
                }
                jLabel12.setText(new SimpleDateFormat("hh:mm:ss a").format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Splash.logger.log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    private void loadSystemData() {
        setDateTime();
        try {
            ResultSet result = Mysql.execute("SELECT * FROM `system`");
            if (result.next()) {
                jLabel5.setText(result.getString("name"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        jLabel2.setText(this.user.getRole().name() + ":");
        jLabel1.setText(this.user.getDisplay_name());

    }

    public void loadContentByUserRole() {
        if (user.getRole().equals(UserRole.Role.Cashier)) {
            this.setExtendedState(MAXIMIZED_BOTH);
            this.setResizable(false);
            this.sidebar.setCashierContent();

        } else {
            setActiveTab(Tab.Dashboard);
            loadDashboardContent();
        }
    }

    private void loadDashboardContent() {
        setCharts();
        loadLimitedStock();
        loadTopSellingItems();
        setCardData();
        loadInvoices();
        loadGrn();
    }

    private void setDashPanelTheme() {
        CustomStyle.setComponentBackground(
                jPanel21, jPanel23, jPanel26, jPanel29, jPanel33, jPanel34, jPanel36,
                jPanel40, jPanel46, jPanel42, jPanel41, jPanel39
        );

        //sales chart style
        salesChart.setBackgroundPaint(Pallet.BG_CARD);
        CategoryPlot salesChartPlot = (CategoryPlot) salesChart.getPlot();
        if (Pallet.FG_CHART != null) {
            salesChartPlot.getDomainAxis().setTickLabelPaint(Pallet.FG_CHART);
            salesChartPlot.getRangeAxis().setTickLabelPaint(Pallet.FG_CHART);
        }

        //category sales chart style
        categorySalesChart.setBackgroundPaint(Pallet.BG_CARD);
        PiePlot categorySalesCartPlot = (PiePlot) categorySalesChart.getPlot();
        if (Pallet.FG_CHART != null) {
            categorySalesCartPlot.setLabelPaint(Pallet.FG_CHART);
            categorySalesCartPlot.setLabelLinkPaint(Pallet.FG_CHART);
        }

        LegendTitle categorySalesCHartlegend = categorySalesChart.getLegend();
        if (Pallet.FG_CHART != null) {
            categorySalesCHartlegend.setItemPaint(Pallet.FG_CHART);
        }

        for (Component c : jPanel36.getComponents()) {
            c.setBackground(Pallet.BG_CARD);
        }

        //limited stock cards
        for (Component panel : jPanel45.getComponents()) {
            panel.setBackground(Pallet.BG_CARD_PRODUCT);
        }
    }

    public void loadTodayInvoiceCount() {
        try {
            ResultSet resultset = Mysql.execute("SELECT COUNT(*) AS `invoice_count` FROM `invoice` "
                    + "WHERE `date` = '" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "' AND "
                    + "`user_mobile`='" + user.getMobile() + "'");
            if (resultset.next()) {
                jLabel4.setText(resultset.getString("invoice_count"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void setCardData() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        Date today = new Date();
        try {
            ResultSet resultset = Mysql.execute("SELECT SUM(total) AS `total_sales` FROM `invoice` ");
            if (resultset.next()) {
                jLabel10.setText("Rs. " + decimalFormat.format(resultset.getDouble("total_sales")));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "Card 1", ex);
        }

        try {
            ResultSet resultset = Mysql.execute("SELECT SUM(total) AS `total_sales` FROM `invoice` "
                    + "WHERE `date` LIKE '" + new SimpleDateFormat("yyyy-MM").format(today) + "%'");
            if (resultset.next()) {
                jLabel18.setText("Rs. " + decimalFormat.format(resultset.getDouble("total_sales")));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "Card 2", ex);
        }

        try {
            ResultSet resultset = Mysql.execute("SELECT COUNT(*) AS `count` FROM `customer`");
            if (resultset.next()) {
                jLabel22.setText(resultset.getString("count"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "Card 3", ex);
        }

        try {
            ResultSet resultset = Mysql.execute("SELECT COUNT(*) AS `count` FROM `menu_item`");
            if (resultset.next()) {
                jLabel26.setText(resultset.getString("count"));
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "Card 4", ex);
        }

        jLabel13.setText("Updated: " + date);
        jLabel19.setText("Updated: " + date);
        jLabel23.setText("Updated: " + date);
        jLabel27.setText("Updated: " + date);
    }

    public static void alignFrame(JasperViewer jasperViewer, float side) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int frameWidth = jasperViewer.getWidth();
        int frameHeight = jasperViewer.getHeight();

        int x = screenSize.width - frameWidth - (0);
        int y = (screenSize.height - frameHeight) / 2; // Center vertically        

        if (side == LEFT_ALIGNMENT) {
            x = 0;
        }
        jasperViewer.setLocation(x, y);
    }

    private void loadInvoices() {
        try {
            ResultSet result = Mysql.execute("SELECT id,date,invoice.total,invoice.discount,user_mobile FROM  invoice ORDER BY `date` DESC LIMIT 9");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (result.next()) {
                Vector v = new Vector<>();
                v.add(result.getString("id"));
                v.add(result.getString("date"));
                v.add(result.getString("discount"));
                v.add(result.getString("total"));
                v.add(result.getString("user_mobile"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void loadGrn() {
        try {
            ResultSet result = Mysql.execute("SELECT direct_selling_grn.id,`date`,total,direct_selling_grn.supplier_mobile,payment_method.name "
                    + "FROM direct_selling_grn INNER JOIN payment_method ON payment_method.id = direct_selling_grn.payment_method_id");

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            while (result.next()) {
                Vector v = new Vector<>();
                v.add(result.getString("direct_selling_grn.id"));
                v.add(result.getString("date"));
                v.add(result.getString("total"));
                v.add(result.getString("direct_selling_grn.supplier_mobile"));
                v.add(result.getString("payment_method.name"));
                model.addRow(v);
            }
            jTable2.setModel(model);
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

}
