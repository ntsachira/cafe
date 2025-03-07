/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class AddMenuItemsTest {
    
    public AddMenuItemsTest() {
    }

    /**
     * Test of setMenuMangement method, of class AddMenuItems.
     */
    @Test
    public void testSetMenuMangement() {
        System.out.println("setMenuMangement");
        MenuMangement menuMangement = null;
        AddMenuItems instance = new AddMenuItems(new JFrame(), true);
        instance.setMenuMangement(menuMangement);
    }

    /**
     * Test of setStyle method, of class AddMenuItems.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        AddMenuItems instance = new AddMenuItems(new JFrame(), true);
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class AddMenuItems.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        AddMenuItems instance = new AddMenuItems(new JFrame(), true);
        instance.setComponentTheme();
    }
    
}
