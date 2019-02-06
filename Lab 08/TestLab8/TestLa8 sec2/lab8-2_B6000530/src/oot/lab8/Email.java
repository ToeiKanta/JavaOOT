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
public class Email implements EmailToolBox{
    private String fullName,domainName,emailName;
    
    Email(String adds){
        emailName = adds;
        String[] temp = adds.split("@");
        fullName = temp[0];
        domainName = temp[1];
    }

    @Override
    public void getInfo() {
        System.out.println("Email : "+emailName);
        System.out.println("Email Prefix : "+fullName);
        System.out.println("Domain Name : "+domainName);
    }
    
}
