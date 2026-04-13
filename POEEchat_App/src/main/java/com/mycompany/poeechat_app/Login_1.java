/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeechat_app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
class login {
//method to validate the username
    static boolean checkusername(String username) {
     return username.contains("_")&&username.length()<=5;
    }
//method to validate the cellphone number
    
    static boolean checkcellNum(String cellNum) {
      //declare a variable to store the pattern
      
  String regex= "^(\\+27|0)[6-8][0-9]{8}$";
    
//pattern object to compile the rejex  

Pattern pattern=Pattern.compile(regex);

//matcher object to match the student number to the rejex
    
 Matcher matcher= pattern.matcher(cellNum);  
    //true if pattern matches student
    
    return matcher.matches();
    }
//method to return user registration status
  static String registrationUser(String name, String surname, String username, String password, String cellNum) {
      if (checkusername(username)&& checkcellNum(cellNum)){
          
          return "user was succesfully registered";
      }else{
          System.out.println("username,password or cellphone number incorrectly formatted, registration was unsuccesful");
          System.exit(0);
          return null;
      }
       
  }
 // method to validate password
  
    static boolean checkpassword(String password) {
        
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$"; 
        
        //pattern object to compile the regex  
        
       Pattern pattern=Pattern.compile(regex);
       
       //matcher to match the password to the regex
        Matcher matcher = pattern.matcher(password);
        
        //true if password matches requirement criteria
        
        return matcher.matches();
    }  
//method to confirm user login details match
    
   public boolean loginUser(String user,String pass, String Userlogin,String passLogin)  {
        return Userlogin.equals(user) && passLogin.equals(pass);
    }
   