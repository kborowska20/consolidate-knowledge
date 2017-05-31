package com.codecool.krk20161.javase.model;

/**
 * Created by KBorowska on 31.05.2017.
 */
public class Person {
    private String name;

    public void Person(String name){
        this.setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
