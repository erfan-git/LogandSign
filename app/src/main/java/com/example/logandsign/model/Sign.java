package com.example.logandsign.model;

import java.io.Serializable;

public class Sign implements Serializable {
    private String userName = null;
    private String passWordd = null;

    public Sign(String userName, String passWordd) {
        this.userName = userName;
        this.passWordd = passWordd;
    }

    public Sign() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWordd(String passWordd) {
        this.passWordd = passWordd;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWordd() {
        return passWordd;
    }
}
