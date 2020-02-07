package com.models.Items;

import com.models.Hero;
import com.models.Item;

import java.io.Serializable;

public class HealLevelOne extends Item implements Serializable {

    private int healToRegenerate;

    public HealLevelOne(int id, String name, int weight, int price, boolean isDressed, boolean canBeSold, boolean canBeDressed ,int healToRegenerate) {
        super(id, name, weight, price, isDressed, canBeSold, canBeDressed);
        this.healToRegenerate = healToRegenerate;
    }


    public int getHealToRegenerate() {
        return healToRegenerate;
    }

    public void setHealToRegenerate(int healToRegenerate) {
        this.healToRegenerate = healToRegenerate;
    }

    @Override
    public void setItem(Hero hero) {
        if(hero !=null){
            double d = hero.getHealthPoints() - this.healToRegenerate;
            if ( d < 0 ){
                d = 0;
            }
            double healToRegenerate = this.healToRegenerate - d;
            hero.setHealthPoints(hero.getHealthPoints() + this.healToRegenerate);
            System.out.println("Was regenerated: " + healToRegenerate);
            this.removeItem(hero);
        }
    }

    @Override
    public void dropItem(Hero hero) {

    }

    @Override
    public void info() {
        System.out.printf("Id: %d,\t Name: %s \n" +
                        "Heal: %d \t" +
                        "Is Dress: %s \t Can be sell: %s \n",
                this.getId(),
                this.getName(),
                this.healToRegenerate,
                this.isDressed(),
                this.isCanBeSold()
        );
    }
}

