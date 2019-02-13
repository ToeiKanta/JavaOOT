/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab9;

public class Customer {
    public void checkAge(String item,int age) throws AlcoholException,CokeException{
        if(item.equals("Beer") && age<20){
            throw new AlcoholException(item);
        }else if(item.equals("Coke") && age<5){
            throw new CokeException(item);
        }else{
            System.out.println("Ok! You allow to buy "+item+".");
        }
    }
}
