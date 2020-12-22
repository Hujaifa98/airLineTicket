/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class JConnect {
    private static final String username = "root";
    private static final String password = "";
    private static final String CONN = "jdbc:mysql://localhost/airline";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONN,username,password);
    }  
}
