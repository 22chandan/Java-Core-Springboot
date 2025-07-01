package com.webshopify.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class Customer implements Serializable {
    public int Id;
    public String name;
    @Autowired
    public LoanAccounts loanAccounts;

    public Customer(){
        System.out.println("I am starting");
    }
    public LoanAccounts getLoanAccounts(){
        return loanAccounts;
    }

    public void setLoanAccounts(LoanAccounts loanAccounts) {
        this.loanAccounts = loanAccounts;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
