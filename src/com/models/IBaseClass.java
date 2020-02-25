package com.models;

public interface IBaseClass {

    void attack();
    double restoreHealth(double amount, double heroHp);
    void loseHealth(int amount);
    void restoreMana(int amount);
    void loseMana(int amount);
    void levelUp(double exp);
    void info();






}
