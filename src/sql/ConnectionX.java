/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class ConnectionX {

    public static Connection getConnection() {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "databasename=test;" 
                + "user=test;"
                + "password=test;"
                + "loginTimeout=30;"
                + "encrypt=true;trustServerCertificate=true;";

        try {
            Connection connectionX = DriverManager.getConnection(connectionUrl);
            return connectionX;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }

    }
}
