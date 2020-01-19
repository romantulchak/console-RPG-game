package com.models;

public abstract class Skill implements IBaseSkills {

    private String name;
    private boolean isRecharge;
    private int coolDown;
    private int manaPoint;
    private int price;
    private int canBeSell;


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

    public int getCanBeSell() {
        return canBeSell;
    }

    public void setCanBeSell(int canBeSell) {
        this.canBeSell = canBeSell;
    }
}
