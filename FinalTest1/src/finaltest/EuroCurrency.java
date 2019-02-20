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
public class EuroCurrency extends Currency{
    private double money;
    
    public EuroCurrency(String pocketMoney) {
        this.money = Double.valueOf(pocketMoney) / 30;
    }

    @Override
    public void printCurrency() {
        System.out.println("Euro: " + money);
    }
    
}
