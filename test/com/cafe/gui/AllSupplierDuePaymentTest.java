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
public class AllSupplierDuePaymentTest {
    
    public AllSupplierDuePaymentTest() {
    }

    /**
     * Test of loadGrnTable method, of class AllSupplierDuePayment.
     */
    @Test
    public void testLoadGrnTable() {
        System.out.println("loadGrnTable");
        AllSupplierDuePayment instance = new AllSupplierDuePayment(new JFrame(), true);
        instance.loadGrnTable();
    }

    /**
     * Test of main method, of class AllSupplierDuePayment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AllSupplierDuePayment.main(args);
    }

    /**
     * Test of setSupplierManagement method, of class AllSupplierDuePayment.
     */
    @Test
    public void testSetSupplierManagement() {
        System.out.println("setSupplierManagement");
        SupplierManagement supplierManagement = null;
        AllSupplierDuePayment instance = new AllSupplierDuePayment(new JFrame(), true);
        instance.setSupplierManagement(supplierManagement);
    }

    /**
     * Test of getSupplierManagement method, of class AllSupplierDuePayment.
     */
    @Test
    public void testGetSupplierManagement() {
        System.out.println("getSupplierManagement");
        AllSupplierDuePayment instance = new AllSupplierDuePayment(new JFrame(), true);
        SupplierManagement expResult = null;
        SupplierManagement result = instance.getSupplierManagement();
        assertEquals(expResult, result);
    }
    
}
