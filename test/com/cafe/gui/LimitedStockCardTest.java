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
public class LimitedStockCardTest {
    
    public LimitedStockCardTest() {
    }

    /**
     * Test of setDashboard method, of class LimitedStockCard.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        LimitedStockCard instance = new LimitedStockCard();
        instance.setDashboard(dashboard);
    }

    /**
     * Test of getStock method, of class LimitedStockCard.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        LimitedStockCard instance = new LimitedStockCard();
        LimitedStockCard.Stock expResult = null;
        LimitedStockCard.Stock result = instance.getStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStock method, of class LimitedStockCard.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        LimitedStockCard.Stock stock = null;
        LimitedStockCard instance = new LimitedStockCard();
        instance.setStock(stock);
    }

    /**
     * Test of setImage method, of class LimitedStockCard.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String path = "";
        LimitedStockCard instance = new LimitedStockCard();
        instance.setImage(path);
    }

    /**
     * Test of getItemName method, of class LimitedStockCard.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        LimitedStockCard instance = new LimitedStockCard();
        instance.setItemName("");
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class LimitedStockCard.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        LimitedStockCard instance = new LimitedStockCard();
        instance.setItemName(itemName);
    }

    /**
     * Test of getId method, of class LimitedStockCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        LimitedStockCard instance = new LimitedStockCard();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class LimitedStockCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        LimitedStockCard instance = new LimitedStockCard();
        instance.setId(id);
    }

    /**
     * Test of getQuantity method, of class LimitedStockCard.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        LimitedStockCard instance = new LimitedStockCard();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setQuantity method, of class LimitedStockCard.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double quantity = 0.0;
        LimitedStockCard instance = new LimitedStockCard();
        instance.setQuantity(quantity);
    }

    /**
     * Test of getExpire method, of class LimitedStockCard.
     */
    @Test
    public void testGetExpire() {
        System.out.println("getExpire");
        LimitedStockCard instance = new LimitedStockCard();
        instance.setExpire("");
        String expResult = "";
        String result = instance.getExpire();
        assertEquals(expResult, result);
    }

    /**
     * Test of setExpire method, of class LimitedStockCard.
     */
    @Test
    public void testSetExpire() {
        System.out.println("setExpire");
        String expire = "";
        LimitedStockCard instance = new LimitedStockCard();
        instance.setExpire(expire);
    }
    
}
