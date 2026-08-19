/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repo;

import com.models.Product;
import java.sql.Connection;
import com.services.dbservice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
 
    public void updateProduct(Product product){
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE stockinfo SET item_price = ?,category = ?,stock = ? WHERE item_name = ?");
            stmt.setDouble(1,product.getPrice());
            stmt.setString(2,product.getCategory());
            stmt.setInt(3,product.getStock());
            stmt.setString(4, product.getName());
            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println("SQL ERROR: "+ex.getMessage());
        }
    }
    
    public List<Product> fetchProducts(){
        List<Product> product = new ArrayList<>();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM stockinfo");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Product p = new Product(
                rs.getString("item_id"),
                rs.getString("item_name"),
                rs.getDouble("item_price"),
                rs.getString("category"),
                rs.getInt("stock")
                );
                product.add(p);
            }
        }catch(Exception ex){
            System.out.println("SQL ERROR: "+ex.getMessage());
        }
        return product;
    }
}
