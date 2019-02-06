/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author All User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(toggle("SuranaRee"));
        System.out.println(toggle("Hello123"));
        System.out.println(toggle("[abcDEF]"));
    }

    private static String toggle(String str) {
        String str2 = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' ){
                //ch -= 32;    
                //or
                ch = Character.toUpperCase(ch);
            }else
            if(ch >= 'A' && ch <= 'Z' ){
                //ch += 32;    
                //or
                ch = Character.toLowerCase(ch);
            }
            str2 += ch;
        }
        return str2;
    }
    
}
