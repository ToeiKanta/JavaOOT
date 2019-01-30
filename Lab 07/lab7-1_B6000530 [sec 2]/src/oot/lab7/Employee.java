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
public class Employee extends Person{ //2
  String designation;
  Employee(String n,String g,String d){
    super(n,g);
    this.designation = d;
  }

  @Override
  String getDetails() { //3
    return "Designation = "+designation;
  }
}
