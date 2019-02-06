/*
run:
Password length validated : false
Password only digit validated: true
Username lower case validated : false
======================================
Password length validated : true
Password only digit validated: false
Username lower case validated : false
======================================
Password length validated : true
Password only digit validated: true
Username lower case validated : true
======================================
 */
package oot.lab8;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
            Account acc1 = new Account("somSak", "11235813");         
            acc1.validateAll(); 
            Account acc2 = new Account("Yamaha","asddd111110");         
            acc2.validateAll(); 
            Account acc3 = new Account("honda","5456445645");//1 
            acc3.validateAll();     
    }
}

