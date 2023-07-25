package com.example.putatoecategory;

import java.util.ArrayList;
import java.util.List;

public class ProductType {
    private List<childmodelClass> dairyProducts = new ArrayList<childmodelClass>();
    private List<childmodelClass> footwear = new ArrayList<childmodelClass>();
    private List<childmodelClass> fruitsVegetables = new ArrayList<childmodelClass>();
    private List<childmodelClass> grocery = new ArrayList<childmodelClass>();

    public List<childmodelClass> getDairyProducts() {
        return dairyProducts;
    }

    public void setDairyProducts(List<childmodelClass> dairyProducts) {
        this.dairyProducts = dairyProducts;
    }

    public List<childmodelClass> getFootwear() {
        return footwear;
    }

    public void setFootwear(List<childmodelClass> footwear) {
        this.footwear = footwear;
    }

    public List<childmodelClass> getFruitsVegetables() {
        return fruitsVegetables;
    }

    public void setFruitsVegetables(List<childmodelClass> fruitsVegetables) {
        this.fruitsVegetables = fruitsVegetables;
    }

    public List<childmodelClass> getGrocery() {
        return grocery;
    }

    public void setGrocery(List<childmodelClass> grocery) {
        this.grocery = grocery;
    }
}
