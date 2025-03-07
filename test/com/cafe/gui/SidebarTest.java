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
public class SidebarTest {

    public SidebarTest() {
    }

    /**
     * Test of addSidebarButtonStyle method, of class Sidebar.
     */
    @Test
    public void testAddSidebarButtonStyle() {
        System.out.println("addSidebarButtonStyle");
        Sidebar instance = new Sidebar();
        instance.addSidebarButtonStyle();
    }

    /**
     * Test of getDashboard method, of class Sidebar.
     */
    @Test
    public void testGetDashboard() {
        System.out.println("getDashboard");
        Sidebar instance = new Sidebar();
        Dashboard expResult = null;
        Dashboard result = instance.getDashboard();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDashboard method, of class Sidebar.
     */
    @Test
    public void testSetDashboard() {
        System.out.println("setDashboard");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);  
        Sidebar instance = new Sidebar();
        instance.setDashboard(dashboard);
        instance.setDashboard(dashboard);
    }

    /**
     * Test of logOut method, of class Sidebar.
     */
    @Test
    public void testLogOut() {
        System.out.println("logOut");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        Sidebar instance = new Sidebar();
        instance.setDashboard(dashboard);
        instance.logOut();
    }

    /**
     * Test of setCashierContent method, of class Sidebar.
     */
    @Test
    public void testSetCashierContent() {
        System.out.println("setCashierContent");
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        Sidebar instance = new Sidebar();
        instance.setDashboard(dashboard);
        instance.setCashierContent();
    }

}
