package com.webshopify.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class LoanAccounts implements Serializable
{
    private int loanId;
    private String accountType="Loan Account";
    private double loanAmount;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
