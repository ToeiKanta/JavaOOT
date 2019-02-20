/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

/**
 *
 * @author ToeiK
 */
public abstract class Currency {
    private double money;
    public abstract void printCurrency();
    public double getMoney(){
        return money;
    }
}
