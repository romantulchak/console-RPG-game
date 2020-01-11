package com.models.Heroes;

import com.models.EHeroes;
import com.models.Hero;

import java.io.Serializable;

public class Archer extends Hero implements Serializable {
    public Archer(String name,int id){
        this.setId(id);
        this.setProfession(EHeroes.ARCHER.toString());
        this.setLevel(1);
        this.setAttackAmount(9);
        this.setHealthPoints(90);
        this.setManaPoints(75);
        this.setMaxHealthPoints(90);
        this.setMaxManaPoints(75);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setMoney(0);

    }

}
