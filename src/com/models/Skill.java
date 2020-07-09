package com.models;

import com.models.Interfaces.IBaseSkills;
import com.models.Skills.SkillCategory;

import java.io.Serializable;

public abstract class Skill implements IBaseSkills, Serializable {

	private int id;
    private String name;
    private boolean isRecharge;
    private int coolDown;
    private int manaPoint;
    private int price;
    private boolean canBeSell;
    private int level;
    private SkillCategory skillCategory;

    protected Skill(int id, String name, int coolDown,int manaPoint, int price, boolean canBeSell) {
    	this.setId(id);
    	this.name = name;
    	this.coolDown = coolDown;
    	this.manaPoint = manaPoint;
    	this.price = price;
    	this.canBeSell = canBeSell;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRecharge() {
        return isRecharge;
    }

    public void setRecharge(boolean recharge) {
        isRecharge = recharge;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getCanBeSell() {
        return canBeSell;
    }

    public void setCanBeSell(boolean canBeSell) {
        this.canBeSell = canBeSell;
    }	
    public int getLevel() {
    	return this.level;
    }
    public void setLevel(int level) {
    	this.level = level;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SkillCategory getSkillCategory(){
        return this.skillCategory;
    }
    @Override
    public double useSkill(Hero hero, double bossHp) {
        return 0;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }

    @Override
    public double useSkill(double heroHp) {
        return heroHp;
    }
}
