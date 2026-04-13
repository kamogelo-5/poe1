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
      Login valid = new Login()
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
     if(login.checkusername(username)){
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
      if(login.checkcellNum(cellNum)){
          System.out.println("Cellphone number successfully added");
     }else{
          System.out.println("Cellphone not correctly formatted or does not contain international code");
      }
   
      //Display the registration status
        System.out.println(login.registrationUser(name,surname,username,password,cellNum));
       
        //Declare temporary variables to allow user to login
        String loginUsername, loginPassword;
       
        System.out.println("**********LOGIN************");
       
        System.out.println("Please enter your login username");
        loginUsername = input.nextLine();
        System.out.println("Please enter your login password");
        loginPassword = input.nextLine();
       
        //statements to varify login info
        if(valid.loginUser(username ,password,Userlogin ,passLogin)) {
         
            System.out.println("Welcome "+name+ " "+ "nice to see you again"); 
        }else {
            System.out.println("The username or password incorrect, please try again. ");
        
        }
            
        }
        }
   

       
       
       
       
       
    

