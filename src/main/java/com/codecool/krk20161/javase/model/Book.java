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
}
