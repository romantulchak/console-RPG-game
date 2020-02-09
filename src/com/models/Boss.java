package com.models;

import com.models.Heroes.AttackType;

public abstract class Boss  extends Hero {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6265221311104021985L;

	@Override
    public Shop getShop() {
        return super.getShop();
    }

    @Override
    public void setShop(Shop shop) {
        super.setShop(shop);
    }

    @Override
    public int getPhysicalArmor() {
        return super.getPhysicalArmor();
    }

    @Override
    public void setPhysicalArmor(int physicalArmor) {
        super.setPhysicalArmor(physicalArmor);
    }

    @Override
    public int getMagicalArmor() {
        return super.getMagicalArmor();
    }

    @Override
    public void setMagicalArmor(int magicalArmor) {
        super.setMagicalArmor(magicalArmor);
    }

    protected Boss() {
        super();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }




    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public AttackType getAttackType() {
        return super.getAttackType();
    }

    @Override
    public void setAttackType(AttackType attackType) {
        super.setAttackType(attackType);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getHealthPoints() {
        return super.getHealthPoints();
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        super.setHealthPoints(healthPoints);
    }

    @Override
    public int getManaPoints() {
        return super.getManaPoints();
    }

    @Override
    public void setManaPoints(int manaPoints) {
        super.setManaPoints(manaPoints);
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public int getAttackAmount() {
        return super.getAttackAmount();
    }

    @Override
    public void setAttackAmount(int attackAmount) {
        super.setAttackAmount(attackAmount);
    }

    @Override
    public double getMaxHealthPoints() {
        return super.getMaxHealthPoints();
    }

    @Override
    public void setMaxHealthPoints(double maxHealthPoints) {
        super.setMaxHealthPoints(maxHealthPoints);
    }

    @Override
    public int getMaxManaPoints() {
        return super.getMaxManaPoints();
    }

    @Override
    public void setMaxManaPoints(int maxManaPoints) {
        super.setMaxManaPoints(maxManaPoints);
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void restoreHealth(int amount) {
        super.restoreHealth(amount);
    }

    @Override
    public void loseHealth(int amount) {
        super.loseHealth(amount);
    }

    @Override
    public void restoreMana(int amount) {
        super.restoreMana(amount);
    }

    @Override
    public void loseMana(int amount) {
        super.loseMana(amount);
    }



    @Override
    public void info() {
        super.info();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    @Override
    public void setProfession(String profession) {
        super.setProfession(profession);
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }

    @Override
    public void setMoney(int money) {
        super.setMoney(money);
    }

    @Override
    public int getDefence() {
        return super.getDefence();
    }

    @Override
    public void setDefence(int defence) {
        super.setDefence(defence);
    }

    @Override
    public Inventory getInventory() {
        return super.getInventory();
    }

    @Override
    public void setInventory(Inventory inventory) {
        super.setInventory(inventory);
    }

    @Override
    public int getMaxWeight() {
        return super.getMaxWeight();
    }

    @Override
    public void setMaxWeight(int maxWeight) {
        super.setMaxWeight(maxWeight);
    }
}
