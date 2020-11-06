/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.acces;

import co.edu.unicauca.facade.domain.Customer;
import co.edu.unicauca.facade.domain.Dish;
import co.edu.unicauca.facade.domain.Item;
import co.edu.unicauca.facade.domain.State;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo
 */
public class Order {
    public int despatch ;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> detalist;

    public Order(Customer prcustomer){
        customer=prcustomer;        
    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int prdespatch) {
        despatch = prdespatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer prcustomer) {
        customer = prcustomer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate prdate) {
        date = prdate;
    }

    public State getState() {
        return state;
    }

    public void setState(State prstate) {
        state = prstate;
    }

    public List<Item> getDetalist() {
        return detalist;
    }

    public void setDetalist(List<Item> prdetalist) {
        detalist = prdetalist;
    }
    
    public void addDish(Dish prdish, int pramount){
        if(detalist==null){
            detalist=new ArrayList<>();
        }
        detalist.add(new Item(prdish,pramount));
    }
    
    public int calcularTotal(){
        int valor=0;
        int total=0;
        despatch=1500;
        for(Item i: detalist){
            valor=i.getDish().getPrice()*i.getAmount();
            total=total+valor;
        }
        return total + getDespatch();
    }



}
