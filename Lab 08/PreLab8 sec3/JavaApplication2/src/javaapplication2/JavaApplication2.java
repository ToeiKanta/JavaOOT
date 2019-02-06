/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author All User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "su     ra n are e";
        str = removeSapce(str);
        System.out.println(str);
    }

    private static String removeSapce(String str) {
        String str2 = "";
        int count = 0;
        for(int i = 0 ;i<str.length(); i++){
            if(str.charAt(i) != ' '){
                str2 += str.charAt(i);
            }
        }
        return str2;
    }
    
    
}
