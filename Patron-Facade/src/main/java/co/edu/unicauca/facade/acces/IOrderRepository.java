/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.acces;

import java.util.List;

/**
 *
 * @author camilo
 */
public interface IOrderRepository {
    void createOrder(Order order);
    
    List<Order> list();
}
