/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class MenuItemCardTest {
    
    public MenuItemCardTest() {
    }

    /**
     * Test of setStyle method, of class MenuItemCard.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        MenuItemCard instance = new MenuItemCard();
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class MenuItemCard.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        MenuItemCard instance = new MenuItemCard();
        instance.setComponentTheme();
    }

    /**
     * Test of getName method, of class MenuItemCard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MenuItemCard instance = new MenuItemCard();
        instance.setName("");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class MenuItemCard.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MenuItemCard instance = new MenuItemCard();
        instance.setName(name);
    }

    /**
     * Test of getPrice method, of class MenuItemCard.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        MenuItemCard instance = new MenuItemCard();
        instance.setPrice("");
        String expResult = "";
        String result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class MenuItemCard.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        String price = "";
        MenuItemCard instance = new MenuItemCard();
        instance.setPrice(price);
    }

    /**
     * Test of getImage method, of class MenuItemCard.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        MenuItemCard instance = new MenuItemCard();
        ImageIcon expResult = null;
        ImageIcon result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImage method, of class MenuItemCard.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ImageIcon image = null;
        MenuItemCard instance = new MenuItemCard();
        instance.setImage(image);
    }

    /**
     * Test of getCategory method, of class MenuItemCard.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        MenuItemCard instance = new MenuItemCard();
        instance.setCategory("");
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategory method, of class MenuItemCard.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        MenuItemCard instance = new MenuItemCard();
        instance.setCategory(category);
    }

    /**
     * Test of isStatus method, of class MenuItemCard.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        MenuItemCard instance = new MenuItemCard();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class MenuItemCard.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        MenuItemCard instance = new MenuItemCard();
        instance.setStatus(status);
    }

    /**
     * Test of getBrand method, of class MenuItemCard.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        MenuItemCard instance = new MenuItemCard();
        instance.setBrand("");
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBrand method, of class MenuItemCard.
     */
    @Test
    public void testSetBrand() {
        System.out.println("setBrand");
        String brand = "";
        MenuItemCard instance = new MenuItemCard();
        instance.setBrand(brand);
    }

    /**
     * Test of getMenuItemId method, of class MenuItemCard.
     */
    @Test
    public void testGetMenuItemId() {
        System.out.println("getMenuItemId");
        MenuItemCard instance = new MenuItemCard();
        instance.setMenuItemId(0);
        int expResult = 0;
        int result = instance.getMenuItemId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMenuItemId method, of class MenuItemCard.
     */
    @Test
    public void testSetMenuItemId() {
        System.out.println("setMenuItemId");
        int menuItemId = 0;
        MenuItemCard instance = new MenuItemCard();
        instance.setMenuItemId(menuItemId);
    }

    /**
     * Test of setDashboard method, of class MenuItemCard.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        MenuItemCard instance = new MenuItemCard();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of setMenuMangement method, of class MenuItemCard.
     */
    @Test
    public void testSetMenuMangement() {
        System.out.println("setMenuMangement");
        MenuMangement menuMangement = null;
        MenuItemCard instance = new MenuItemCard();
        instance.setMenuMangement(menuMangement);
    }

    /**
     * Test of getMenuMangement method, of class MenuItemCard.
     */
    @Test
    public void testGetMenuMangement() {
        System.out.println("getMenuMangement");
        MenuItemCard instance = new MenuItemCard();
        MenuMangement expResult = null;
        MenuMangement result = instance.getMenuMangement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDashboard method, of class MenuItemCard.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        MenuItemCard instance = new MenuItemCard();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of reloadData method, of class MenuItemCard.
     */
    @Test
    public void testReloadData() {
        System.out.println("reloadData");
        MenuItemCard instance = new MenuItemCard();
        instance.reloadData();
    }
    
}
