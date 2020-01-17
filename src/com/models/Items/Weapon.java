package com.models.Items;

import com.models.Hero;
import com.models.IBaseItem;
import com.models.Item;

import java.io.Serializable;

public class Weapon extends Item implements Serializable {

    private int maxAttack;
    private int minAttack;
    private int averageAttack;


    public Weapon(int id,String name, int maxAttack, int minAttack, int price, int weight) {
        this.setId(id);
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
    public void setItem(Hero hero) {
        if (hero != null){
            hero.setAttackAmount(hero.getAttackAmount() + this.getAverageAttack());
            this.setDressed(true);

        }
    }

    @Override
    public void info() {
       System.out.printf("Id: %d, \t Name: %s \t Average attack: %d \n " +
                       "Min attack: %d - Max attack: %d \n" +
                       "Is Dressed: %s \n",
               this.getId(),
               this.getName(),
               this.averageAttack,
               this.minAttack,
               this.maxAttack,
               this.isDressed()
               );
    }

    @Override
    public void dropItem(Hero hero) {
        if (hero !=null){
            if (this.isDressed()){
                hero.setAttackAmount(hero.getAttackAmount() - this.averageAttack);
                this.setDressed(false);
            }else {
                System.out.println("The item has not been set");
            }
        }
    }
}
