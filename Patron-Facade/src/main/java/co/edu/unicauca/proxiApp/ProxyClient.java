/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.proxiApp;

import co.edu.unicauca.facade.acces.Factory;
import co.edu.unicauca.facade.acces.IOrderRepository;

/**
 *
 * @author camilo
 */
public class ProxyClient {
    private IOrderService orderService;
    
    public ProxyClient(IOrderService prorderservice){
        orderService=prorderservice;
    }
    public void createOrder(){
        IOrderRepository repository = Factory.getInstanceFactory().getRepository("default");
        orderService.save(repository);
    }
    
    
    
}
