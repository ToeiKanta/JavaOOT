package oot.lab7;

public final class P extends Q {
    
    public P(int n) {
        super(n);
    }

    public P() {
        
    }

    @Override
    public int getAmount(){
        System.out.print("Reference of P : ");
        return super.n;
    }
}
