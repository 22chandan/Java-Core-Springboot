package com.webshopify.beans.ci;


import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Customer implements Serializable {
    public int Id;
    public String name;
    private List<Accounts> accountsList;
    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    private Accounts accounts;
    public Customer(Accounts accounts, List<Accounts> accountsList){
        System.out.println("I am starting");
        this.accounts = accounts;
        this.accountsList=accountsList;
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
    public List<Accounts>getAccountsList(){
        return accountsList;
    }
    public void setName(String name) {
        this.name = name;
    }
}