/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import javax.swing.JPanel;
import main.JImagePanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class MenuCategoryCardTest {
    
    public MenuCategoryCardTest() {
    }

    /**
     * Test of isSelected method, of class MenuCategoryCard.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        MenuCategoryCard instance = new MenuCategoryCard();
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelected method, of class MenuCategoryCard.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = false;
        MenuCategoryCard instance = new MenuCategoryCard();
        instance.setSelected(selected);
    }

    /**
     * Test of getjImagePanel1 method, of class MenuCategoryCard.
     */
    @Test
    public void testGetjImagePanel1() {
        System.out.println("getjImagePanel1");
        MenuCategoryCard instance = new MenuCategoryCard();
        JImagePanel expResult = instance.getjImagePanel1();
        JImagePanel result = instance.getjImagePanel1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getjPanel1 method, of class MenuCategoryCard.
     */
    @Test
    public void testGetjPanel1() {
        System.out.println("getjPanel1");
        MenuCategoryCard instance = new MenuCategoryCard();
        JPanel expResult = instance.getjPanel1();
        JPanel result = instance.getjPanel1();
        assertEquals(expResult, result);
    }
    
}
