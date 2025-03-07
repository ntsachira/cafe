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
public class MenuMangementTest {
    
    public MenuMangementTest() {
    }

    /**
     * Test of getDashboard method, of class MenuMangement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        MenuMangement instance = new MenuMangement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class MenuMangement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        MenuMangement instance = new MenuMangement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of loadMenuItems method, of class MenuMangement.
     */
    @Test
    public void testLoadMenuItems() {
        System.out.println("loadMenuItems");
        String query = "";
        MenuMangement instance = new MenuMangement();
        instance.loadMenuItems(query);
    }

    /**
     * Test of setStyle method, of class MenuMangement.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        MenuMangement instance = new MenuMangement();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class MenuMangement.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        MenuMangement instance = new MenuMangement();
        instance.setComponentTheme();
    }

    /**
     * Test of search method, of class MenuMangement.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        MenuMangement instance = new MenuMangement();
        instance.search();
    }
    
}
