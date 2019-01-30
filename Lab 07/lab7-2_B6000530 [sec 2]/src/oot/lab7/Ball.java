
package oot.lab7;


public class Ball extends B{
    private String b;
    
    Ball(String b){
        System.out.println(b + " is a trademark of Ball ");
        this.b = b;
    }
    
    @Override
    void inflate(double volume) {
        
    }

    @Override
    public void bounce(float bf) {
        System.out.printf("%s's ball bounces with factor = %.1f\n",b,bf);
    }

    @Override
    public void roll() {
        System.out.println(b + "'s ball rolls smoothly ");
    }
}
