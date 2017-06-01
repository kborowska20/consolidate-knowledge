package com.codecool.krk20161.javase.model;

import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Catalog implements SearchBy {
    private List<Book> bookList;

    public Catalog(){
        this.setBookList();
    }

    public void setBookList(){
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.bookList;
    }

    public void add(Book book) throws AlreadyInCatalogException {
        for(Book bookInList : this.bookList){
            if(bookInList.getTitle().equals(book.getTitle())) throw new AlreadyInCatalogException("Can't add book with same title twice");
        }
        bookList.add(book);
    }

    public void remove(Book book) {
        Iterator<Book> it = this.bookList.iterator();
        while (it.hasNext()) {
            Book book1 = it.next();
            if (book.getTitle().equals(book1.getTitle())&& book.getAuthor().getName().equals(book1.getAuthor().getName())) {
                it.remove();
            }
        }
    }

    public List<Book> searchByTitle(String title){
        List<Book> booksByTitle = new ArrayList<>();
        for(int i = 0;i < this.bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    public List<Book> searchByAuthor(Author author){
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : this.bookList) {
            if (Objects.equals(book.getAuthor().getName(), author.getName())) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
