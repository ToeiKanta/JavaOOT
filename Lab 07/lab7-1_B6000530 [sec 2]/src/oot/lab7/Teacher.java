
package oot.lab7;

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
