/*
run:
First Name : hello
Last Name : world
Email : hello.w@gmail.com
Email Prefix : hello.w
Domain Name : gmail.com

First Name : java
Last Name : simple
Email : java.s@sut.ac.th
Email Prefix : java.s
Domain Name : sut.ac.th
 */
package oot.lab8;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User us1 = new User("hello World", new Email("hello.w@gmail.com"));     
        us1.getInfo();     
        System.out.println(); 
        
        User us2 = new User("java SiMpLe", new Email("java.s@sut.ac.th"));     
        us2.getInfo(); 
        
    }
    
}
