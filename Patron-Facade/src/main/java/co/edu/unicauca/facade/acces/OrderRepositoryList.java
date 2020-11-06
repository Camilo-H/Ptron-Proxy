/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.acces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo
 */
public class OrderRepositoryList implements IOrderRepository {
    private static List<Order> orderLists;
    
    public OrderRepositoryList(){
        orderLists= new ArrayList<Order>();
    }
    @Override
    public void createOrder(Order order) {
        orderLists.add(order);
    }

    @Override
    public List<Order> list() {
       return orderLists;
    }
    
    
}