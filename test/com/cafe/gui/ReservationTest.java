/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import javax.swing.JComponent;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class ReservationTest {
    
    public ReservationTest() {
    }

    /**
     * Test of setWarningStatus method, of class Reservation.
     */
    @Test
    public void testSetWarningStatus() {
        System.out.println("setWarningStatus");
        String systemStatus = "";
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        Reservation instance = new Reservation(dashboard, true, salesChannel);
        instance.setWarningStatus(systemStatus);
    }

    /**
     * Test of setSucessStatus method, of class Reservation.
     */
    @Test
    public void testSetSucessStatus() {
        System.out.println("setSucessStatus");
        String systemStatus = "";
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        Reservation instance = new Reservation(dashboard, true, salesChannel);
        instance.setSucessStatus(systemStatus);
    }

    /**
     * Test of setWarningBorder method, of class Reservation.
     */
    @Test
    public void testSetWarningBorder() {
        System.out.println("setWarningBorder");
        JComponent c = new JTextField();
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        Reservation instance = new Reservation(dashboard, true, salesChannel);
        instance.setWarningBorder(c);
    }
    
}
