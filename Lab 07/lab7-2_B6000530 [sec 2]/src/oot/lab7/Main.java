/*
run:
Constructor N
Constructor M
m&m
Reference of P : 0
Reference of Q : 555
Adda is a trademark of Ball 
Adda's ball rolls smoothly 
Adda's ball bounces with factor = 22.0
*/

package oot.lab7;

public class Main {

    // ของ sec 1
    public static void main(String[] args) {
        Q q = new Q(555);
        P p = new P();
        M m = new M();
        m.talk("m&m");
        
        System.out.println(p.getAmount());
        System.out.println(q.getAmount());
        B b = new Ball("Adda");
        doRoll(b);
        doBounce(b,22);
    }
    public static void doRoll(Ro r){
        r.roll();
    }
    public static void doBounce(Bo b,float f){
        b.bounce(f);
    }
    
    public static void doInflate(B c, double d){
        // I don't know
    }
    
}
