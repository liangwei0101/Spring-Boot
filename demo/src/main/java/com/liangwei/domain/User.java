package com.liangwei.domain;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int no;

    private String name;

    private int age;

    protected User() {}

    public User(String name,int age){
        this.age = age;
        this.name = name;
    }
}
