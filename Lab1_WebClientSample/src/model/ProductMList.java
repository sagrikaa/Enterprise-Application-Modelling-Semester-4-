/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sagri
 */
@XmlRootElement
public class ProductMList {
    private List<ProductM> products = null;

    public ProductMList() {
    }
 
     @XmlElement
    public List<ProductM> getProducts() {
        return products;
    }
 
    public void setProducts(List<ProductM> products) {
        this.products = products;
    }
}
