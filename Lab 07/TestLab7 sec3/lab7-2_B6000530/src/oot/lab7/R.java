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
public final class R extends Q{
    public R(){}
    public R(int n) {
        super(n);
    }
    @Override
    public String getAmount() {
        return "REference of R : " + super.getN();
    }
    
}
