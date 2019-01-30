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
public class Student extends Person{
  int rollNo;
  Student(String n , String g, int r){
    super(n,g);
    this.rollNo = r;
  }
  String getDetails(){
    return "RollNo = " + rollNo;
  }
}
