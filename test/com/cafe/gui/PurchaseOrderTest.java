/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class PurchaseOrderTest {
    
    public PurchaseOrderTest() {
    }

    /**
     * Test of setSelectedItem method, of class PurchaseOrder.
     */
    @Test
    public void testSetSelectedItem() {
        System.out.println("setSelectedItem");
        ItemCard selectedItem = null;
        PurchaseOrder instance = new PurchaseOrder();
        instance.setSelectedItem(selectedItem);
    }

    /**
     * Test of setItemType method, of class PurchaseOrder.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        PurchaseOrder.ItemType itemType = null;
        PurchaseOrder instance = new PurchaseOrder();
        instance.setItemType(itemType);
    }

    /**
     * Test of getItemType method, of class PurchaseOrder.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        PurchaseOrder instance = new PurchaseOrder();
        instance.setItemType(null);
        PurchaseOrder.ItemType expResult = null;
        PurchaseOrder.ItemType result = instance.getItemType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemsPerRow method, of class PurchaseOrder.
     */
    @Test
    public void testSetItemsPerRow() {
        System.out.println("setItemsPerRow");
        int itemsPerRow = 0;
        PurchaseOrder instance = new PurchaseOrder();
        instance.setItemsPerRow(itemsPerRow);
    }

    /**
     * Test of getDashboard method, of class PurchaseOrder.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        PurchaseOrder instance = new PurchaseOrder();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class PurchaseOrder.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        PurchaseOrder instance = new PurchaseOrder();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of loadDirrectSellingItems method, of class PurchaseOrder.
     */
    @Test
    public void testLoadDirrectSellingItems() {
        System.out.println("loadDirrectSellingItems");
        PurchaseOrder instance = new PurchaseOrder();
        instance.loadDirrectSellingItems();
    }

    /**
     * Test of setStyle method, of class PurchaseOrder.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        PurchaseOrder instance = new PurchaseOrder();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class PurchaseOrder.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        PurchaseOrder instance = new PurchaseOrder();
        instance.setComponentTheme();
    }
    
}
