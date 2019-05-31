/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author sagri
 */
@XmlRootElement
public class ProductM {
    
    protected String location;
    protected String name;
    protected double price;
    protected Integer quantity;
   

    
    @XmlElement
    public String getLocation() {
        return location;
    }
    @XmlElement
    public String getName() {
        return name;
    }
 @XmlElement
    public double getPrice() {
        return price;
    }
@XmlElement
    public Integer getQuantity() {
        return quantity;
    }



    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    
}
