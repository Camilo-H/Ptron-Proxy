/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.acces;

import co.edu.unicauca.facade.domain.Customer;
import co.edu.unicauca.facade.domain.Dish;
import co.edu.unicauca.facade.domain.State;

/**
 *
 * @author camilo
 */
public class OrderFacade {
    private Order order;
    
    public OrderFacade(){}
    
    public void createOrder(Customer prcust){
        order=new Order(prcust);
        order.setState(State.NEW);
    }
    public void addDish(Dish prdis, int pramunt){
        order.addDish(prdis, pramunt);
    }
    public void changeState(State prstate){
        order.setState(prstate);
    }
    public void cancelOrder(){
        order.setState(State.CANCELLED);
    }
    public Order getOrder(){
        return order;
    }
    public int totaldishes(){
        return order.getDetalist().size();
    }
    public int calcularTotal(){
        return order.calcularTotal();
    }
    public void save(IOrderRepository prrepo){
        prrepo.createOrder(order);
    }
    
}
