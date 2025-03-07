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
public class SingleSupplierDuePaymentTest {
    
    public SingleSupplierDuePaymentTest() {
    }

    /**
     * Test of setSupplier method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testSetSupplier() {
        System.out.println("setSupplier");
        String name = "";
        String mobile = "";
        SingleSupplierDuePayment instance = new SingleSupplierDuePayment(null, true);
        instance.setSupplier(name, mobile);
    }

    /**
     * Test of loadSingleSupplierTable method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testLoadSingleSupplierTable() {
        System.out.println("loadSingleSupplierTable");
        SingleSupplierDuePayment instance = new SingleSupplierDuePayment(null, true);
        instance.loadSingleSupplierTable();
    }

    /**
     * Test of loadSupplierDetails method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testLoadSupplierDetails() {
        System.out.println("loadSupplierDetails");
        String mobile = "";
        SingleSupplierDuePayment instance = new SingleSupplierDuePayment(null, true);
        instance.loadSupplierDetails(mobile);
    }

    /**
     * Test of main method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SingleSupplierDuePayment.main(args);
    }

    /**
     * Test of setSupplierManagement method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testSetSupplierManagement() {
        System.out.println("setSupplierManagement");
        SupplierManagement supplierManagement = null;
        SingleSupplierDuePayment instance = new SingleSupplierDuePayment(null, true);
        instance.setSupplierManagement(supplierManagement);
    }

    /**
     * Test of getSupplierManagement method, of class SingleSupplierDuePayment.
     */
    @Test
    public void testGetSupplierManagement() {
        System.out.println("getSupplierManagement");
        SingleSupplierDuePayment instance = new SingleSupplierDuePayment(new JFrame(), true);
        SupplierManagement supplierManagement = new SupplierManagement();
        instance.setSupplierManagement(supplierManagement);
        SupplierManagement expResult = supplierManagement;
        SupplierManagement result = instance.getSupplierManagement();
        assertEquals(expResult, result);
    }
    
}
