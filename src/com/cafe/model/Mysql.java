package com.cafe.model;

import com.cafe.gui.Splash;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class Mysql {

    private static Connection connection;
    private static String user = "root";
    private static String password = "#Love0923";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_db", user, password);
        } catch (ClassNotFoundException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    public static ResultSet execute(String query){
        try {
            Statement statement = connection.createStatement();
            if (query.startsWith("SELECT")) {
                return statement.executeQuery(query);
            } else {
                statement.executeUpdate(query);
                return null;
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }

   

   
}
