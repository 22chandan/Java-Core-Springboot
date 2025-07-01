package com.webshopify.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
    public static void main(String[] args) {
//        // Load Spring configuration file from classpath
//        ApplicationContext context = new ClassPathXmlApplicationContext("webshopifyme-beans.xml");
//
//        // Retrieve the bean (assuming it’s named "customerBean")
//        Customer customer = (Customer) context.getBean("Customer");
//        CreditCardAccounts cd = (CreditCardAccounts) context.getBean("CreditCardAccounts");
//        System.out.println(customer.getName());
//        System.out.println(cd.getCardId());
        //annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(weShopifyAppConfirguration.class);
        Customer  customer = (Customer) context.getBean("customer");
        System.out.println(customer.getLoanAccounts());
        for(String n : context.getBeanDefinitionNames()){
            System.out.println(n);
        }
    }
}
