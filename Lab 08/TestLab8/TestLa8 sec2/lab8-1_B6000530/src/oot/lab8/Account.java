/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8;

import oot.lab8.quiz1.PasswordValidation;
import oot.lab8.quiz1.UsernameValidation;

public class Account extends Validator implements PasswordValidation,UsernameValidation{ //2 extends Validator  implements PasswordValidation,UsernameValidation
     public Account(String username, String password) {
         super(username,password);     
     } 
     public void validateAll() {
         boolean passwordLength = checkPasswordIsLongerThanEightChars();         
         boolean passwordIsDigitOnly = checkPasswordIsDigitOnly();         
         boolean usernameIsLowerCase = checkUsernameIsLowercase(); 
         System.out.println("Password length validated : " + passwordLength);         
         System.out.println("Password only digit validated: " + passwordIsDigitOnly);         
         System.out.println("Username lower case validated : " + usernameIsLowerCase);         
         System.out.println("======================================");     
     }
}
