package com.models;

import com.models.Heroes.AttackType;

import java.io.Serializable;
import java.util.List;

public abstract class Hero implements IBaseClass, Serializable {

//TODO: Додати критичний урон

    private int id;
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int attackAmount;
    private int defence;
    private int maxHealthPoints;
    private int maxManaPoints;
    private int experience;
    private int experienceToUp = 50;
    private String profession;
    private String name;
    private AttackType attackType;
    private int money;
    private Inventory inventory;
    private int maxWeight;
    private int weight;
    private int physicalArmor;
    private int magicalArmor;
    private Shop shop;

    public List<Boss> getBosses() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }

    private List<Boss> boss;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public int getPhysicalArmor() {
        return physicalArmor;
    }

    public void setPhysicalArmor(int physicalArmor) {
        this.physicalArmor = physicalArmor;
    }

    public int getMagicalArmor() {
        return magicalArmor;
    }

    public void setMagicalArmor(int magicalArmor) {
        this.magicalArmor = magicalArmor;
    }

    protected Hero(){
        this.setWeight(0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0)this.experience = 0;
        else this.experience = experience;
    }

    public int getExperienceToUp() {
        return experienceToUp;
    }

    public void setExperienceToUp(int experienceToUp) {
        if (experienceToUp < 0) this.experienceToUp =0;
        else this.experienceToUp = experienceToUp;
    }

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
        if (manaPoints<0) this.manaPoints =0;
        else if (manaPoints > this.manaPoints) this.manaPoints = this.maxManaPoints;
        else this.manaPoints = manaPoints;
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
        System.out.printf("Nickname: %s \t Level: %d \t Experience: %d \t Experience to up: %d \n" +
                        "Health: %d \t Mana: %d \nAttack type: %s \t Attack: %d \n" +
                        "Physical armor: %d \t Magical armor: %d\t" +
                        "Money: %d \n " ,
                this.name,
                this.level,
                this.experience,
                this.experienceToUp,
                this.healthPoints,
                this.manaPoints,
                this.attackType,
                this.attackAmount,
                this.physicalArmor,
                this.magicalArmor,
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
