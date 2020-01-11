package com.controllers;

import com.models.Hero;
import com.models.Heroes.Archer;
import com.models.Heroes.Mage;
import com.models.Heroes.Warrior;
import com.models.User;

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

    private void save(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(users);
        }catch (Exception e){

        }
    }
    public void createUser(String name, String password){
        User userToFind = users.stream().filter(x->x.getName().equals(name)).findFirst().orElse(null);
        if (userToFind == null) {
            User user = new User(name, password);
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

    public void setUserHero(String name,int id, int heroId) {
        if (currentUser.getHeroes().size() < currentUser.getMaxHero()) {
            switch (id) {
                case 1:

                    heroes.add(new Warrior(name, heroId));
                    currentUser.setHeroes(heroes);
                    break;

                case 2:
                    heroes.add(new Mage(name, heroId));
                    currentUser.setHeroes(heroes);
                    break;
                case 3:
                    heroes.add(new Archer(name, heroId));
                    currentUser.setHeroes(heroes);
                    break;

            }
            save();
         }else {
            System.out.println("You have created a maximum of heroes");
        }
        heroes = currentUser.getHeroes();

    }

    public void removeHero(int id){
        Hero hero = currentUser.getHeroes().stream().filter(x->x.getId() == id).findFirst().orElse(null);
        heroes.remove(hero);
        currentUser.setHeroes(heroes);
        save();
        System.out.println("You had been deleted: " + heroes.stream().filter(s->s.getId() == id).findFirst().orElse(null));

    }
    public Hero getCurrentHero() {
        return currentHero;
    }

    public void setCurrentHero(Hero currentHero) {
        this.currentHero = currentHero;
    }
}
