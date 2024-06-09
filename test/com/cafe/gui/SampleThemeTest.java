
package com.cafe.gui;

import javax.swing.JPanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SampleThemeTest {
    
    public SampleThemeTest() {
    }

    /**
     * Test of getParentPanel method, of class SampleTheme.
     */
    @Test
    public void testGetParentPanel() {
        System.out.println("getParentPanel");
        SampleTheme instance = new SampleTheme();
        JPanel expResult = null;
        JPanel result = instance.getParentPanel();
        assertEquals(expResult, result);       
    }

    /**
     * Test of setParentPanel method, of class SampleTheme.
     */
    @Test
    public void testSetParentPanel() {
        System.out.println("setParentPanel");
        JPanel parentPanel = null;
        SampleTheme instance = new SampleTheme();
        instance.setParentPanel(parentPanel);        
    }

    /**
     * Test of getThemeSelection method, of class SampleTheme.
     */
    @Test
    public void testGetThemeSelection() {
        System.out.println("getThemeSelection");
        SampleTheme instance = new SampleTheme();
        ThemeSelection expResult = null;
        ThemeSelection result = instance.getThemeSelection();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setThemeSelection method, of class SampleTheme.
     */
    @Test
    public void testSetThemeSelection() {
        System.out.println("setThemeSelection");
        ThemeSelection themeSelection = null;
        SampleTheme instance = new SampleTheme();
        instance.setThemeSelection(themeSelection);        
    }

    /**
     * Test of setDarkTheme method, of class SampleTheme.
     */
    @Test
    public void testSetDarkTheme() {
        System.out.println("setDarkTheme");
        SampleTheme instance = new SampleTheme();
        instance.setDarkTheme();        
    }

    /**
     * Test of setLightTheme method, of class SampleTheme.
     */
    @Test
    public void testSetLightTheme() {
        System.out.println("setLightTheme");
        SampleTheme instance = new SampleTheme();
        instance.setLightTheme();       
    }

    /**
     * Test of main method, of class SampleTheme.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SampleTheme.main(args);        
    }
    
}
