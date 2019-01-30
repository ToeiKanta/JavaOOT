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
public class MainClass {
  public static void main(String[] args) {
    Person [] p = new Person[3];
    p[0] = new Student("Mumin","Female",123);
    p[1] = new Teacher("Junaid","Male",342.155);
    p[2] = new Employee("Aaamir","Female","Analyst");

    for(Person x:p){
      System.out.println(x.getName() + ", " + x.getDetails());
    }

    p[0].name = "Miarr";
    System.out.println(p[0].getName() + ", " + p[0].getDetails());
  }
}