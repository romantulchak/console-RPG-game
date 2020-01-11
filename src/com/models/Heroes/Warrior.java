package com.models.Heroes;

import com.models.EHeroes;
import com.models.Hero;

import java.io.Serializable;

public class Warrior extends Hero implements Serializable {

    public Warrior(String name, int id){
        this.setId(id);
        this.setProfession(EHeroes.WARRIOR.toString());
        this.setLevel(1);
        this.setAttackAmount(12);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setMoney(0);
    }


}
