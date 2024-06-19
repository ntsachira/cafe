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
public class ReservationManagementTest {
    
    public ReservationManagementTest() {
    }

    /**
     * Test of getDashboard method, of class ReservationManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        ReservationManagement instance = new ReservationManagement(null);
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setCustomer method, of class ReservationManagement.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        String mobile = "";
        ReservationManagement instance = new ReservationManagement(null);
        boolean expResult = true;
        boolean result = instance.setCustomer(mobile);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class ReservationManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        ReservationManagement instance = new ReservationManagement(null);
        instance.setDashboard(dashboard);
    }
    
}
