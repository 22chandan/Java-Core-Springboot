package com.webshopify.beans.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
    public int Id;
    public String name;
    public List<LoanAccounts> loanAccounts;

    public void setLoanAccounts(List<LoanAccounts> loanAccounts) {
        this.loanAccounts = loanAccounts;
    }

    public Customer(){
        System.out.println("I am starting");
    }

    public List<LoanAccounts> getLoanAccounts(){
        return loanAccounts;
    }


//    public void setLoanAccounts(LoanAccounts loanAccounts) {
//        this.loanAccounts = loanAccounts;
//    }

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