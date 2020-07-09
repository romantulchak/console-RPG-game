package com.models.Interfaces;

import com.models.Hero;

public interface IBaseItem {
    void removeItem(Hero hero);
    void setItem(Hero hero);
    void dropItem(Hero hero);
    void sellItem(Hero hero);
    void takeOfItem(int id);
    void info();
}
