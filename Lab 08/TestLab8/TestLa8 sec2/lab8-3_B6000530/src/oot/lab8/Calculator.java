/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8;

public class Calculator implements CalculatorTools{
    private int ans;
    private String eq;
    // positive number only
    
    
    public Calculator(String eq) {
        this.eq = eq;
        String[]t = new String[2];
        for(int i=0;i<eq.length();i++){
            switch(eq.charAt(i)){
                case '+' :
                    t = eq.split("\\+");
                    ans = Integer.valueOf(t[0]) + Integer.valueOf(t[1]);
                    break;
                case '-' :
                    t = eq.split("-");
                    ans = Integer.valueOf(t[0]) - Integer.valueOf(t[1]);
                    break;
                case '*' :
                    t = eq.split("\\*");
                    ans = Integer.valueOf(t[0]) * Integer.valueOf(t[1]);
                    break;
                case '/' :
                    t = eq.split("/");
                    ans = Integer.valueOf(t[0]) / Integer.valueOf(t[1]);
                    break;
            }
        }
    }

    @Override
    public String getEquation() {
        return eq;
    }

    @Override
    public int getResult() {
        return ans;
    }
    
}
