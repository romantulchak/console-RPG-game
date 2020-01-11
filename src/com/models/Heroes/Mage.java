package com.models.Heroes;

import com.models.EHeroes;
import com.models.Hero;

import java.io.Serializable;

public class Mage extends Hero implements Serializable  {
    public Mage(String name, int id){
        this.setId(id);
        this.setProfession(EHeroes.MAG.toString());
        this.setLevel(1);
        this.setAttackAmount(8);
        this.setHealthPoints(80);
        this.setManaPoints(100);
        this.setMaxHealthPoints(80);
        this.setMaxManaPoints(80);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGE);
        this.setMoney(0);
    }
}
