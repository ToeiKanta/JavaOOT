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
public class N extends M{
    public N(){
        System.out.println("Constructor N");
    }
    @Override
    void talk(String s) {  
        System.out.println("N talk: " + s);
    }
    
}
