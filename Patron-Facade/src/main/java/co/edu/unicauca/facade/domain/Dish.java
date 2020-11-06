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
public class Dish {
    private int id;
    private String name; 
    private int price;
    
    public Dish(int prId, String prName, int prPrice){
        id=prId;
        name=prName;
        price=prPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int prid) {
        id = prid;
    }

    public String getName() {
        return name;
    }

    public void setName(String prname) {
        name = prname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int prprice) {
        price = prprice;
    }
    @Override
    public String toString(){
        return "Id: "+price+" name: "+ name+" price: "+price;
        
        
    }
}
