package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;


public class Catalog implements BookList {
    private List<Book> bookList;

    public Catalog(){
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.bookList;
    }

    public void add(Book book){
        if(this.bookList.contains(book)){
            bookList.add(book);
        }
    }

    public boolean remove(Book book) {
        if (this.bookList.contains(book)) {
            bookList.remove(book);
            return true;
        } else {
            return false;
        }
    }
}
