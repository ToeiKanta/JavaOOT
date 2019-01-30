
package oot.lab7;


public class Q {
    protected int n;
    public Q(){
        
    }
    
    public Q(int n){
        this.n = n;
    }
    
    public int getAmount(){
        System.out.print("Reference of Q : ");
        return n;
    }
}
