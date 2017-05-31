package com.codecool.krk20161.javase.model;


public class Book {
    private String title;
    private Author author;
    private String summary;

    public Book(String title, Author author) {
        this.setTitle(title);
        this.setAuthor(author);
    }

    public Book(String title, Author author, String summary) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setSummary(summary);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor(){
        return this.author;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }

    public String getSummary(){
        return this.summary;
    }
}
