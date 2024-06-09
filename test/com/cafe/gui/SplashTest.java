
package com.cafe.gui;

import com.cafe.model.User;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class SplashTest {
    
    public SplashTest() {
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
     * Test of main method, of class Splash.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Splash.main(args);        
    }
    
}
