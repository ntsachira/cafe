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
public class NewKitchenItemDialogTest {
    
    public NewKitchenItemDialogTest() {
    }

    /**
     * Test of main method, of class NewKitchenItemDialog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewKitchenItemDialog.main(args);
    }

    /**
     * Test of setGrnManagement method, of class NewKitchenItemDialog.
     */
    @Test
    public void testSetGrnManagement() {
        System.out.println("setGrnManagement");
        GrnManagement grnManagement = null;
        NewKitchenItemDialog instance = new NewKitchenItemDialog(new JFrame(), true);
        instance.setGrnManagement(grnManagement);
    }

    /**
     * Test of setStyle method, of class NewKitchenItemDialog.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        NewKitchenItemDialog instance = new NewKitchenItemDialog(new JFrame(), true);
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class NewKitchenItemDialog.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        NewKitchenItemDialog instance = new NewKitchenItemDialog(new JFrame(), true);
        instance.setComponentTheme();
    }
    
}
