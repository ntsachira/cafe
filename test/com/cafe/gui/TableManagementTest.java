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
public class TableManagementTest {
    
    public TableManagementTest() {
    }

    /**
     * Test of setItemsPerRow method, of class TableManagement.
     */
    @Test
    public void testSetItemsPerRow() {
        System.out.println("setItemsPerRow");
        int itemsPerRow = 6;
        TableManagement instance = new TableManagement();
        instance.setItemsPerRow(itemsPerRow);
    }

    /**
     * Test of getDashboard method, of class TableManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        TableManagement instance = new TableManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class TableManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        TableManagement instance = new TableManagement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of loadTables method, of class TableManagement.
     */
    @Test
    public void testLoadTables() {
        System.out.println("loadTables");
        TableManagement instance = new TableManagement();
        instance.loadTables();
    }

    /**
     * Test of setStyle method, of class TableManagement.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        TableManagement instance = new TableManagement();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class TableManagement.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        TableManagement instance = new TableManagement();
        instance.setComponentTheme();
    }
    
}
