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
public class InvoiceItemCardTest {
    
    public InvoiceItemCardTest() {
    }

    /**
     * Test of getBrand method, of class InvoiceItemCard.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setBrand("");
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBrand method, of class InvoiceItemCard.
     */
    @Test
    public void testSetBrand() {
        System.out.println("setBrand");
        String brand = "";
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setBrand(brand);
    }

    /**
     * Test of getId method, of class InvoiceItemCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        InvoiceItemCard instance = new InvoiceItemCard();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class InvoiceItemCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setId(id);
    }

    /**
     * Test of getDiscount method, of class InvoiceItemCard.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        InvoiceItemCard instance = new InvoiceItemCard();
        double expResult = 0.0;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setDiscount method, of class InvoiceItemCard.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        double discount = 0.0;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setDiscount(discount);
    }

    /**
     * Test of getItemName method, of class InvoiceItemCard.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setItemName("");
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class InvoiceItemCard.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setItemName(itemName);
    }

    /**
     * Test of getPrice method, of class InvoiceItemCard.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        InvoiceItemCard instance = new InvoiceItemCard();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrice method, of class InvoiceItemCard.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setPrice(price);
    }

    /**
     * Test of getQuantity method, of class InvoiceItemCard.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        InvoiceItemCard instance = new InvoiceItemCard();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setQuantity method, of class InvoiceItemCard.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double quantity = 0.0;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setQuantity(quantity);
    }

    /**
     * Test of setTotal method, of class InvoiceItemCard.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        Double total = null;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setTotal(total);
    }

    /**
     * Test of getTotal method, of class InvoiceItemCard.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setTotal(0.0);
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSalesChannel method, of class InvoiceItemCard.
     */
    @Test
    public void testSetSalesChannel() {
        System.out.println("setSalesChannel");
        SalesChannel salesChannel = null;
        InvoiceItemCard instance = new InvoiceItemCard();
        instance.setSalesChannel(salesChannel);
    }
    
}
