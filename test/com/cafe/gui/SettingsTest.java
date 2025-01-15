/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class SettingsTest {
    
    public SettingsTest() {
    }

    /**
     * Test of getDashboard method, of class Settings.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        Settings instance = new Settings();
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        instance.setDashboard(dashboard);        
        Dashboard expResult = dashboard;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class Settings.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        Settings instance = new Settings();
        instance.setDashboard(dashboard);
    }
    
}
