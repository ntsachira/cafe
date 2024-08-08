/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.User;
import com.cafe.model.UserRole;
import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class QuantitySelectorTest {
    
    public QuantitySelectorTest() {
    }

    /**
     * Test of getMenuItem method, of class QuantitySelector.
     */
    @Test
    public void testGetMenuItem() {
        System.out.println("getMenuItem");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);   
        QuantitySelector quantitySelector = new QuantitySelector(new Dashboard(user), true);
        QuantitySelector instance = quantitySelector;
        ItemCard expResult = null;
        ItemCard result = instance.getMenuItem();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMenuItem method, of class QuantitySelector.
     */
    @Test
    public void testSetMenuItem() {
        System.out.println("setMenuItem");
        ItemCard menuItem = new ItemCard();
        User user = new User();      
        user.setRole(UserRole.Role.Admin);   
        QuantitySelector quantitySelector = new QuantitySelector(new Dashboard(user), true);
        quantitySelector.setSalesChannel(new SalesChannel());
        QuantitySelector instance = quantitySelector;
        instance.setMenuItem(menuItem);
    }

    /**
     * Test of setSalesChannel method, of class QuantitySelector.
     */
    @Test
    public void testSetSalesChannel() {
        System.out.println("setSalesChannel");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);   
        QuantitySelector quantitySelector = new QuantitySelector(new Dashboard(user), true);
        SalesChannel salesChannel = new SalesChannel();
        QuantitySelector instance = quantitySelector;
        instance.setSalesChannel(salesChannel);
    }

    /**
     * Test of main method, of class QuantitySelector.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuantitySelector.main(args);
    }

    /**
     * Test of setWarningStatus method, of class QuantitySelector.
     */
    @Test
    public void testSetWarningStatus() {
        System.out.println("setWarningStatus");
        String systemStatus = "";
        User user = new User();      
        user.setRole(UserRole.Role.Admin);   
        QuantitySelector quantitySelector = new QuantitySelector(new Dashboard(user), true);
        QuantitySelector instance = quantitySelector;
        instance.setWarningStatus(systemStatus);
    }
    
}
