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
public class javaapplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverse("SuranaRee"));
        System.out.println(reverse("Hello123"));
        System.out.println(reverse("[abcDEF]"));
    }

    private static String reverse(String str) {
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--){
            str2 += str.charAt(i);
        }
        return str2;
    }
    
}
