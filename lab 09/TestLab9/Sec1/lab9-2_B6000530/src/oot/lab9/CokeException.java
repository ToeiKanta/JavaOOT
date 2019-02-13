/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab9;

class CokeException extends Exception {

    public CokeException(String item) {
        super("Sorry! You not allow to buy sparkling water.");
    }
    
}
