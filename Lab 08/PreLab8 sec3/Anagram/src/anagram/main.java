/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

/**
 *
 * @author All User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str1 = "toeiasd";
       String str2 = "eiotasd";
       System.out.println(isAnagram(str1,str2) ? "is Anagram":"is not Anagram");
    }

    private static boolean isAnagram(String str1, String str2) {
        int[] n = new int[26];
        if(str1.length() != str2.length())
            return false;
        for(int i=0;i<str1.length();i++){
            n[str1.charAt(i)-'a']++;
            n[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(n[i] != 0)
                return false;
        }
        return true;
    }
    
    
}
