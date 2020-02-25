package com.models.Skills.All.Magical;

import com.models.Skills.MagicalSkill;
import com.models.*;
public class FireBlast extends MagicalSkill {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7298739623076902084L;

	public FireBlast() {
		super(1,"Fire blast", 3, 75, 250, false, 15, 26);
		this.setPeriodicDamage(true);
		this.setPeriodicDamage(4);
		this.setPeriodicDamageDuration(3);
	}
	@Override
	public void info() {
		System.out.printf("Name: %s \t Min damage: %d - Max damage: %d \t Periodic Damage: %s \n", this.getName(), this.getMinMagicalDamage(), this.getMaxMagicalDamage(), this.isPeriodicDamage());
	}
	//TODO: удар боса під час використання вміння
	@Override
	public double useSkill(Hero hero, double bossHp) {
		if(hero != null) {
			if(!this.isRecharge()) {
			bossHp -= this.getAvarageMagicalDamage();
			this.setRecharge(true);
			}else {
				System.out.println("Recharge");
				
			}
			
		}
		return bossHp;
	}
}
