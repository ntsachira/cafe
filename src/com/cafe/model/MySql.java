package com.cafe.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Prince
 */
public class MySql {

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet exucute(String query) {
        try {

            Statement statement = connection.createStatement();

            if (query.startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery(query);
                return resultSet;
            } else {
                int result = statement.executeUpdate(query);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
