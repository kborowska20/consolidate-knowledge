package com.codecool.krk20161.javase.model;


import java.util.List;

public interface SearchBy {

      List<Book> searchBy(String title);

      List<Book> searchBy(Author author);
}
