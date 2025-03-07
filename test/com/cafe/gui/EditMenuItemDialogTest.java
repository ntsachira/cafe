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
public class EditMenuItemDialogTest {
    
    public EditMenuItemDialogTest() {
    }

    /**
     * Test of main method, of class EditMenuItemDialog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EditMenuItemDialog.main(args);
    }

    /**
     * Test of setStyle method, of class EditMenuItemDialog.
     */
    @Test
    public void testSetStyle() {
        System.out.println("setStyle");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        EditMenuItemDialog instance = new EditMenuItemDialog(dashboard, true);
        instance.setStyle();
    }

    /**
     * Test of setComponentTheme method, of class EditMenuItemDialog.
     */
    @Test
    public void testSetComponentTheme() {
        System.out.println("setComponentTheme");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        EditMenuItemDialog instance = new EditMenuItemDialog(dashboard, true);
        instance.setComponentTheme();
    }

    /**
     * Test of setMenuItem method, of class EditMenuItemDialog.
     */
    @Test
    public void testSetMenuItem() {
        System.out.println("setMenuItem");
        User user = new User();      
        user.setRole(UserRole.Role.Admin);  
        Dashboard dashboard = new Dashboard(user);
        dashboard.setMode(Theme.Mode.DARK);
        MenuItemCard menuItemCard = new MenuItemCard();   
        menuItemCard.setDashboard(dashboard);
        menuItemCard.setName("");
        menuItemCard.setPrice("");
        menuItemCard.setBrand("");
        MenuItemCard menuItem = menuItemCard;
        
        EditMenuItemDialog instance = new EditMenuItemDialog(dashboard, true);
        instance.setMenuItem(menuItem);
    }
    
}
