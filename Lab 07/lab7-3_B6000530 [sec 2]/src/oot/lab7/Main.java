/*
run:
The current location of the ball = (0,0)
Ball move down location: (0,-1)
Ball move right location: (1,-1)
The current location of the ball = (1,-1)
========================
The current location of the ball = (3,4)
Ball move up location: (3,5)
The current location of the ball = (3,5)
========================
The current location of the ball = (5,6)
Ball move right location: (6,6)
Ball move up location: (6,7)
The current location of the ball = (6,7)
*/

package oot.lab7;

public class Main {

    public static void main(String[] args) {
        Ball p1 = new Ball(0,0);
        System.out.println(p1);
        p1.moveDown();
        p1.moveRight();
        System.out.println(p1);
        System.out.println("========================");
        
        Move p2 = new  Ball(3,4);
        System.out.println(p2);
        p2.moveUp();
        System.out.println(p2);
        System.out.println("========================");
        
        Move p3 = new Ball(5,6);
        System.out.println(p3);
        p3.moveRight();
        p3.moveUp();
        System.out.println(p3);
    }
    
}
