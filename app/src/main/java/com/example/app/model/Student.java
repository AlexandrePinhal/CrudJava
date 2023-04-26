package com.example.app.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String promotion;
    private String email;
    private String phone;
    private int nbabs;
    public boolean delegate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surName) {
        this.surname = surname;
    }
    public String getPromotion() {return  promotion;}
    public void setPromotion(String promotion) {this.promotion = promotion;}
    public String getEmail() {return  email;}
    public void setEmail(String email) {this.email = email;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public int getNbAbs() {return nbabs;}
    public void setNbAbs(int nbabs) {this.nbabs = nbabs;}
    public boolean getDelegate() {return delegate;}
    public void setDelegate(boolean delegate) {this.delegate = delegate;}
    public Long getId() {return id;}
    public void setId(Long id) {
        this.id = id;
    }
}