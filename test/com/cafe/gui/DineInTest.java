/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class DineInTest {

    public DineInTest() {
    }

    /**
     * Test of setBillTotal method, of class DineIn.
     */
    @Test
    public void testSetBillTotal() {
        System.out.println("setBillTotal");
        double billTotal = 0.0;
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        DineIn instance = new DineIn(dashboard, true, salesChannel);
        instance.setBillTotal(billTotal);
    }

    /**
     * Test of setTotalDiscount method, of class DineIn.
     */
    @Test
    public void testSetTotalDiscount() {
        System.out.println("setTotalDiscount");
        double totalDiscount = 0.0;
        User user = new User();
        user.setRole(UserRole.Role.Admin);
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        DineIn instance = new DineIn(dashboard, true, salesChannel);
        instance.setTotalDiscount(totalDiscount);
    }

    /**
     * Test of setBalance method, of class DineIn.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        SalesChannel salesChannel = new SalesChannel();
        salesChannel.setDashboard(dashboard);
        DineIn instance = new DineIn(dashboard, true,salesChannel );
        instance.setBalance();
    }

    /**
     * Test of setWarningStatus method, of class DineIn.
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
        DineIn instance = new DineIn(dashboard, true,salesChannel );
        instance.setWarningStatus(systemStatus);
    }

}
