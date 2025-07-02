package com.webshopify.beans.ci;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Accounts implements Serializable {
    private int accid;
    private String acctype;

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
}