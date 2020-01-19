package com.models;

import java.io.Serializable;

public abstract class Item implements IBaseItem, Serializable {



    private int id;
    private String name;
    private int weight;
    private int price;
    private boolean isDressed;
    private boolean canBeSold;

    protected Item(int id, String name, int weight, int price, boolean isDressed, boolean canBeSold) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.isDressed = isDressed;
        this.canBeSold = canBeSold;
    }

    public boolean isCanBeSold() {
        return canBeSold;
    }

    public void setCanBeSold(boolean canBeSold) {
        this.canBeSold = canBeSold;
    }

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
    public void removeItem(Hero hero) {
        if (hero != null){
            hero.getInventory().getItems().remove(this);
        }
    }





    @Override
    public void takeOfItem(int id) {

    }

    @Override
    public void info() {
        System.out.printf("Id: %d,\t Name: %s \n" +
                        "Is Dress: %s \t Can be sell: %s",
                this.id,
                this.name,
                this.isDressed,
                this.canBeSold
                );
    }

    public boolean isDressed() {
        return isDressed;
    }

    public void setDressed(boolean dressed) {
        isDressed = dressed;
    }

    @Override
    public void sellItem(Hero hero) {
        if (hero !=null && !this.isDressed()){
            if (canBeSold) {
                hero.setMoney(hero.getMoney() + this.price);
                hero.getInventory().getItems().remove(this);

            }else {
                System.out.println("Item cannot be sold");
            }
        }else {
            System.out.println("Pls drop the item");
        }
    }
}
