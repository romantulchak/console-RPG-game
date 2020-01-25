package com.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Inventory implements Serializable {
    private String name;
    private ArrayList<Item> items = new ArrayList<>();


    public Inventory(String name){
        this.name = name;
    }

    public Inventory() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items.add(items);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
