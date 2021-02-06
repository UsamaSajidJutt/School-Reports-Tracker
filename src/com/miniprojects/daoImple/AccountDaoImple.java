/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.daoImple;

import com.miniprojects.beans.AccountBean;
import com.miniprojects.connectivity.DBConnection;
import com.miniprojects.dao.AccountantDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usama Sajid
 */
public class AccountDaoImple implements AccountantDao {

    Connection con = DBConnection.connect();

    @Override
    public int loginAccountant(AccountBean ab) {

        ResultSet rst = null;

        int r = 0;

        try {
            PreparedStatement pst = con.prepareStatement("select * from addaccountact where name_=? and password=?");
            pst.setString(1, ab.getName());
            pst.setString(2, ab.getPassword());
            rst = pst.executeQuery();

            while (rst.next()) {

                r++;

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return r;

    }

    @Override
    public int addAccountant(AccountBean ab) {

        int add = 0;
        try {

            PreparedStatement pst = con.prepareStatement("insert into addaccountact(name_,password,email,contact) values(?,?,?,?); ");

            pst.setString(1, ab.getName());
            pst.setString(2, ab.getPassword());
            pst.setString(3, ab.getEmail());
            pst.setString(4, ab.getContact());

            add = pst.executeUpdate();

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return add;

    }

    @Override
    public ResultSet viewAccountants() {

        ResultSet rst = null;

        try {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery("SELECT id AS S_NO,name_ AS Name_,email AS Email,contact AS Contact FROM addaccountact;");

        } catch (Exception exe) {
            exe.printStackTrace();
        }

        return rst;

    }

    @Override
    public ResultSet viewTenAccountants() {

        ResultSet rst = null;

        try {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery("SELECT id AS S_NO,name_ AS Name_,email AS Email,contact AS Contact FROM addaccountact limit 10");

        } catch (Exception exe) {
            exe.printStackTrace();
        }

        return rst;

    }

    @Override
    public ResultSet viewFiftyAccountants() {

        ResultSet rst = null;

        try {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery("SELECT id AS S_NO,name_ AS Name_,email AS Email,contact AS Contact FROM addaccountact limit 50");

        } catch (Exception exe) {
            exe.printStackTrace();
        }

        return rst;

    }

}
