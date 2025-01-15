/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import javax.swing.JLabel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class ItemCardTest {
    
    public ItemCardTest() {
    }

    /**
     * Test of getUnitOfMeasureId method, of class ItemCard.
     */
    @Test
    public void testGetUnitOfMeasureId() {
        System.out.println("getUnitOfMeasureId");
        ItemCard instance = new ItemCard();
        instance.setUnitOfMeasureId("");
        String expResult = "";
        String result = instance.getUnitOfMeasureId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnitOfMeasureId method, of class ItemCard.
     */
    @Test
    public void testSetUnitOfMeasureId() {
        System.out.println("setUnitOfMeasureId");
        String unitOfMeasureId = "";
        ItemCard instance = new ItemCard();
        instance.setUnitOfMeasureId(unitOfMeasureId);
    }

    /**
     * Test of getItemType method, of class ItemCard.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        ItemCard instance = new ItemCard();
        PurchaseOrder.ItemType expResult = null;
        PurchaseOrder.ItemType result = instance.getItemType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getjLabel2 method, of class ItemCard.
     */
    @Test
    public void testGetjLabel2() {
        System.out.println("getjLabel2");
        ItemCard instance = new ItemCard();
        JLabel expResult = instance.getjLabel2();
        JLabel result = instance.getjLabel2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setjLabel2 method, of class ItemCard.
     */
    @Test
    public void testSetjLabel2() {
        System.out.println("setjLabel2");
        JLabel jLabel2 = null;
        ItemCard instance = new ItemCard();
        instance.setjLabel2(jLabel2);
    }

    /**
     * Test of setItemType method, of class ItemCard.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        PurchaseOrder.ItemType itemType = null;
        ItemCard instance = new ItemCard();
        instance.setItemType(itemType);
    }

    /**
     * Test of getQuantity method, of class ItemCard.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ItemCard instance = new ItemCard();
        instance.setQuantity(0.0);
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setQuantity method, of class ItemCard.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double quantity = 0.0;
        ItemCard instance = new ItemCard();
        instance.setQuantity(quantity);
    }

    /**
     * Test of getBrand method, of class ItemCard.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        ItemCard instance = new ItemCard();
        instance.setBrand("");
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPurchaseOrder method, of class ItemCard.
     */
    @Test
    public void testSetPurchaseOrder() {
        System.out.println("setPurchaseOrder");
        PurchaseOrder purchaseOrder = null;
        ItemCard instance = new ItemCard();
        instance.setPurchaseOrder(purchaseOrder);
    }

    /**
     * Test of setBrand method, of class ItemCard.
     */
    @Test
    public void testSetBrand() {
        System.out.println("setBrand");
        String brand = "";
        ItemCard instance = new ItemCard();
        instance.setBrand(brand);
    }

    /**
     * Test of setImage method, of class ItemCard.
     */
    @Test
    public void testSetImage() throws Exception {
        System.out.println("setImage");
        String path = "";
        ItemCard instance = new ItemCard();
        instance.setImage(path);
    }

    /**
     * Test of getDiscount method, of class ItemCard.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        ItemCard instance = new ItemCard();
        instance.setDiscount(0.0);
        double expResult = 0.0;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setDiscount method, of class ItemCard.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        double discount = 0.0;
        ItemCard instance = new ItemCard();
        instance.setDiscount(discount);
    }

    /**
     * Test of getItemName method, of class ItemCard.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        ItemCard instance = new ItemCard();
        instance.setItemName("");
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class ItemCard.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        ItemCard instance = new ItemCard();
        instance.setItemName(itemName);
    }

    /**
     * Test of getId method, of class ItemCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ItemCard instance = new ItemCard();
        instance.setId(0);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class ItemCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        ItemCard instance = new ItemCard();
        instance.setId(id);
    }

    /**
     * Test of getPrice method, of class ItemCard.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ItemCard instance = new ItemCard();
        instance.setPrice(0.0);
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrice method, of class ItemCard.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ItemCard instance = new ItemCard();
        instance.setPrice(price);
    }

    /**
     * Test of setSalesChannel method, of class ItemCard.
     */
    @Test
    public void testSetSalesChannel() {
        System.out.println("setSalesChannel");
        SalesChannel salesChannel = null;
        ItemCard instance = new ItemCard();
        instance.setSalesChannel(salesChannel);
    }

    /**
     * Test of setSoldQuantity method, of class ItemCard.
     */
    @Test
    public void testSetSoldQuantity() {
        System.out.println("setSoldQuantity");
        int qty = 0;
        ItemCard instance = new ItemCard();
        instance.setSoldQuantity(qty);
    }

    /**
     * Test of setStyleforDashboard method, of class ItemCard.
     */
    @Test
    public void testSetStyleforDashboard() {
        System.out.println("setStyleforDashboard");
        ItemCard instance = new ItemCard();
        instance.setStyleforDashboard();
    }
    
}
