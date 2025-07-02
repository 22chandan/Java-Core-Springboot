package com.webshopify.beans.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Serializable;

public class Test implements Serializable {
    public static void main(String[] agrs){
        ApplicationContext context  = new AnnotationConfigApplicationContext(Appconfig.class);
        Customer customer = context.getBean(Customer.class);
        System.out.print(customer.getAccounts().getAcctype());
        System.out.println(customer.getAccountsList());
    }
}
