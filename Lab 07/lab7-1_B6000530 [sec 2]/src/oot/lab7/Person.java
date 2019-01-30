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
abstract class Person {
  String name;
  final String gender;

  Person(String n , String g){
    this.name = n;
    this.gender = g;
  }

  abstract String getDetails(); // 1
  public String getName(){
    return "Name: "+name+" ,\t Gender: "+ gender;
  }
}
