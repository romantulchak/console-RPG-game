package com.models.Skills;

import java.io.Serializable;

import com.models.Skill;

public abstract class MagicalSkill extends Skill implements Serializable {

	
	private int minMagicalDamage;
	private int maxMagicalDamage;
	private int avarageMagicalDamage;
	
	
	
	protected MagicalSkill(String name, int coolDown, int manaPoint, int price, boolean canBeSell, int minMagicalDamage, int maxMagicalDamage) {
		super(name, coolDown, manaPoint, price, canBeSell);
		this.minMagicalDamage = minMagicalDamage;
		this.maxMagicalDamage = maxMagicalDamage;
		this.avarageMagicalDamage = getAvarageMagicalDamage();
	}	
	
	
	@Override
	public void useSkill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellSkill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upSkill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		System.out.printf("Name: %s \t Min Magical Damage: %d - Max Magical Damage: %d", this.getName(), this.minMagicalDamage, this.maxMagicalDamage);
		
	}
	
	public int minMagicalDamage() {
		return this.minMagicalDamage;
	}

	public int maxMagicalDamage() {
		return this.maxMagicalDamage;
	}
	
	public void setMinMagicalDamage(int minMagicalDamage) {
		this.minMagicalDamage = minMagicalDamage;
	}
	public void setMaxMagicalDamage(int maxMagicalDamage) {
		this.maxMagicalDamage = maxMagicalDamage;
	}
	public int getAvarageMagicalDamage() {
		this.avarageMagicalDamage = (this.minMagicalDamage + this.maxMagicalDamage);
		return this.avarageMagicalDamage;
	}
}
