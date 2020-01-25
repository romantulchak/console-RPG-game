package com.controllers;

import com.models.*;
import com.models.Heroes.Archer;
import com.models.Heroes.Mage;
import com.models.Heroes.Warrior;
import com.models.Items.Armor;
import com.models.Items.Weapon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserController {


    private static final String FILE_NAME = "users.dat";
    private ArrayList<User> users;
    private ArrayList<Hero> heroes;
    private User currentUser;
    private Hero currentHero;
    public boolean isNew = false;
    public boolean isSuccess = false;
    public boolean isFirstHero = true;
    public UserController(){
        users = getUsers();
        if (heroes == null){
            heroes = new ArrayList<Hero>();
        }else {
            heroes = currentUser.getHeroes();
        }
    }

    public UserController(String name, String password){

        users = getUsers();
        currentUser = users.stream().filter(x->x.getName().equals(name) && x.getPassword().equals(password)).findFirst().orElse(null);

        if (currentUser == null){
            isNew = true;
        }else {
            if (currentUser.getHeroes() != null){
                isFirstHero = false;
            }else {
                currentUser.setHeroes(new ArrayList<Hero>());
            }
            heroes = currentUser.getHeroes();
            isSuccess = true;
        }

    }


    private ArrayList<User> getUsers(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<User>) ois.readObject();
        }catch (Exception e){
            return new ArrayList<User>();
        }
    }

    public void save(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(users);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void createUser(String name, String password){
        User userToFind = users.stream().filter(x->x.getName().equals(name)).findFirst().orElse(null);
        if (userToFind == null) {
            User user = new User(name, password);
            user.setHeroes(new ArrayList<Hero>());
            users.add(user);
            save();
            isSuccess = true;
            currentUser = user;
        }else {
            System.out.println("A user with the same name already exists ");
        }

    }

    public void chooseHero(int id){
        Hero hero = heroes.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        if (hero !=null){
            currentHero = hero;
        }
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    //TODO: створити додавання предметыв
    public void setUserHero(String name,int id, int heroId) {
        if (currentUser.getHeroes().size() < currentUser.getMaxHero()) {
            Hero hero = heroes.stream().filter(s->s.getId() == heroId).findFirst().orElse(null);
            Inventory inventory = new Inventory(currentUser.getName()+name);
            Item item = null;
            Item item2 = null;
            Shop shop = new Shop();
            shop.setItems(new ArrayList<Item>());
            if (hero == null) {
                switch (id) {
                    case 1:
                        item = new Weapon(1,"Silver Sword", 240, 0, false, false, 15, 12);
                        item2 = new Armor(2, "Leather armor", 194, 15, false, true, 9, 6, 5, 3, 50, 0 );
                        inventory.setItems(item);
                        inventory.setItems(item2);
                        Hero warrior = new Warrior(name, heroId, inventory);
                        warrior.setShop(shop);
                        heroes.add(warrior);
                        currentUser.setHeroes(heroes);
                        break;

                    case 2:
                        item = new Weapon(1,"Wooden Staff ",145, 0, false, false, 11, 9);
                        inventory.setItems(item);
                        Hero mag = new Mage(name, heroId, inventory);
                        mag.setShop(shop);
                        heroes.add(mag);
                        currentUser.setHeroes(heroes);
                        break;
                    case 3:
                        item = new Weapon(1,"Silver Bow",194, 0, false, false, 19, 14);
                        inventory.setItems(item);
                        Hero archer = new Archer(name, heroId, inventory);
                        archer.setShop(shop);
                        heroes.add(archer);
                        currentUser.setHeroes(heroes);
                        break;
                }
                save();
            }else {
                System.out.println("Hero with the same id has already been created");
            }

         }else {
            System.out.println("You have created a maximum of heroes");
        }
        heroes = currentUser.getHeroes();

    }

    public void removeHero(int id){
        Hero hero = currentUser.getHeroes().stream().filter(x->x.getId() == id).findFirst().orElse(null);
        if (hero !=null) {

            heroes.remove(hero);
            currentUser.setHeroes(heroes);
            save();
            System.out.println("You had been deleted: " + hero.getName());
        }else {
            System.out.println("The hero was not found");
        }
    }
    public Hero getCurrentHero() {
        return currentHero;
    }

    public void setCurrentHero(Hero currentHero) {
        this.currentHero = currentHero;
    }

    public void getItem(int newId) {
        Item item = currentHero.getInventory().getItems().stream().filter(s->s.getId() == newId).findFirst().orElse(null);
        if (item !=null) {
            item.setItem(currentHero);
            save();
        }else {
            System.out.println("Item not found");
        }
    }

    public void dropItem(int newId) {
        Item item = currentHero.getInventory().getItems().stream().filter(s->s.getId() == newId).findFirst().orElse(null);
        if (item !=null) {
            item.dropItem(currentHero);
            save();
        }else {
            System.out.println("Item not found");
        }
    }

    public void sellItem(int newId) {
        Item item = currentHero.getInventory().getItems().stream().filter(s->s.getId() == newId).findFirst().orElse(null);
        if (item !=null){
            item.sellItem(currentHero);
            save();
        }else {
            System.out.println("Item not found");
        }
    }

    public void removeItem(int newId) {
        Item item = currentHero.getInventory().getItems().stream().filter(s->s.getId()==newId ).findFirst().orElse(null);
        if (item !=null){
            item.removeItem(currentHero);
            save();
        }else {
            System.out.println("Item not found");
        }

    }
}
