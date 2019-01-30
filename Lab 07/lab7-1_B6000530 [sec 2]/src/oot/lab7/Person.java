
package oot.lab7;

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
