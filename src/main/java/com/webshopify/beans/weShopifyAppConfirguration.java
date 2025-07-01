package com.webshopify.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.webshopify")
public class weShopifyAppConfirguration {
    @Bean
    public Customer customer(){
        Customer cus = new Customer();
        cus.setId(13);
        cus.setName("i am chandans");
        return cus;
    }
    @Bean
    public LoanAccounts loanAccount(){
        LoanAccounts loanaccount  = new LoanAccounts();
        return loanaccount;
    }
}
