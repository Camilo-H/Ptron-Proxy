/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.proxiApp;

import co.edu.unicauca.facade.acces.IOrderRepository;
import co.edu.unicauca.facade.acces.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 *
 * @author camilo
 */
public class OrderServiceLogger {
    private OrderFacade orderFacade;
    
     public OrderServiceLogger(OrderFacade prorderFacade){
        orderFacade = prorderFacade;
    }
    public void save(IOrderRepository prrepository){
        org.slf4j.Logger log = LoggerFactory.getLogger(OrderServiceLogger.class);
        prrepository.createOrder(orderFacade.getOrder());
        String message = "pedido guardado en la base";
        log.info(message);
        
    }
     
     
}
