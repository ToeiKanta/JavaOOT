/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

/**
 *
 * @author ToeiK
 */
public class YenCurrency extends Currency{
    private double money;
    
    public YenCurrency(String pocketMoney) {
        this.money = Double.valueOf(pocketMoney) * 3;
    }

    @Override
    public void printCurrency() {
        System.out.println("Yens: " + money);
    }
    
    
}
