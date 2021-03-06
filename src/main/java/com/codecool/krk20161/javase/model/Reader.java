package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;


public class Reader extends Person implements SearchBy{
    private List<Book> booksList = new ArrayList<>();

    public Reader(String name) {
        super(name);
    }

    public Reader(String name, List<Book> booksList) {
        super(name);
        this.setRead(booksList);
    }

    public void setRead(List<Book> booksList){
        this.booksList = booksList;
    }

    public List<Book> getRead(){
        return this.booksList;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for(int i = 0;i < this.booksList.size();i++){
            Book book = booksList.get(i);
            if(book.getTitle() == title) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    public List<Book> searchByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(int i = 0;i < this.booksList.size();i++){
            Book book = booksList.get(i);
            if(book.getAuthor().getName() == author.getName()) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
