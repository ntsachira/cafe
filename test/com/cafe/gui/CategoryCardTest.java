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
public class CategoryCardTest {
    
    public CategoryCardTest() {
    }

    /**
     * Test of getId method, of class CategoryCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CategoryCard instance = new CategoryCard();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class CategoryCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CategoryCard instance = new CategoryCard();
        instance.setId(id);
    }

    /**
     * Test of getCategoryName method, of class CategoryCard.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        CategoryCard instance = new CategoryCard();
        instance.setCategoryName("");
        String expResult = "";
        String result = instance.getCategoryName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoryName method, of class CategoryCard.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String categoryName = "";
        CategoryCard instance = new CategoryCard();
        instance.setCategoryName(categoryName);
    }

    /**
     * Test of setSalesChannel method, of class CategoryCard.
     */
    @Test
    public void testSetSalesChannel() {
        System.out.println("setSalesChannel");
        SalesChannel salesChannel = null;
        CategoryCard instance = new CategoryCard();
        instance.setSalesChannel(salesChannel);
    }

    /**
     * Test of setImage method, of class CategoryCard.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String path = "";
        CategoryCard instance = new CategoryCard();
        instance.setImage(path);
    }

    /**
     * Test of setNumberofItems method, of class CategoryCard.
     */
    @Test
    public void testSetNumberofItems() {
        System.out.println("setNumberofItems");
        String count = "";
        CategoryCard instance = new CategoryCard();
        instance.setNumberofItems(count);
    }
    
}
