/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab7;

/**
 *
 * @author All User
 */
public class Employee extends Person{
    String designation;
    Employee(String n , String g , String d){
        super(n,g);
        this.designation = d;
    }
    
    public String getDetails(){
        return "Desigantion = " + designation;
    }
    
}
