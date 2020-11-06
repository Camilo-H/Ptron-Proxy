/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.proxiApp;

import co.edu.unicauca.facade.acces.IOrderRepository;

/**
 *
 * @author camilo
 */
public interface IOrderService {
    void save(IOrderRepository repo);
}
