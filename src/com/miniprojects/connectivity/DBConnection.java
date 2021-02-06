package com.miniprojects.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usama Sajid
 */
public class DBConnection {

    static Connection con = null;

    public static Connection connect() {
        try {
            if (con == null) {

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feereportdb", "root", "");
                System.out.println("ok");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}