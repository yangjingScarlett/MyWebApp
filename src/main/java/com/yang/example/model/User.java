package com.yang.example.model;

import java.util.Date;

/**
 * @author Yangjing
 */
public class User {
    private int id;
    private String name;
    private String sex;
    private Date birthDate;

    public User(int id, String name, String sex, Date birthDate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
