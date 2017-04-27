package com.yang.example.model;

/**
 * @author Yangjing
 */
public class Account {
    private int id;
    private String account_name;
    private String pwd;

    public Account() {
    }

    public Account(int id, String account_name, String pwd) {
        this.id = id;
        this.account_name = account_name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
