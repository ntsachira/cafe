
package com.cafe.gui;

import org.junit.Test;
import static org.junit.Assert.*;

public class PreorderManagementTest {
    
    public PreorderManagementTest() {
    }

    /**
     * Test of getDashboard method, of class PreorderManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        PreorderManagement instance = new PreorderManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDashboard method, of class PreorderManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        PreorderManagement instance = new PreorderManagement();
        instance.setDashboard(dashboard);        
    }
    
}
