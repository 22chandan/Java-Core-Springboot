package com.webshopify.beans.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan
public class weShopifyAppConfirguration {
    @Autowired
    List<LoanAccounts> loanaccount;
    @Bean
    public Customer customer(){
        Customer cus = new Customer();
        cus.setId(13);
        cus.setName("i am chandans");
        cus.setLoanAccounts(loanaccount);
        return cus;
    }
    @Bean
    public LoanAccounts loanAccount1(){
        LoanAccounts loanaccount  = new LoanAccounts();
        return loanaccount;
    }
    @Bean
    public LoanAccounts loanAccount2(){
        LoanAccounts loanaccount  = new LoanAccounts();
        return loanaccount;
    }
    @Bean
    public LoanAccounts loanAccount3(){
        LoanAccounts loanaccount  = new LoanAccounts();
        return loanaccount;
    }
}
