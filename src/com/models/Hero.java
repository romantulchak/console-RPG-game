package com.models;

import com.models.Heroes.AttackType;

import java.io.Serializable;
import java.util.List;

public abstract class Hero implements IBaseClass, Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 33034448676169356L;
	private int id;
    private double healthPoints;
    private int manaPoints;
    private int level;
    private int attackAmount;
    private int defence;
    private double maxHealthPoints;
    private int maxManaPoints;
    private double experience;
    private double experienceToUp = 50;
    private String profession;
    private String name;
    private AttackType attackType;
    private int money;
    private Inventory inventory;
    private int maxWeight;
    private int weight;
    private int physicalArmor;
    private int magicalArmor;
    private double criticalChance;
    private double criticalHit;
    private Shop shop;
    private int win;
    private int lose;
    private List<Skill> skills;









    public void setCriticalHit(double criticalHit){
        this.criticalHit = criticalHit;
    }
    public double getCriticalHit(){
        return this.criticalHit;
    }

    public void setCriticalChance(double criticalChance){
        this.criticalChance = criticalChance;
    }

    public double getCriticalChance(){
        return criticalChance;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience < 0)this.experience = 0;
        else this.experience = experience;
    }

    public double getExperienceToUp() {
        return experienceToUp;
    }

    public void setExperienceToUp(double experienceToUp) {
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

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
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

    public double getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(double maxHealthPoints) {
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
    public void levelUp(double exp) {

        if (exp >= experienceToUp) {
            this.setLevel(this.getLevel() + 1);
            this.setExperience(this.experience + exp);
            double remainderOfExp = exp - experienceToUp;
            while (remainderOfExp > experienceToUp){
                this.setExperienceToUp(this.experienceToUp + (this.experienceToUp * 1.2));
                this.setLevel(this.getLevel() + 1);
                remainderOfExp -= experienceToUp;
                this.setExperienceToUp(this.experienceToUp % remainderOfExp);
            }
        }
    }

    @Override
    public void info() {
        System.out.printf("Nickname: %s \t Level: %d \t Experience: %.1f \t Experience to up: %.1f \n" +
                        "Health: %.1f \t Mana: %d \nAttack type: %s \t Attack: %d \n" +
                        "Physical armor: %d \t Magical armor: %d\n" +
                        "Critical chance: %.2f \t Critical hit: %.2f \n" +
                        "Win: %d \t Lose: %d \n" +
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
                this.criticalChance,
                this.criticalHit,
                this.win,
                this.lose,
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
    public List<Skill> getSkills(){
    	return this.skills;
    }
    public void setSkills(List<Skill> skills) {
    	this.skills = skills;
    }
}
