/*
run:
Drinking Yen Yen 420ml
Price: 15 baht
Change owner to Udom.
===============
Drinking Yen Yen 500ml
Price: 0.5 usd
Change owner to Nose Udom.
===============
 */
package oot.lab7;

/**
 *
 * @author All User
 */
public class YenYen extends Beverage implements Changeable{
    private String name;
    private String owner;
    private String amount;
    
    YenYen(String price,String curr,String amount){
        super.price = price;
        super.currency = curr;
        this.amount = amount;
        this.name = "Yen Yen";
        
    }
    
    @Override
    void drink() {
        System.out.println("Drinking " + this.name +  " " + amount);
    }

    @Override
    public String getOwner() {
        return owner;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public void setOwner(String o) {
        this.owner = o;
    }
}
