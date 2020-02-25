package com.models.Skills;

import java.io.Serializable;

import com.models.Skill;

public abstract class MagicalSkill extends Skill implements Serializable {

	
	private int minMagicalDamage;
	private int maxMagicalDamage;
	private int avarageMagicalDamage;
	private int stunDuration;
	private boolean isStun;
	private int periodicDamage;
	private boolean isPeridicDamage;
	private int periodicDamageDuration;
	
	protected MagicalSkill(int id, String name, int coolDown, int manaPoint, int price, boolean canBeSell, int minMagicalDamage, int maxMagicalDamage) {
		super(id, name, coolDown, manaPoint, price, canBeSell);
		this.minMagicalDamage = minMagicalDamage;
		this.maxMagicalDamage = maxMagicalDamage;
		this.avarageMagicalDamage = getAvarageMagicalDamage();
		this.setSkillCategory(SkillCategory.ATTACK);
	}	
	

	@Override
	public void sellSkill() {
		
		
	}

	@Override
	public void upSkill() {
	
		
	}



	public int getMinMagicalDamage() {
		return this.minMagicalDamage;
	}

	public int getMaxMagicalDamage() {
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
	public int getStunDuration() {
		return this.stunDuration;
	}
	public void setStunDuration(int stundDuration) {
		this.stunDuration = stundDuration;
	}


	public boolean isStun() {
		return isStun;
	}


	public void setStun(boolean isStun) {
		this.isStun = isStun;
	}
	public int getPeriodicDamage() {
		return this.periodicDamage;
	}
	public void setPeriodicDamage(int periodicDamage) {
		this.periodicDamage = periodicDamage;
	}
	public boolean isPeriodicDamage() {
		return this.isPeridicDamage;
	}
	public void setPeriodicDamage(boolean isPeriodicDamage) {
		this.isPeridicDamage = isPeriodicDamage;
	}


	public int getPeriodicDamageDuration() {
		return periodicDamageDuration;
	}


	public void setPeriodicDamageDuration(int periodicDamageDuration) {
		this.periodicDamageDuration = periodicDamageDuration;
	}

}
