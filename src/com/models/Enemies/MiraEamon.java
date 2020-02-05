package com.models.Enemies;

import com.models.Boss;
import com.models.Heroes.AttackType;

public class MiraEamon extends Boss {
    public MiraEamon(){
        setId(2);
        setName("Mira Eamon");
        setMaxHealthPoints(1000);
        setMaxManaPoints(500);
        setHealthPoints(1000);
        setManaPoints(750);
        setMaxWeight(10000);
        setAttackAmount(450);
        setPhysicalArmor(150);
        setMoney(1500);
        setAttackType(AttackType.PHYSICAL);
        setMagicalArmor(120);
        setExperience(5000);
        setLevel(150);
    }
}
