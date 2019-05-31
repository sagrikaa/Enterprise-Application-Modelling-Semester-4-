/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_webclientsample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import model.ProductMList;
import model.ProductM;
import session.Product;
import session.Products_Type;

/**
 *
 * @author sagri
 */
public class Lab1_WebClientSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {

        Products_Type prodType = listing();
        List<Product> prodList = prodType.getProduct();

        List<ProductM> pmlist = new ArrayList<>();
        //loop through each prodType.getProducts()
        for (Product p : prodList) {
            ProductM pm = new ProductM();
            pm.setName(p.getName());
            pm.setLocation(p.getLocation());
            pm.setPrice(p.getPrice());
            pm.setQuantity(p.getQuantity());

            pmlist.add(pm);
        }

        //Adding a new Product
        ProductM newProd = new ProductM();
        newProd.setName("Book");
        newProd.setLocation("Humber");
        newProd.setPrice(40);
        newProd.setQuantity(3);
        
        pmlist.add(newProd);
        
        ProductMList PMlist = new ProductMList();
        PMlist.setProducts(pmlist);

        //for each product, create Products object, set all the properties
        //Adding a Product
        try {
            
        //Marshalling 
            JAXBContext context = JAXBContext.newInstance(ProductMList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(PMlist, new File("products.xml"));
            
            
            //Unmarshalling
            JAXBContext jaxbContext = JAXBContext.newInstance(ProductMList.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            
            //We had written this file in marshalling example
            ProductMList productList = (ProductMList) jaxbUnmarshaller.unmarshal( new File("products.xml") );
            
            for(Product p :prodList){
                StringBuilder sb = new StringBuilder();
                sb.append(p.getName()).append(p.getPrice()).append(p.getQuantity());
                
                System.out.println(sb);
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static Products_Type listing() {
        session.Products_Service service = new session.Products_Service();
        session.Products port = service.getProductsPort();
        return port.listing();
    }

}
