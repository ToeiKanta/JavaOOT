/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab7;

/**
 *
 * @author All User
 */
public abstract class Beverage implements Changeable{
    protected String price;
    protected String currency;
    
    abstract void drink();
    void getPrice(){
        System.out.println("Price: " + price + " "+ currency);
    }
}
