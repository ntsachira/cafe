
package com.cafe.gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Dell
 */
public class LoginTest {   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

   
     

    /**
     * Test of setSplash method, of class Login.
     */
    @Test
    public void testSetSplash() {
        System.out.println("setSplash");
        Splash splash = new Splash();
        Login instance = new Login();
        instance.setSplash(splash);        
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    private void testLogin() {
        System.out.println("login");
        Login instance = new Login();
        instance.login();        
    }

}
