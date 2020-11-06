/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.presentación;

import co.edu.unicauca.facade.acces.*;
import co.edu.unicauca.facade.domain.*;
import co.edu.unicauca.proxiApp.*;

/**
 *
 * @author camilo
 */
public class FacadeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia de un objeto facade
        OrderFacade facade= new  OrderFacade();
        //Instancia de un objeto proxy
        IOrderService proxy=(IOrderService) new OrderServiceLogger(facade);
        
        //uso de las instancias
        facade.createOrder(new Customer(1, "Camilo Anacona", "cll 11 No. 1-15", "3204786942","Popayan"));
        facade.addDish(new Dish(1,"Pizza vegana", 11000), 3);
        facade.addDish(new Dish(2,"Hambueguesa special", 14000), 5);
        facade.addDish(new Dish(3,"Sandwich vegano", 8000), 4);
        facade.addDish(new Dish(4, "Jugo natural", 3000), 10);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se ha cambiado el estado a "+facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se ha cambiado el estado a "+facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se ha cambiado el estado a "+facade.getOrder().getState());
        
        //instancio un objeto de Proxyclient y le paso la orden que va a usar
        ProxyClient objCliente= new ProxyClient(proxy);
        objCliente.createOrder();
    }
    
}
