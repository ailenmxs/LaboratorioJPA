/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

/**
 *
 * @author bairo
 */
public class ExceptionPrint extends Exception {
    public ExceptionPrint(String invalid_email_or_password) {
    }

    public String getMessage(){
        return "Email invalido o contraseña incorrecta";
    }
}
