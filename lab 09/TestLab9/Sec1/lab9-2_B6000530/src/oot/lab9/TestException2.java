/*
run:
========================
   1.Water
   2.Coke
   3.Beer
========================
Shopkeeper: Hello! What do you want to buy today? 3
Customer: I would like to buy Beer.
Shopkeeper: How old are you? 25
Customer: I'm 25 years old.
Ok! You allow to buy Beer
 */
package oot.lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] item = {"Water","Coke","Beer"};
        
        try{
            displayItem(item);
            System.out.print("Shopkeeper: Hello! What do you want to buy today? ");
            try{
                int i = reader.nextInt();
                System.out.println("Customer: I would like to buy "+ item[i-1] + ".");
                System.out.print("Shopkeeper: How old are you? ");
                int age = reader.nextInt();
                System.out.println("Customer: I'm " + age + " years old.");
                Customer cus = new Customer();
                cus.checkAge(item[i-1],age); // item[i-1],age
            }catch(InputMismatchException e){ //InputMismatchException e
                System.out.println("Input expected to be a number");
            } 
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
                
    }

    private static void displayItem(String[] items) {
        int count = 0;
        System.out.println("========================");
        for(String item:items){
            count++;
            System.out.println("   " + count + "." + item);
        }
        System.out.println("========================");

    }
}