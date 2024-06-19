/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.style;

import com.cafe.gui.Dashboard;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class PalletTest {
    
    public PalletTest() {
    }

    /**
     * Test of setDashboard method, of class Pallet.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        NewTheme.setDashboard(dashboard);       
    }

    /**
     * Test of ResetTheme method, of class Pallet.
     */
    @Test
    public void testResetTheme() {
        System.out.println("ResetTheme");
        NewTheme.ResetTheme();
    }
   
    /**
     * Test of setLightMode method, of class Pallet.
     */
    @Test
    public void testSetLightMode() {
        System.out.println("setLightMode");
        NewTheme.setLightMode();
    }

    /**
     * Test of setDarkMode method, of class Pallet.
     */
    @Test
    public void testSetDarkMode() {
        System.out.println("setDarkMode");
        NewTheme.setDarkMode();
    }  
    
}
