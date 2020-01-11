package com.models;

import com.models.Heroes.AttackType;

import java.io.Serializable;

public abstract class Hero implements IBaseClass, Serializable {


    private int id;
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int attackAmount;
    private int maxHealthPoints;
    private int maxManaPoints;
    private String profession;
    private String name;
    private AttackType attackType;
    private int money;


    public String getName() {
        return name;
    }
    public AttackType getAttackType() {
        return attackType;
    }
    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints<0) this.healthPoints = 0;
        else if(healthPoints > this.maxHealthPoints) this.healthPoints=this.maxHealthPoints;
        else this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints<0)
        this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) this.level = 0;
        else this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if (attackAmount < 0) this.attackAmount = 0;
        this.attackAmount = attackAmount;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
        setHealthPoints(this.healthPoints - amount);
    }

    @Override
    public void restoreMana(int amount) {
        setManaPoints(this.manaPoints + amount);
    }

    @Override
    public void loseMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
        System.out.printf("Nickname: %s \t Level: %d \n" +
                        "Health: %d \t Mana: %d \n Attack type: %s \t Attack: %d \n" +
                        "Money: %d" ,
                this.name,
                this.level,
                this.healthPoints,
                this.manaPoints,
                this.attackType,
                this.attackAmount,
                this.money
                );

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
