/*
run:
Constructor M
Constructor N
N talk: 0o0
===============
REference of R : 0
Reference of Q : 111
===============
Conves is a trade mark of BallA
Conves's ballA rolls smoothly
Conves's ballA bounces with factor = 657.0
Conves's ballA is a inflate 2.36458 cu.ft
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
    public static void main(String[] args){
        Q q = new Q(111);
        R p = new R();
        M n = new N();
        n.talk("0o0");
        System.out.println("===============");
        System.out.println(p.getAmount());
        System.out.println(q.getAmount());
        System.out.println("===============");
        
        Ball b = new Ball("Conves");
        doRoll(b);
        doBounce(b,657);
        doInflate(b, 2.36458);
    }

    public static void doRoll(Ball b){
        b.roll();
    }
    public static void doBounce(Ball b,float bf){
        b.bounce(bf);
    }
    public static void doInflate(Ball b,double bd){
        b.inflate(bd);
    }
    
    
}
