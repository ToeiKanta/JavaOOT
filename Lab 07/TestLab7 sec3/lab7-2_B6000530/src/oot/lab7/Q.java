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
public class Q {
    private int n;
    Q(){
        
    }
    Q(int n){
        this.n = n;
    }
    
    public int getN(){
        return n;
    }
    
    public String getAmount(){
        return "Reference of Q : "+n;
    }
}
