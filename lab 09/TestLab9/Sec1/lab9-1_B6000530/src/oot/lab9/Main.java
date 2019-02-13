/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab9;

/**
 *
 * @author ToeiK
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int num1,num2;
        try{
            int[] arr1 = {10,20,30,40,50};
            int[] arr2 = {0,2,3,4,5};
            System.out.print("Enter num1: ");
            num1 = reader.nextInt();
            System.out.print("Enter num2: ");
            num2 = reader.nextInt();
            System.out.println(arr1[num1]+" / "+arr2[num2]+" = "+arr1[num1]/arr2[num2]);
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception occured: "+e.toString());
            System.out.println("You entered number exceeds the array size");
        }catch(ArithmeticException e){
            System.out.println("Exception occured: "+e.toString());
            System.out.println("Divide by zero");
        }catch(InputMismatchException e){
            System.err.println("Exception occured: "+e.toString());
            System.err.println("You must specify an index in integer");
        }catch(Exception e){
            System.out.println("Exception occured: "+e.toString());
        }
        
    }
    
}
