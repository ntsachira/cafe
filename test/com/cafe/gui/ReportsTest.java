
package com.cafe.gui;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReportsTest {
    
    public ReportsTest() {
    }

    /**
     * Test of getDashboard method, of class Reports.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        Reports instance = new Reports();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class Reports.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        Reports instance = new Reports();
        instance.setDashboard(dashboard);
    }
    
}
