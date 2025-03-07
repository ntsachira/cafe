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
public class CustomerRegistrationTest {
    
    public CustomerRegistrationTest() {
    }

    /**
     * Test of getDashboard method, of class CustomerRegistration.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        CustomerRegistration instance = new CustomerRegistration(null);
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class CustomerRegistration.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        CustomerRegistration instance = new CustomerRegistration(null);
        instance.setDashboard(dashboard);
    }
    
}
