/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.acces;

/**
 *
 * @author camilo
 */
public class Factory {
    private static Factory instance;
    
    private Factory(){}
    
    public static Factory getInstanceFactory() {
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public IOrderRepository getRepository(String type) {
        IOrderRepository resultado = null;
        if (type.equals("default")) {
            resultado = new OrderRepositoryList();
        }
        return resultado;
    }
    
}
