package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KBorowska on 30.05.2017.
 */
public class Library {
    private Catalog catalog;

    public Library(){
        this.setCatalog(catalog);
    }

    public void setCatalog(Catalog catalog){
        this.catalog = catalog;
    }

    public Catalog getCatalog(){
        return this.catalog;
    }
}
