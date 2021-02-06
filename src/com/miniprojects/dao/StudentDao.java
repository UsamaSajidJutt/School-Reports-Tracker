/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.dao;

import com.miniprojects.beans.StudentBean;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usama Sajid
 */
public interface StudentDao {

    public int addStudent(StudentBean sb);

    public ResultSet viewStudent();

    public List<StudentBean> setAllTxt(StudentBean sb);

    public Integer updateStudent(StudentBean sb);

    public ResultSet viewDueFeesStudents();

}
