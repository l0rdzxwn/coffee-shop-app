/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo;

import java.sql.Connection;
import com.services.dbservice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import src.models.Product;

/**
 *
 * @author lordz
 */
public class stockrepo {
    Connection conn = dbservice.connectDB();
    
    public void insertProduct(Product product){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO stockinfo(item_name,item_price,category,stock) VALUES(?,?,?,?)");
            stmt.setString(1,product.getName());
            stmt.setDouble(2,product.getPrice());
            stmt.setString(3,product.getCategory());
            stmt.setInt(4,product.getStock());
            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
