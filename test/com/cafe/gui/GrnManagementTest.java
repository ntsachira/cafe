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
public class GrnManagementTest {
    
    public GrnManagementTest() {
    }

    /**
     * Test of getDashboard method, of class GrnManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        GrnManagement instance = new GrnManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class GrnManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        GrnManagement instance = new GrnManagement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of initializeUI method, of class GrnManagement.
     */
    @Test
    public void testInitializeUI() {
        System.out.println("initializeUI");
        GrnManagement instance = new GrnManagement();
        instance.initializeUI();
    }

    /**
     * Test of loadItems method, of class GrnManagement.
     */
    @Test
    public void testLoadItems() {
        System.out.println("loadItems");
        GrnManagement instance = new GrnManagement();
        instance.loadItems();
    }
    
}
