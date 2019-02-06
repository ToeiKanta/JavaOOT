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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage y1 = new YenYen("15","baht" , "420ml");
        Beverage y2 = new YenYen("0.5","usd" , "500ml");
        
        showPrice(y1);
        y1.setOwner("Udom");
        showOwner(y1);
        System.out.println("===============");
        
        showPrice(y2);
        y2.setOwner("Nose Udom");
        showOwner(y2);
        System.out.println("===============");
        
    }
    public static void showPrice(Beverage y){
        y.drink();
        y.getPrice();
    }
    public static void showOwner(Beverage y){
        System.out.println("Change owner to " + y.getOwner() + ".");
    }
    
}
