package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KBorowska on 30.05.2017.
 */
public class Reader extends Person{
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

}
