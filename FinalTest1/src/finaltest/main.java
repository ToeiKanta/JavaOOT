/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

import java.util.Scanner;

/**
 *
 * @author ToeiK
 */
public class main {
    static String delimit = "#";    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = sc.next();
        System.out.print("Where will you go : ");
        String town = sc.next();
        System.out.print("How many weeks will you leave? : ");
        String week = sc.next();
        System.out.print("Please input your pocket money : ");
        String pocketMoney = sc.next();
        Travel t = new Travel(name,town,week,pocketMoney,delimit);
        t.printResult();
    }
    
}
