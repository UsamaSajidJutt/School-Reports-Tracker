/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.dao;

import com.miniprojects.beans.AccountBean;
import java.sql.ResultSet;

/**
 *
 * @author Usama Sajid
 */
public interface AccountantDao {

    public int loginAccountant(AccountBean ab);
    public int addAccountant(AccountBean ab);
    public ResultSet viewAccountants();
    public ResultSet viewTenAccountants();
    public ResultSet viewFiftyAccountants();
    
    
    
    
}
