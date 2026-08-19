/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author lordz
 */
public class Product {
    private String item_id;
    private String name;
    private double price;
    private String category;
    private int stock;
    
    public Product(String item_id, String name, double price, String category, int stock){
        this.item_id = item_id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    
    public Product( String name, double price, String category, int stock){
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    
    public Product(  double price, String item_id, String category, int stock){
        this.item_id = item_id;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    
        public Product(  String category, double price,  int stock){
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    
    public String getID(){return item_id;}
    public String getName(){return name;}
    public Double getPrice(){return price;}
    public String getCategory(){return category;}
    public int getStock(){return stock;}
    
}
