package com.models.Heroes;

import com.models.EHeroes;
import com.models.Hero;
import com.models.Inventory;

import java.io.Serializable;

public class Archer extends Hero implements Serializable {
    public Archer(String name, int id, Inventory inventory){
        this.setId(id);
        this.setMaxHealthPoints(90);
        this.setMaxManaPoints(75);
        this.setProfession(EHeroes.ARCHER.toString());
        this.setLevel(1);
        this.setAttackAmount(9);
        this.setHealthPoints(90);
        this.setManaPoints(75);
        this.setDefence(6);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setMoney(0);
        this.setInventory(inventory);

    }

}
