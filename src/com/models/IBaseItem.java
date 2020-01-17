package com.models;

public interface IBaseItem {
    void removeItem(User user);
    void setItem(Hero hero);
    void dropItem(Hero hero);
    void takeOfItem();
    void info();
}
