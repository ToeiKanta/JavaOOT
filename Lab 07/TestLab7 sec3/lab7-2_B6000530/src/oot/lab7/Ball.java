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
public class Ball extends BallA{
    String b;
    Ball(String b){
        this.b = b;
        System.out.println(b + " is a trade mark of BallA");
    }
    
    @Override
    void inflate(double volume) {
        System.out.printf("%s's ballA is a inflate %.5f cu.ft\n",b,volume);
    }

    @Override
    public void bounce(float bf) {
        System.out.printf("%s's ballA bounces with factor = %.1f\n",b,bf);
    }

    @Override
    public void roll() {
        System.out.println(b + "'s ballA rolls smoothly");
    }
}
