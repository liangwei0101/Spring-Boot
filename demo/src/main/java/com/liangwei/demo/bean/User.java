package com.liangwei.demo.bean;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class User {

    @Id
    @GeneratedValue
    private int no;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int no, String name,int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    protected User(){ }

}