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
    public void buyItem(Hero hero, int id){
        Item item = items.stream().filter(s->s.getId() == id).findFirst().orElse(null);
        if (item !=null) {
            if (hero.getMoney() > item.getPrice()) {
                this.getItems().remove(item);
                hero.setMoney(hero.getMoney() - item.getPrice());
                hero.getInventory().setItems(item);
                System.out.println("Was purchased" + item.getName());
            }else {
                System.out.println("Do not enough money");
            }
        }else {
        	System.out.println("Item not found");
        }
    }
}
