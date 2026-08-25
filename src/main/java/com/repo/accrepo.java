/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo;

import com.models.Account;
import com.services.dbservice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class accrepo {
    Connection conn = dbservice.connectDB();
    
    public boolean validateCredentials(Account acc){
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM accounts WHERE username = ? AND password = ?");
            stmt.setString(1, acc.getUsername());
            stmt.setString(2, acc.getPassword());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }    
    
    
}
