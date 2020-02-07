package com.models.Items;

import com.models.Hero;
import com.models.Item;

import java.io.Serializable;

public class Armor extends Item implements Serializable {

    private double healthPoints;
    private int manaPoints;

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    private int maxPhysicalArmor;
    private int maxMagicalArmor;
    private int minPhysicalArmor;
    private int minMagicalArmor;
    private int physicalAverageArmor;
    private int magicalAverageArmor;

    public Armor(int id, String name, int weight, int price, boolean isDressed, boolean canBeSold, boolean canBeDressed, int maxPhysicalArmor, int maxMagicalArmor, int minPhysicalArmor, int minMagicalArmor, int healthPoints, int manaPoints) {
        super(id, name, weight, price, isDressed, canBeSold, canBeDressed);
        this.maxPhysicalArmor = maxPhysicalArmor;
        this.maxMagicalArmor = maxMagicalArmor;
        this.minPhysicalArmor = minPhysicalArmor;
        this.minMagicalArmor = minMagicalArmor;
        this.setPhysicalAverageArmor();
        this.setMagicalAverageArmor();
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }


    public int getPhysicalAverageArmor() {
        return physicalAverageArmor;
    }

    public void setPhysicalAverageArmor() {
        this.physicalAverageArmor = (maxPhysicalArmor + minPhysicalArmor) / 2;
    }

    public int getMagicalAverageArmor() {
        return magicalAverageArmor;
    }

    public void setMagicalAverageArmor() {
        this.magicalAverageArmor = (maxMagicalArmor + minMagicalArmor) / 2;
    }

    public int getMaxPhysicalArmor() {
        return maxPhysicalArmor;
    }

    public void setMaxPhysicalArmor(int maxPhysicalArmor) {
        this.maxPhysicalArmor = maxPhysicalArmor;
    }

    public int getMaxMagicalArmor() {
        return maxMagicalArmor;
    }

    public void setMaxMagicalArmor(int maxMagicalArmor) {
        this.maxMagicalArmor = maxMagicalArmor;
    }

    public int getMinPhysicalArmor() {
        return minPhysicalArmor;
    }

    public void setMinPhysicalArmor(int minPhysicalArmor) {
        this.minPhysicalArmor = minPhysicalArmor;
    }

    public int getMinMagicalArmor() {
        return minMagicalArmor;
    }

    public void setMinMagicalArmor(int minMagicalArmor) {
        this.minMagicalArmor = minMagicalArmor;
    }


    @Override
    public void setItem(Hero hero) {
        if (hero != null){
            hero.setPhysicalArmor(hero.getPhysicalArmor() + this.physicalAverageArmor);
            hero.setMagicalArmor(hero.getMagicalArmor() + this.magicalAverageArmor);
            hero.setMaxHealthPoints(hero.getMaxHealthPoints() + this.healthPoints);
            hero.setHealthPoints(hero.getHealthPoints() + this.healthPoints);
            hero.setMaxManaPoints(hero.getMaxManaPoints() + this.manaPoints);
            hero.setManaPoints(hero.getManaPoints() + this.manaPoints);
            this.setDressed(true);
            System.out.printf("Was set: %s", this.getName() + "\n");
        }
    }

    @Override
    public void dropItem(Hero hero) {
        if (hero != null){
            hero.setPhysicalArmor(hero.getPhysicalArmor() - this.physicalAverageArmor);
            hero.setMagicalArmor(hero.getMagicalArmor() - this.magicalAverageArmor);
            hero.setMaxHealthPoints(hero.getMaxHealthPoints() - this.healthPoints);
            hero.setHealthPoints(hero.getHealthPoints() - this.healthPoints);
            hero.setMaxManaPoints(hero.getMaxManaPoints() - this.manaPoints);
            hero.setManaPoints(hero.getMaxManaPoints());
            this.setDressed(false);
        }
    }

    //TODO: винести в super
    @Override
    public void info() {
        System.out.printf("Id: %d, \t Name: %s \t Average physical armor: %d \n" +
                        "Average magical armor: %d \t Min physical armor: %d - Max physical armor: %d \n" +
                        "Min magical armor: %d - Max magical armor: %d \n" +
                        "Is Dressed: %s \t Can sell: %s \n",
                this.getId(),
                this.getName(),
                this.physicalAverageArmor,
                this.magicalAverageArmor,
                this.minPhysicalArmor,
                this.maxPhysicalArmor,
                this.minMagicalArmor,
                this.maxMagicalArmor,
                this.isDressed(),
                this.isCanBeSold()
        );
    }
}
