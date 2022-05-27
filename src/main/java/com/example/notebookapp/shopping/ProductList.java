package com.example.notebookapp.shopping;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    public List<String> list(){
        List<String> productList = new ArrayList<>();

        productList.add(0,"phone");
        productList.add(1,"earphone");
        productList.add(2,"mouse");
        productList.add(3,"keyboard");

        return productList;
    }
}
