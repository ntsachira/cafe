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
public class TableCardTest {
    
    public TableCardTest() {
    }

    /**
     * Test of setTableManagement method, of class TableCard.
     */
    @Test
    public void testSetTableManagement() {
        System.out.println("setTableManagement");
        TableManagement tableManagement = null;
        TableCard instance = new TableCard();
        instance.setTableManagement(tableManagement);
    }

    /**
     * Test of loadTables method, of class TableCard.
     */
    @Test
    public void testLoadTables() {
        System.out.println("loadTables");
        TableCard instance = new TableCard();
        instance.loadTables();
    }

    /**
     * Test of getId method, of class TableCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TableCard instance = new TableCard();
        instance.setId("");
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class TableCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        TableCard instance = new TableCard();
        instance.setId(id);
    }

    /**
     * Test of getCategory method, of class TableCard.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        TableCard instance = new TableCard();
        instance.setCategory("");
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategory method, of class TableCard.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        TableCard instance = new TableCard();
        instance.setCategory(category);
    }

    /**
     * Test of getStatus method, of class TableCard.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        TableCard instance = new TableCard();
        instance.setStatus("");
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class TableCard.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String Status = "";
        TableCard instance = new TableCard();
        instance.setStatus(Status);
    }

    /**
     * Test of getImage method, of class TableCard.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        TableCard instance = new TableCard();
        instance.setImage("");
        String expResult = "";
        String result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImage method, of class TableCard.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String image = "";
        TableCard instance = new TableCard();
        instance.setImage(image);
    }
    
}
