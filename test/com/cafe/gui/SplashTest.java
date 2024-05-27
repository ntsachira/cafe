/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SplashTest {
    
    public SplashTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setThemeSelection method, of class Splash.
     */
    

    /**
     * Test of main method, of class Splash.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Splash.main(args);        
    }

    /**
     * Test of setDashboard method, of class Splash.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        User user = null;
        Splash instance = new Splash();
        instance.setDashboard(user);       
    }

    /**
     * Test of setThemeSelection method, of class Splash.
     */
    @Test
    public void testSetThemeSelection() {
        System.out.println("setThemeSelection");
        User user = null;
        Splash instance = new Splash();
        instance.setThemeSelection(user);        
    }
    
}
