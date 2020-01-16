package com.models.Items;

import com.models.IBaseItem;
import com.models.Item;

import java.io.Serializable;

public class Weapon extends Item implements Serializable {

    private int maxAttack;
    private int minAttack;
    private int averageAttack;


    public Weapon(String name, int maxAttack, int minAttack, int price, int weight) {
        this.setName(name);
        this.setPrice(price);
        this.setWeight(weight);
        this.maxAttack = maxAttack;
        this.minAttack = minAttack;
        this.averageAttack = getAverageAttack();
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(int minAttack) {
        this.minAttack = minAttack;
    }

    public int getAverageAttack() {
        return (minAttack + maxAttack) / 2;
    }


    @Override
    public void info() {
       System.out.printf("Name: %s \t Attack: %d \n",
               this.getName(),
               this.getAverageAttack());
    }
}
