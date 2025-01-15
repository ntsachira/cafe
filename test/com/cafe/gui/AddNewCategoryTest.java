/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cafe.gui;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class AddNewCategoryTest {
    
    public AddNewCategoryTest() {
    }

    /**
     * Test of setCategoryManagement method, of class AddNewCategory.
     */
    @Test
    public void testSetCategoryManagement() {
        System.out.println("setCategoryManagement");
        CategoryManagement categoryManagement = null;
        AddNewCategory instance = new AddNewCategory();
        instance.setCategoryManagement(categoryManagement);
    }
    
}
