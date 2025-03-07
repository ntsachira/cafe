/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.DueGrn;
import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SupplierGrnViewTest {
    
    public SupplierGrnViewTest() {
    }

    /**
     * Test of setSingleSupplierDuePayment method, of class SupplierGrnView.
     */
    @Test
    public void testSetSingleSupplierDuePayment() {
        System.out.println("setSingleSupplierDuePayment");
        SingleSupplierDuePayment singleSupplierDuePayment = null;
        SupplierGrnView instance = new SupplierGrnView(new JFrame(), true);
        instance.setSingleSupplierDuePayment(singleSupplierDuePayment);
    }

    /**
     * Test of setAllSupplierDuePayment method, of class SupplierGrnView.
     */
    @Test
    public void testSetAllSupplierDuePayment() {
        System.out.println("setAllSupplierDuePayment");
        AllSupplierDuePayment allSupplierDuePayment = null;
        SupplierGrnView instance = new SupplierGrnView(new JFrame(), true);
        instance.setAllSupplierDuePayment(allSupplierDuePayment);
    }

    /**
     * Test of setGrn method, of class SupplierGrnView.
     */
    @Test
    public void testSetGrn() {
        System.out.println("setGrn");
        DueGrn grn = new DueGrn();
        grn.setDue(0.0);
        grn.setPaidAmount(0.0);
        grn.setTotal(0.0);
        SupplierGrnView instance = new SupplierGrnView(new JFrame(), true);
        instance.setGrn(grn);
    }

    /**
     * Test of AllsupplieritemDetails method, of class SupplierGrnView.
     */
    @Test
    public void testAllsupplieritemDetails() {
        System.out.println("AllsupplieritemDetails");
        SupplierGrnView instance = new SupplierGrnView(new JFrame(), true);
        instance.AllsupplieritemDetails();
    }

    /**
     * Test of main method, of class SupplierGrnView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SupplierGrnView.main(args);
    }
    
}
