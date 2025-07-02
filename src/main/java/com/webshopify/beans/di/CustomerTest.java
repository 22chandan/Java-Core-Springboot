package com.webshopify.beans.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        Customer customer = context.getBean(Customer.class);
//        System.out.println(customer.getLoanAccounts());
        for(LoanAccounts n : customer.getLoanAccounts()){
            System.out.println(n);
        }
    }
}
