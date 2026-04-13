/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poeechat_app;



import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class loginTest {
    
    public loginTest() {
    }
  

    /**
     * Test of checkusername method, of class login.
     */
    
    //unit test for checking username
    @org.junit.jupiter.api.Test
    public void testCheckusername() {
        System.out.println("checkusername");
        String username = "kamogelo";
        boolean expResult = true;
        boolean result = login.checkusername(username);
        assertEquals(expResult, result);
      
        
    }
               
    

    /**
     * Test of checkcellNum method, of class login.
     */
    // unit test for cellphone number 
    @org.junit.jupiter.api.Test
    public void testCheckcellNum() {
        System.out.println("checkcellNum");
        String cellNum = "0671234543";
        boolean expResult = true;
        boolean result = login.checkcellNum(cellNum);
        assertEquals(expResult, result);
              
    }
      
    
    /**
     * Test of registrationUser method, of class login.
     */
    //unit test for registered user
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registrationUser");
        String name = "kamo";//covered
        String surname = "chilwane";
        String username = "kamo_";//covered
        String password = "Kamo123!";//covered
        String cellNum = "0612345678";  //*covered
        boolean expResult = true;
        String result = login.registrationUser(name, surname, username, password, cellNum);
        assertEquals("user was succesfully registered", result);
        
    }
    //unit test for password
    @org.junit.jupiter.api.Test
    public void testCheckpassword()  {
        System.out.println("checkpassword");
        String password = ("Kamo123!");
        boolean expResult = true;
        boolean result = login.checkpassword(password);
        assertEquals(expResult,  result);
    }
    //unit test for user details
    
}
