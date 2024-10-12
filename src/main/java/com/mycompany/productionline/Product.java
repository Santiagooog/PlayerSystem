
package com.mycompany.productionline;

import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.xml.crypto.Data;


public abstract class Product implements Item{

    String manufacturer;
    int serialNumber; 
    Date manufacturedOn;
    String name;
    
    Integer currentProductionNumber;

    public Product() {
    }
    
    
    
    public Product(String name){
        this.name = name;
    }
    
    public Product(String name, Integer currenProductionNumber, Date manufacredOn){
        this.name = name;
        this.currentProductionNumber = serialNumber+1;
        this.manufacturedOn = new Date();
    }

    @Override
    public String toString() {
        return "Product{" + "manufacturer=" + manufacturer + ", serialNumber=" + serialNumber + ", manufacturedOn=" + manufacturedOn + ", name=" + name + '}';
    }

    
    
    
    
    
    

    @Override
    public void setProductionNumber(int a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setName(String a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String setName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Date getManufacturedDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getSerialNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
