package com.models.Enemies;

import com.models.Boss;
import com.models.Hero;
import com.models.Heroes.AttackType;

public class Diablo extends Boss {

    public Diablo() {
        setId(1);
        setName("Diablo");
        setMaxHealthPoints(200);
        setMaxManaPoints(250);
        setHealthPoints(200);
        setManaPoints(500);
        setMaxWeight(5000);
        setAttackAmount(12);
        setPhysicalArmor(65);
        setMoney(300);
        setAttackType(AttackType.PHYSICAL);
        setMagicalArmor(30);
        setExperience(250);
        setCriticalChance(0.1);
        setCriticalHit(2);
        setLevel(50);
    }
}
