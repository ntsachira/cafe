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
public class UserManagementTest {
    
    public UserManagementTest() {
    }

    /**
     * Test of getDashboard method, of class UserManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        UserManagement instance = new UserManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class UserManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        UserManagement instance = new UserManagement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of setStyle method, of class UserManagement.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        UserManagement instance = new UserManagement();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class UserManagement.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        UserManagement instance = new UserManagement();
        instance.setComponentTheme();
    }
    
}
