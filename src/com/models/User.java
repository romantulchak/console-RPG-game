package com.models;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String name;
    private String password;
    private ArrayList<Hero> heroes;
    private double maxHero;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.maxHero = 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public double getMaxHero() {
        return maxHero;
    }

    public void setMaxHero(double maxHero) {
        this.maxHero = maxHero;
    }
}
