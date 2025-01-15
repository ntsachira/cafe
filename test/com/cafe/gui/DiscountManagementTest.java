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
public class DiscountManagementTest {
    
    public DiscountManagementTest() {
    }

    /**
     * Test of getDashboard method, of class DiscountManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        DiscountManagement instance = new DiscountManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class DiscountManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        DiscountManagement instance = new DiscountManagement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of setStyle method, of class DiscountManagement.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        DiscountManagement instance = new DiscountManagement();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class DiscountManagement.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        DiscountManagement instance = new DiscountManagement();
        instance.setComponentTheme();
    }
    
}
