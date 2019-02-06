/*
run:
Equation: 120+120
Result: 240

Equation: 240-80
Result: 160

Equation: 240/160
Result: 1
 */
package oot.lab8;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Calculator cal1 = new Calculator("120+120");         
         System.out.println("Equation: " + cal1.getEquation());         
         System.out.println("Result: " + cal1.getResult());         
         System.out.println(); 
         Calculator cal2 = new Calculator("240" + "-" + new Calculator("40*2").getResult());         
         System.out.println("Equation: " + cal2.getEquation());         
         System.out.println("Result: " + cal2.getResult());         
         System.out.println(); 
         Calculator cal3 = new Calculator(cal1.getResult() + "/" + cal2.getResult());         
         System.out.println("Equation: " + cal3.getEquation());         
         System.out.println("Result: " + cal3.getResult());
    }
    
}
