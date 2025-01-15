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
public class UserActivityManagementTest {
    
    public UserActivityManagementTest() {
    }

    /**
     * Test of getDashboard method, of class UserActivityManagement.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        UserActivityManagement instance = new UserActivityManagement();
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        instance.setDashboard(dashboard);
        salesChannel.setDashboard(dashboard);
        Dashboard expResult = dashboard;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class UserActivityManagement.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        Dashboard dashboard = null;
        UserActivityManagement instance = new UserActivityManagement();
        instance.setDashboard(dashboard);
    }
    
}
