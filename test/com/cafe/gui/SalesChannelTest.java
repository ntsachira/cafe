/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.OrderType;
import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SalesChannelTest {
    
    public SalesChannelTest() {
    }

    /**
     * Test of getUser method, of class SalesChannel.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        SalesChannel instance = new SalesChannel();
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        instance.setDashboard(dashboard);
        User expResult = user;
        User result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class SalesChannel.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        SalesChannel instance = new SalesChannel();
        instance.setUser(user);
    }

    /**
     * Test of getInvoiceItems method, of class SalesChannel.
     */
    @Test
    public void testGetInvoiceItems() {
        System.out.println("getInvoiceItems");
        SalesChannel instance = new SalesChannel();        
        List<InvoiceItemCard> expResult = new ArrayList<>();
        List<InvoiceItemCard> result = instance.getInvoiceItems();
        assertEquals(expResult, result);
    }

    /**
     * Test of getActiveCategory method, of class SalesChannel.
     */
    @Test
    public void testGetActiveCategory() {
        System.out.println("getActiveCategory");
        SalesChannel instance = new SalesChannel();        
        String expResult = "";
        String result = instance.getActiveCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalItems method, of class SalesChannel.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        SalesChannel instance = new SalesChannel();
        instance.setTotalItems(0);
        int expResult = 0;
        int result = instance.getTotalItems();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBillTotal method, of class SalesChannel.
     */
    @Test
    public void testGetBillTotal() {
        System.out.println("getBillTotal");
        SalesChannel instance = new SalesChannel();
        instance.setBillTotal(0);
        double expResult = 0.0;
        double result = instance.getBillTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setBillTotal method, of class SalesChannel.
     */
    @Test
    public void testSetBillTotal() {
        System.out.println("setBillTotal");
        double billTotal = 0.0;
        SalesChannel instance = new SalesChannel();
        instance.setBillTotal(billTotal);
    }

    /**
     * Test of setTotalItems method, of class SalesChannel.
     */
    @Test
    public void testSetTotalItems() {
        System.out.println("setTotalItems");
        int totalItems = 0;
        SalesChannel instance = new SalesChannel();
        instance.setTotalItems(totalItems);
    }

    /**
     * Test of getTotalDiscount method, of class SalesChannel.
     */
    @Test
    public void testGetTotalDiscount() {
        System.out.println("getTotalDiscount");
        SalesChannel instance = new SalesChannel();
        instance.setTotalDiscount(0);
        double expResult = 0.0;
        double result = instance.getTotalDiscount();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setTotalDiscount method, of class SalesChannel.
     */
    @Test
    public void testSetTotalDiscount() {
        System.out.println("setTotalDiscount");
        double totalDiscount = 0.0;
        SalesChannel instance = new SalesChannel();
        instance.setTotalDiscount(totalDiscount);
    }

    /**
     * Test of getDashboard method, of class SalesChannel.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        SalesChannel instance = new SalesChannel();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class SalesChannel.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        SalesChannel instance = new SalesChannel();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of setItemsPerRow method, of class SalesChannel.
     */
    @Test
    public void testSetItemsPerRow() {
        System.out.println("setItemsPerRow");
        int itemsPerRow = 6;
        SalesChannel instance = new SalesChannel();
        instance.setItemsPerRow(itemsPerRow);
    }

    /**
     * Test of getOrderType method, of class SalesChannel.
     */
    @Test
    public void testGetOrderType() {
        System.out.println("getOrderType");
        SalesChannel instance = new SalesChannel();
        instance.setOrderType(OrderType.Order.RESERVE);
        OrderType.Order expResult = OrderType.Order.RESERVE;
        OrderType.Order result = instance.getOrderType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrderType method, of class SalesChannel.
     */
    @Test
    public void testSetOrderType() {
        System.out.println("setOrderType");
        OrderType.Order orderType = null;
        SalesChannel instance = new SalesChannel();
        instance.setOrderType(orderType);
    }

    /**
     * Test of setTakeAwayActive method, of class SalesChannel.
     */
    @Test
    public void testSetTakeAwayActive() {
        System.out.println("setTakeAwayActive");
        SalesChannel instance = new SalesChannel();
        instance.setTakeAwayActive();
    }

    /**
     * Test of refreshSalesChannelData method, of class SalesChannel.
     */
    @Test
    public void testRefreshSalesChannelData() {
        System.out.println("refreshSalesChannelData");
        SalesChannel instance = new SalesChannel();
        instance.refreshSalesChannelData();
    }

    /**
     * Test of loadMenuItems method, of class SalesChannel.
     */
    @Test
    public void testLoadMenuItems() {
        System.out.println("loadMenuItems");
        SalesChannel instance = new SalesChannel();
        instance.loadMenuItems();
    }

    /**
     * Test of setStyle method, of class SalesChannel.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        SalesChannel instance = new SalesChannel();
        instance.setStyle();
    }

    /**
     * Test of loadInvoiceItems method, of class SalesChannel.
     */
    @Test
    public void testLoadInvoiceItems() {
        System.out.println("loadInvoiceItems");
        InvoiceItemCard invoiceItem = new InvoiceItemCard();
        invoiceItem.setBrand("");
        SalesChannel instance = new SalesChannel();
        instance.loadInvoiceItems(invoiceItem);
    }

    /**
     * Test of removeInvoiceItem method, of class SalesChannel.
     */
    @Test
    public void testRemoveInvoiceItem() {
        System.out.println("removeInvoiceItem");
        InvoiceItemCard invoiceItem = new InvoiceItemCard();
        SalesChannel instance = new SalesChannel();
        instance.removeInvoiceItem(invoiceItem);
    }

    /**
     * Test of setCategory method, of class SalesChannel.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        SalesChannel instance = new SalesChannel();
        instance.setCategory(category);
    }

    /**
     * Test of calculateBill method, of class SalesChannel.
     */
    @Test
    public void testCalculateBill() {
        System.out.println("calculateBill");
        SalesChannel instance = new SalesChannel();
        instance.calculateBill();
    }

    /**
     * Test of setComponentTheme method, of class SalesChannel.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        SalesChannel instance = new SalesChannel();
        instance.setComponentTheme();
    }

    /**
     * Test of resetInvoice method, of class SalesChannel.
     */
    @Test
    public void testResetInvoice() {
        System.out.println("resetInvoice");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel instance = new SalesChannel();
        instance.setDashboard(dashboard);
        instance.resetInvoice();
    }
    
}
