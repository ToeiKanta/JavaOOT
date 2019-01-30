/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab7;

/**
 *
 * @author ToeiK
 */
public class Teacher extends Person{
  double salary;
  Teacher(String n,String g, double s){
    super(n,g);
    this.salary=s;
  }

  public String getDetails(){
    return String.format("Salary = $%.2f", salary);
  }
}