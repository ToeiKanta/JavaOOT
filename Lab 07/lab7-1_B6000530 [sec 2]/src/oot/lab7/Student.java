
package oot.lab7;

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
