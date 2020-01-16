package com.models;

public interface IBaseItem {
    void removeItem(User user);
    void setItem(User user);
    void dropItem(User user);
    void takeOfItem();
    void info();
}
