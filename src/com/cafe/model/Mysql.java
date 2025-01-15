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
    private static final String USER = "root";
    private static final String PASSWORD = "ntsachira";
    private static final String DATABASE = "cafe_db";
    private static boolean isDatabaseExists;
    
    public static String getUsername(){
        return USER;
    }
    
    public static String getPASSWORD(){
        return PASSWORD;
    }
    
    public static String getDbName(){
        return DATABASE;
    }

    static {
        createNewConnection();
    }

    public static ResultSet execute(String query) {
        if (isDatabaseExists) {
            try {
                Statement statement = connection.createStatement();
                if (query.startsWith("SELECT")) {
                    return statement.executeQuery(query);
                } else {
                    statement.executeUpdate(query);
                    return null;
                }
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE,ex.getMessage());
            }
        }        
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }
    
    public static void createNewConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE, USER, PASSWORD);
            isDatabaseExists = true;
        } catch (ClassNotFoundException ex) {
            Splash.logger.log(Level.SEVERE, "{0}{1}", new Object[]{ex.getMessage(), System.lineSeparator()});
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, "{0}{1}", new Object[]{ex.getMessage(), System.lineSeparator()});
        }
    }

}
