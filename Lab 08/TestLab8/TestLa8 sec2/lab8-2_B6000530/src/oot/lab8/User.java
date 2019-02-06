/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8;

/**
 *
 * @author ToeiK
 */
public class User implements UserToolBox{
    private String firstName, lastName;
    private Email email;
    //lower case only
    
    User(String name,Email email){
        setName(name);
        this.email = email;
    }
    
    @Override
    public void setName(String name) {
        String[] temp = name.split(" ");
        firstName = temp[0].toLowerCase();
        lastName = temp[1].toLowerCase();
    }

    @Override
    public void getInfo() {
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        email.getInfo();
    }
}
