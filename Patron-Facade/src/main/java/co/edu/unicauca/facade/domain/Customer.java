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
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;
    public Customer(int prid, String prname, String praddress, String prmobile, String prcity ){
        id=prid;
        name=prname;
        address=praddress;
        mobile=prmobile;
        city=prcity;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String praddress) {
        address = praddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String prmobile) {
        mobile = prmobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String prcity) {
        city = prcity;
    }
}
