package com.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Serializable {
    private List<Item> items;
    private String userName;
    private String heroName;
    public List<Item> getItems() {
        return items;
    }

    public Shop(String userName, String heroName) {
        this.userName = userName;
        this.heroName = heroName;
    }
    public Shop(){

    }

    public void setItems(List<Item> items) {
            this.items = items;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
