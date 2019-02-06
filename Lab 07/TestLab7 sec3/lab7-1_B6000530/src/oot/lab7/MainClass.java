/*
run:
Name : Mumin,	 Gender: Female, RollNo = 123
Name : Junaid,	 Gender: Male, Salary = 342.16
Name : Aaamir,	 Gender: Female, Desigantion = Analyst
Name : Miarr,	 Gender: Female, RollNo = 123
 */
package oot.lab7;

/**
 *
 * @author All User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person [] p = new Person[3];
        p[0] = new Student("Mumin", "Female",123);
        p[1] = new Teacher("Junaid", "Male",342.155);
        p[2] = new Employee("Aaamir", "Female","Analyst");
        
        for(Person x:p){
            System.out.println(x.getName() + ", " + x.getDetails());
        }
        p[0].name = "Miarr";
        System.out.println(p[0].getName() + ", " + p[0].getDetails());
        
    }
    
}
