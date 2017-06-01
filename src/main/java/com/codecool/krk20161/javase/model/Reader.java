package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;


public class Reader extends Person implements SearchBy{
    private List<Book> booksList;

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

    public List<Book> searchBy(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for(int i = 0;i < this.booksList.size();i++){
            Book book = booksList.get(i);
            if(book.getTitle() == title) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    public List<Book> searchBy(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(int i = 0;i < this.booksList.size();i++){
            Book book = booksList.get(i);
            if(book.getAuthor() == author) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
