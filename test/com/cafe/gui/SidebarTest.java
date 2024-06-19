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
public class SidebarTest {
    
    public SidebarTest() {
    }

    /**
     * Test of addSidebarButtonStyle method, of class Sidebar.
     */
    @Test
    public void testAddSidebarButtonStyle() {
        System.out.println("addSidebarButtonStyle");
        Sidebar instance = new Sidebar();
        instance.addSidebarButtonStyle();
    }

    /**
     * Test of getDashboard method, of class Sidebar.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        Sidebar instance = new Sidebar();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class Sidebar.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        Sidebar instance = new Sidebar();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of logOut method, of class Sidebar.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        Sidebar instance = new Sidebar();
        instance.logOut();
    }    

    /**
     * Test of setCashierContent method, of class Sidebar.
     */
    @Test
    public void testSetCashierContent() {
        System.out.println("setCashierContent");
        Sidebar instance = new Sidebar();
        instance.setCashierContent();
    }
    
}
