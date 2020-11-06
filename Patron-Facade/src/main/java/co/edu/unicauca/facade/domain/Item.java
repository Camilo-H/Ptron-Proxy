/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain;

/**
 *
 * @author camilo
 */
public class Item {
    private Dish dish;
    private int amount;
    
    public Item (Dish prdish, int pramount){
        dish=prdish;
        amount=pramount;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish prdish) {
        dish = prdish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int pramount) {
        amount = pramount;
    }
    
}
