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
public class CategoryManagementTest {
    
    public CategoryManagementTest() {
    }

    /**
     * Test of getDashboard method, of class CategoryManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        CategoryManagement instance = new CategoryManagement();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class CategoryManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        CategoryManagement instance = new CategoryManagement();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of loadCategories method, of class CategoryManagement.
     */
    @Test
    public void testLoadCategories() {
        System.out.println("loadCategories");
        CategoryManagement instance = new CategoryManagement();
        instance.loadCategories();
    }

    /**
     * Test of setStyle method, of class CategoryManagement.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        CategoryManagement instance = new CategoryManagement();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class CategoryManagement.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        CategoryManagement instance = new CategoryManagement();
        instance.setComponentTheme();
    }
    
}
