package com.example.putatoecategory;

import java.util.List;

public class parentmodelclass {
    String title;
    List<childmodelClass> li;

    public parentmodelclass(String title, List<childmodelClass> li) {
        this.title = title;
        this.li = li;
    }
}
