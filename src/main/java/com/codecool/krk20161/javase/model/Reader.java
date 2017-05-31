package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KBorowska on 30.05.2017.
 */
public class Reader extends Person{
    private ArrayList<Book> booksList;

    public Reader(String name) {
        super(name);
    }

    public Reader(String name, ArrayList<Book> booksList) {
        super(name);
        this.setBooksList(booksList);
    }

    public void setBooksList(ArrayList<Book> booksList){
        this.booksList = booksList;
    }


}
