package org.first.application;

import org.first.application.model.Customer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class TestCustomer 
{
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("application.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Customer customer = (Customer)factory.getBean("customer");
        
        //ByDefault Spring create Singleton object
        Customer customer2 = (Customer)factory.getBean("customer");
        
        System.out.println("Customer ID " +customer.getId());
        System.out.println("Customer Name: "+ customer.getName());
        System.out.println("Email : "+ customer.getEmail());
        System.out.println("Mobile No: " + customer.getMobile());
        
        
        
    }
}
