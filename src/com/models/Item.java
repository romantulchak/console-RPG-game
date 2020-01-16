package com.models;

import java.io.Serializable;

public abstract class Item implements IBaseItem, Serializable {



    private int id;
    private String name;
    private int weight;
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void removeItem(User user) {

    }



    @Override
    public void setItem(User user) {

    }

    @Override
    public void dropItem(User user) {

    }

    @Override
    public void takeOfItem() {

    }
}
