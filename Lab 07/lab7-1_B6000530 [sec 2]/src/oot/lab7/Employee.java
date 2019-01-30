
package oot.lab7;

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
