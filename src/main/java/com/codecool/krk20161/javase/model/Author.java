package com.codecool.krk20161.javase.model;


public class Author extends Person {
    private String biography;

    public Author(String name) {
        super(name);
    }

    public Author(String name,String biography) {
        super(name);
        this.setBiography(biography);
    }

    public void setBiography(String biography){
        this.biography = biography;
    }

    public String getBiography(){
        return this.biography;
    }


}
