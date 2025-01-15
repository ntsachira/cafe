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
public class AnalyticsTest {
    
    public AnalyticsTest() {
    }

    /**
     * Test of getDashboard method, of class Analytics.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        Analytics instance = new Analytics();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class Analytics.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        Analytics instance = new Analytics();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of setStyle method, of class Analytics.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        Analytics instance = new Analytics();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class Analytics.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        Analytics instance = new Analytics();
        instance.setComponentTheme();
    }
    
}
