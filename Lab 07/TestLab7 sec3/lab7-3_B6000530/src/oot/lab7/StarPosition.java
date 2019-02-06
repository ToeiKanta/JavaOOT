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
public class StarPosition implements Position{
    int x,y;
    StarPosition(int x , int y){
        this.x = x;
        this.y = y;
       
    }

    @Override
    public String toString(){
        return "The current location of the star = ("+x+","+y+")";
    }
    
    @Override
    public void starLeft(int n) {
        System.out.print("Star move left location -" + n*n +" : ");
        x -= n*n;
        System.out.println("("+x+","+y+")");
    }

    @Override
    public void starRight(int n) {
        System.out.print("Star move right location +" + n*n +" : ");
        x += n*n;
        System.out.println("("+x+","+y+")");
    }

    @Override
    public void starUp(int n) {
        System.out.print("Star move up location +" + n*n +" : ");
        y += n*n;
        System.out.println("("+x+","+y+")");
    }

    @Override
    public void starDown(int n) {
        System.out.print("Star move down location -" + n*n +" : ");
        y -= n*n;
        System.out.println("("+x+","+y+")");
    }
}
