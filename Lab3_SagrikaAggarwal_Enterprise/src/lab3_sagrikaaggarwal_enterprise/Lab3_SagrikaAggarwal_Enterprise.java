/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sagrikaaggarwal_enterprise;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.w3c.dom.NodeList;

/**
 *
 * @author sagri
 */
public class Lab3_SagrikaAggarwal_Enterprise {

    /**
     * 
     * @param args the command line arguments
     * 
     */
    
    static SOAPMessage messageListing, messageProduct;
    public static void listing() throws SOAPException, IOException{
       
         MessageFactory factory = MessageFactory.newInstance();
          messageListing = factory.createMessage();
        
        SOAPPart soapPart = messageListing.getSOAPPart();
        
        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        
        SOAPHeader soapHeader  = soapEnvelope.getHeader();

        SOAPBody soapBody = messageListing.getSOAPBody();
        

        soapEnvelope.addNamespaceDeclaration("S", "http://schemas.xmlsoap.org/soap/envelope/");
        
//       soapEnvelope.removeNamespaceDeclaration("SOAP-ENV");
      
        soapBody.setPrefix("S");
        soapEnvelope.setPrefix("S");
        
       
         
       

         QName Qname = new QName("http://services/","listing" , "ns2");
         
         SOAPBodyElement bodyElement = soapBody.addBodyElement(Qname);
          messageListing.writeTo(System.out);
          
    }
    
 
    
       public static void ProductMessage(String id) throws SOAPException, IOException{
       
         MessageFactory factory = MessageFactory.newInstance();
          messageProduct = factory.createMessage();
        
        SOAPPart soapPart = messageProduct.getSOAPPart();
        
        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        
        SOAPHeader soapHeader  = soapEnvelope.getHeader();

        SOAPBody soapBody = messageProduct.getSOAPBody();
        

        soapEnvelope.addNamespaceDeclaration("S", "http://schemas.xmlsoap.org/soap/envelope/");
        
//       soapEnvelope.removeNamespaceDeclaration("SOAP-ENV");
      
        soapBody.setPrefix("S");
        soapEnvelope.setPrefix("S");
        
       
         
       

         QName Qname = new QName("http://services/","getproduct" , "ns2");
         
         SOAPBodyElement bodyElement = soapBody.addBodyElement(Qname);
         
           SOAPElement productElement = bodyElement.addChildElement("ProductID");
           productElement.addTextNode(id);
           
           
          messageProduct.writeTo(System.out);
          
    }
    
       public static void displayListProduct() throws SOAPException, IOException{
       
       SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        
        SOAPConnection connection = soapConnectionFactory.createConnection();
    
        URL endpoint = new URL("http://flipbits.ddns.net:8080/Lab1/Products"); 
        
        SOAPMessage response = connection.call(messageListing, endpoint);       
        connection.close();
        
        
        
        SOAPBody responseBody = response.getSOAPBody();
        
        NodeList list = responseBody.getElementsByTagName("product");
        if (list.getLength() > 0){ 
            for(int i = 0 ; i < list.getLength() ; i++){
                for(int j = 0 ; j < 5 ; j++)
                   System.out.println("\n"+list.item(i).getChildNodes().item(j).getNodeName()+":"+list.item(i).getChildNodes().item(j).getTextContent());
            }
        }
        else{
            System.out.println("Can not display");
        }
          
    }
     
     public static void displayProduct() throws SOAPException, IOException{
       
       SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        
        SOAPConnection connection = soapConnectionFactory.createConnection();
    
        URL endpoint = new URL("http://flipbits.ddns.net:8080/Lab1/Products"); 
        
        SOAPMessage response = connection.call(messageProduct, endpoint);       
        connection.close();
        
        
        
        SOAPBody responseBody = response.getSOAPBody();
        
        NodeList list = responseBody.getElementsByTagName("Product");
        if (list.getLength() > 0){ 
            for(int i = 0 ; i <5 ; i++)
                
                   System.out.println("\n"+list.item(0).getChildNodes().item(i).getNodeName()+":"+list.item(0).getChildNodes().item(i).getTextContent());
            
        }
        else{
            System.out.println("Can not display");
        }
          
    }  
       
    public static void main(String[] args) throws SOAPException, IOException  {
        
        listing();
       displayListProduct();
       
        ProductMessage("1");
        displayProduct();
        
    }
    
}
