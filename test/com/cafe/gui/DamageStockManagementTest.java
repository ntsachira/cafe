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
public class DamageStockManagementTest {
    
    public DamageStockManagementTest() {
    }

    /**
     * Test of getDashboard method, of class DamageStockManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        DamageStockManagement instance = new DamageStockManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class DamageStockManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        DamageStockManagement instance = new DamageStockManagement();
        instance.setDashboard(dashboard);
    }
    
}
