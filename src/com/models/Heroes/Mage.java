package com.models.Heroes;

import com.models.EHeroes;
import com.models.Hero;
import com.models.Inventory;
import com.models.Skill;
import com.models.Skills.All.Magical.FireBlast;

import java.io.Serializable;
import java.util.ArrayList;

public class Mage extends Hero implements Serializable  {
    public Mage(String name, int id, Inventory inventory){
        super();
        this.setId(id);
        this.setMaxHealthPoints(80);
        this.setMaxManaPoints(80);
        this.setProfession(EHeroes.MAG.toString());
        this.setLevel(1);
        this.setAttackAmount(8);
        this.setHealthPoints(80);
        this.setManaPoints(100);
        this.setPhysicalArmor(4);
        this.setMagicalArmor(11);
        this.setName(name);
        this.setDefence(4);
        this.setAttackType(AttackType.MAGICAL_RANGE);
        this.setMoney(500);
        this.setInventory(inventory);
        this.setMaxWeight(500);
        this.setCriticalChance(0.15);
        this.setCriticalHit(1.55);
        this.setWin(0);
        this.setLose(0);
        ArrayList<Skill> skills = new ArrayList<>();
        FireBlast f = new FireBlast();
        skills.add(f);
        this.setSkills(skills);
    }
}
