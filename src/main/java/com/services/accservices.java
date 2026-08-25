/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.models.Account;
import com.repo.accrepo;

/**
 *
 * @author lordz
 */
public class accservices {
    accrepo repo = new accrepo();
    
    public boolean validateCredentials(String user, String pass){
        Account acc = new Account(user,pass);
        return repo.validateCredentials(acc);
    }
    
    
}
