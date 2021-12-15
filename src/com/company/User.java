package com.company;

public class User {
//  fields
    public String name;
    public User(String name){
        this.name = name;

    }
//    Method
    public void sayHello(){
        System.out.println("Hi My name is " + this.name);
    }
}
