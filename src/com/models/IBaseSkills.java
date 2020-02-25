package com.models;

public interface IBaseSkills {
    double useSkill(Hero hero, double bossHp);
    double useSkill(double heroHp);
    void sellSkill();
    void upSkill();
    void info();
}
