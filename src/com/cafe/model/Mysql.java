/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cafe.model;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class Mysql {
    private  static  Connection connection;
    
    static {
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_db","root","LocalHost@1234supun");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    }
    
    public static ResultSet execute(String query) throws Exception{
        Statement statement = connection.createStatement();
        if(query.startsWith("SELECT")){
        return statement.executeQuery(query);
        
        
        }else{
         statement.executeUpdate(query);
         return null;
        }
    
    
    }

    public static Resultset search(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ResultSet exucute(String select_name_FROM_supplier_category_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
