
package com.cafe.gui;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReservationManagementTest {
    
    public ReservationManagementTest() {
    }

    /**
     * Test of getDashboard method, of class ReservationManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        ReservationManagement instance = new ReservationManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class ReservationManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        ReservationManagement instance = new ReservationManagement();
        instance.setDashboard(dashboard);
    }
    
}
