/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.repo.stockrepo;
import java.util.List;
import src.models.Product;

/**
 *
 * @author lordz
 */
public class stockservices {
    stockrepo repo = new stockrepo();
    
    public void insertProduct(String name, double price, String category, int stock){
        Product prod = new Product(name,price,category,stock);
        repo.insertProduct(prod);
    }
    
    public List<Product> fetchProducts(){
        return repo.fetchProducts();
    }
    
}
