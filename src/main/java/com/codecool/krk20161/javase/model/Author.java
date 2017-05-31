package com.codecool.krk20161.javase.model;

/**
 * Created by KBorowska on 31.05.2017.
 */
public class Author extends Person {

    public Author(String name) {
        super(name);
    }

    public Author(String name,String biography) {
        super(name);
        this.setBiography(biography);
    }


}
