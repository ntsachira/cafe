/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.Tabs;
import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class DashboardTest {
    
    public DashboardTest() {
    }

    //Test of getUser method, of class Dashboard.
    @Test
    public void testGetUser() {
        System.out.println("getUser");      
        User user = new User();      
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        User expResult = user;
        User result = instance.getUser();
        assertEquals(expResult, result);
    }

    //Test of setUser method, of class Dashboard.    
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =   new Dashboard(user);
        instance.setUser(user);
    }

    // Test of setActiveTab method, of class Dashboard.    
    @Test
    public void testSetActiveTab() {
        System.out.println("setActiveTab");
        Tabs.Tab activeTab = Tabs.Tab.Dashboard;
        User user = new User();   
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setActiveTab(activeTab);
    }

    //Test of getActiveTab method, of class Dashboard.
    @Test
    public void testGetActiveTab() {
        System.out.println("getActiveTab");        
        User user = new User();      
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        Tabs.Tab expResult = Tabs.Tab.Dashboard;
        Tabs.Tab result = instance.getActiveTab();
        assertEquals(expResult, result);
    }

    //Test of setWarningStatus method, of class Dashboard.
    @Test
    public void testSetWarningStatus() {
        System.out.println("setWarningStatus");
        String systemStatus = "";
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setWarningStatus(systemStatus);
    }

    //Test of setSuccessStatus method, of class Dashboard.
    @Test
    public void testSetSuccessStatus() {
        System.out.println("setSuccessStatus");
        String systemStatus = "";
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setMode(Theme.Mode.DARK);
        instance.setSuccessStatus(systemStatus);
    }

    // Test of arrangeTitle method, of class Dashboard.
    @Test
    public void testArrangeTitle() {
        System.out.println("arrangeTitle");
        String tabName = "";
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        String expResult = "";
        String result = instance.arrangeTitle(tabName);
        assertEquals(expResult, result);
    }

    //Test of main method, of class Dashboard.
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dashboard.main(args);
    }

    //Test of setStyle method, of class Dashboard.
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setStyle();
    }

    //Test of setDefaultSystemStatus method, of class Dashboard.
    @Test
    public void testSetDefaultSystemStatus() {
        System.out.println("setDefaultSystemStatus");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setDefaultSystemStatus();
    }

    //Test of setDarkModeIcons method, of class Dashboard.
    @Test
    public void testSetDarkModeIcons() {
        System.out.println("setDarkModeIcons");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setDarkModeIcons();
    }

    //Test of setLightModeIcons method, of class Dashboard.
    @Test
    public void testSetLightModeIcons() {
        System.out.println("setLightModeIcons");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setLightModeIcons();
    }

    //Test of getSalesChannel method, of class Dashboard.
    @Test
    public void testGetSalesChannel() {
        System.out.println("getSalesChannel");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        SalesChannel expResult = null;
        SalesChannel result = instance.getSalesChannel();
        assertEquals(expResult, result);
    }

    //Test of setDamagedStock method, of class Dashboard.
    @Test
    public void testSetDamagedStock() {
        System.out.println("setDamagedStock");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setDamagedStock();
    }

    //Test of setCategoryManagement method, of class Dashboard.
    @Test
    public void testSetCategoryManagement() {
        System.out.println("setCategoryManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setCategoryManagement();
    }

    //Test of setUserAvtivity method, of class Dashboard.
    @Test
    public void testSetUserAvtivity() {
        System.out.println("setUserAvtivity");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setUserAvtivity();
    }

    //Test of setDiscount method, of class Dashboard.
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setDiscount();
    }

    //Test of setUserManagement method, of class Dashboard.
    @Test
    public void testSetUserManagement() {
        System.out.println("setUserManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setUserManagement();
    }

    //Test of setMenuManagement method, of class Dashboard.
    @Test
    public void testSetMenuManagement() {
        System.out.println("setMenuManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setMenuManagement();
    }

    //Test of setTableManagement method, of class Dashboard.
    @Test
    public void testSetTableManagement() {
        System.out.println("setTableManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setTableManagement();
    }

    //Test of setSettings method, of class Dashboard.
    @Test
    public void testSetSettings() {
        System.out.println("setSettings");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setSettings();
    }

    //Test of setPurchaseOrder method, of class Dashboard.
    @Test
    public void testSetPurchaseOrder() {
        System.out.println("setPurchaseOrder");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setPurchaseOrder();
    }

    //Test of setGrn method, of class Dashboard.
    @Test
    public void testSetGrn() {
        System.out.println("setGrn");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setGrn();
    }

    //Test of setCustomerRegistration method, of class Dashboard.
    @Test
    public void testSetCustomerRegistration() {
        System.out.println("setCustomerRegistration");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setCustomerRegistration();
    }

    //Test of setSupplierRegistration method, of class Dashboard.
    @Test
    public void testSetSupplierRegistration() {
        System.out.println("setSupplierRegistration");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setSupplierRegistration();
    }

    //Test of setReport method, of class Dashboard.
    @Test
    public void testSetReport() {
        System.out.println("setReport");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setMode(Theme.Mode.LIGHT);
        instance.setAnalytics();
    }

    //Test of setPreorderManagement method, of class Dashboard.
    @Test
    public void testSetPreorderManagement() {
        System.out.println("setPreorderManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setPreorderManagement();
    }

    //Test of setReservationManagement method, of class Dashboard.
    @Test
    public void testSetReservationManagement() {
        System.out.println("setReservationManagement");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setReservationManagement();
    }

    //Test of setSalesChannel method, of class Dashboard.
    @Test
    public void testSetSalesChannel() {
        System.out.println("setSalesChannel");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setSalesChannel();
    }

    //Test of setDashPanel method, of class Dashboard.
    @Test
    public void testSetDashPanel() {
        System.out.println("setDashPanel");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.setDashPanel();
    }

    //Test of setComponentTheme method, of class Dashboard.
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user);        
        instance.setComponentTheme();
    }

    //Test of loadContentByUserRole method, of class Dashboard.
    @Test
    public void testLoadContentByUserRole() {
        System.out.println("loadContentByUserRole");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.loadContentByUserRole();
    }

    //Test of loadTodayInvoiceCount method, of class Dashboard.
    @Test
    public void testLoadTodayInvoiceCount() {
        System.out.println("loadTodayInvoiceCount");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard instance =  new Dashboard(user); 
        instance.loadTodayInvoiceCount();
    }

    //Test of alignFrame method, of class Dashboard.
    @Test
    public void testAlignFrame() {
        System.out.println("alignFrame");
        JasperViewer jasperViewer = new JasperViewer(new JasperPrint(), false);
        float side = 0.0F;
        Dashboard.alignFrame(jasperViewer, side);
    }
    
}
