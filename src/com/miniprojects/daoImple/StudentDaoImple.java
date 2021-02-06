/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.daoImple;

import com.miniprojects.Frames.UpdateStudent;
import com.miniprojects.beans.StudentBean;
import com.miniprojects.connectivity.DBConnection;
import com.miniprojects.dao.StudentDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usama Sajid
 */
public class StudentDaoImple implements StudentDao {

    Connection con = DBConnection.connect();

    @Override
    public int addStudent(StudentBean sb) {

        int add = 0;

        try {
            PreparedStatement pst = con.prepareStatement("insert into addstudent(name,email,course,fee,paid,due,address,contact) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, sb.getName());
            pst.setString(2, sb.getEmail());
            pst.setString(3, sb.getCourse());
            pst.setInt(4, sb.getFee());
            pst.setInt(5, sb.getPaid());
            pst.setInt(6, sb.getDue());
            pst.setString(7, sb.getAddress());
            pst.setString(8, sb.getContact());

            add = pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }

        return add;

    }

    @Override
    public ResultSet viewStudent() {

        ResultSet rst = null;

        try {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery("select * from addstudent");

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rst;

    }

    @Override
    public ResultSet viewDueFeesStudents() {

        ResultSet rst = null;

        try {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery("select name,course,fee,paid,due from addstudent where due!=0");

        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImple.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rst;

    }

    @Override
    public Integer updateStudent(StudentBean sb) {

        int r = 0;
        try {
            PreparedStatement ps = con.prepareStatement("update addstudent set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,contact=? where id=?");
            ps.setString(1, sb.getName());
            ps.setString(2, sb.getEmail());
            ps.setString(3, sb.getCourse());
            ps.setInt(4, sb.getFee());
            ps.setInt(5, sb.getPaid());
            ps.setInt(6, sb.getDue());
            ps.setString(7, sb.getAddress());
            ps.setString(8, sb.getContact());
            ps.setInt(9, sb.getId());

            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;

    }

    @Override
    public List<StudentBean> setAllTxt(StudentBean sb) {

        ArrayList<StudentBean> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from addstudent where id=?");
            ps.setInt(1, sb.getId());
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {

                StudentBean sb1 = new StudentBean();
                sb1.setName(rst.getString("name"));
                sb1.setEmail(rst.getString("email"));
                sb1.setCourse(rst.getString("course"));
                sb1.setFee(rst.getInt("fee"));
                sb1.setPaid(rst.getInt("paid"));
                sb1.setDue(rst.getInt("due"));
                sb1.setAddress(rst.getString("address"));
                sb1.setContact(rst.getString("contact"));

                list.add(sb1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

}
