/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.Connection;
        
/**
 *
 * @author lordz
 */
public class dbservice {
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Dotenv dotenv = Dotenv.configure()
                      .directory("./src/main/java/com/database")
                      .filename("dbaccess.env")
                      .load();
            conn = DriverManager.getConnection(dotenv.get("DB_URL"),dotenv.get("DB_USER"),dotenv.get("DB_PASSWORD"));
            
            if(conn != null){
                System.out.println("Connection success!");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
