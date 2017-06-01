package com.codecool.krk20161.javase.model;

import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.List;


public class Catalog implements SearchBy {
    private List<Book> bookList;

    public Catalog(){
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.bookList;
    }

    public void add(Book book) throws AlreadyInCatalogException {
        if (!this.bookList.contains(book)) {
            bookList.add(book);
        } else throw new AlreadyInCatalogException("Can't add book with same title twice");
    }

    public boolean remove(Book book) {
        if (this.bookList.contains(book)) {
            bookList.remove(book);
            return true;
        } else {
            return false;
        }
    }

    public List<Book> searchByTitle(String title){
        List<Book> booksByTitle = new ArrayList<>();
        for(int i = 0;i < this.bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getTitle() == title) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    public List<Book> searchByAuthor(Author author){
        List<Book> booksByAuthor = new ArrayList<>();
        for(int i = 0;i < this.bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getAuthor().getName() == author.getName()) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
