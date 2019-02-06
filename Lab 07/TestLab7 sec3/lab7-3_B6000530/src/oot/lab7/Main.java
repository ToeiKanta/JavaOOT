/*
run:
The current location of the star = (9,9)
Star move right location +4 : (13,9)
Star move down location -9 : (13,0)
The current location of the star = (13,0)
=============================
The current location of the star = (4,10)
Star move up location +1 : (4,11)
The current location of the star = (4,11)
Star move left location -4 : (0,11)
The current location of the star = (0,11)
=============================
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
        StarPosition p1 = new StarPosition(9,9);
        System.out.println(p1);
        p1.starRight(2);
        p1.starDown(3);
        System.out.println(p1);
        System.out.println("=============================");
        
        StarPosition p2 = new StarPosition(4, 10);
        System.out.println(p2);
        p2.starUp(1);
        System.out.println(p2);
        p2.starLeft(2);
        System.out.println(p2);
        System.out.println("=============================");
    }
}
