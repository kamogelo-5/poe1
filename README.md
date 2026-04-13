# poe1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeechat_app;
import java.util.Scanner;
/**
 *
 * @author Student ST10536123 Kamogelo Chilwane
 */
public class POEEchat_App {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Validation valid = new Validation();
        // declaring variables
       
       String name, surname, username, password , cellNum;
       
      
       //inputs
        System.out.println("Enter your name");
        name = input.nextLine();
        System.out.println("Enter your surname");
        surname = input.nextLine();
        System.out.println("Create a username");
        username = input.nextLine();
       
     //Validate
     if(valid.checkusername(username)){
         System.out.println("Username successfully captured");
     }else{System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is more thanfive characters in length");
    }
     
   
   //Prompt user to enter their details
        System.out.println("Enter your password");
     password = input.nextLine();
     
     //validate
     
     
     
     System.out.println("Enter your cellphone number");
      cellNum = input.nextLine();
     
      //validate
      if(valid.checkcellNum(cellNum)){
          System.out.println("Cellphone number successfully added");
     }else{
          System.out.println("Cellphone not correctly formatted or does not contain international code");
      }
   
      //Display the registration status
      
       
        //Declare temporary variables to allow user to login
   
       
        System.out.println("**********LOGIN************");
       
        System.out.println("Please enter your login username");
        String userLogin = input.nextLine();
        System.out.println("Please enter your login password");
        String passLogin = input.nextLine();
       
        //statements to varify login info
        if (valid.loginUser(username, password , userLogin, passLogin)){
            System.out.println("Welcome "+name+" "+surname+ " "+ "nice to see you again"); 
        }else{
            System.out.println("The username or password incorrect, please try again. ");
        
        }
    } 
        } 
        
       
       
       
       
       
    

