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
public class SupplierManagementTest {
    
    public SupplierManagementTest() {
    }

    /**
     * Test of getDashboard method, of class SupplierManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        SupplierManagement instance = new SupplierManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class SupplierManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        SupplierManagement instance = new SupplierManagement();
        instance.setDashboard(dashboard);
    }
    
}
