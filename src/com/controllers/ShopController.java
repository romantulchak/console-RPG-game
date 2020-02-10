package com.controllers;

import com.models.Hero;
import com.models.Item;
import com.models.Items.Armor;
import com.models.Items.HealLevelOne;
import com.models.Items.Weapon;
import com.models.Shop;
import com.models.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ShopController {

    private List<Item>items;
    private List<Shop>shops;
    private Shop shop;
    private final String FILE_NAME = "shop.dat";
    private Hero currentHero;
    //TODO: додати нормальне додавання предметів
    public ShopController(UserController userController){
        currentHero = userController.getCurrentHero();
        shops = getShops();
        shop = currentHero.getShop();

        //Shop shop = shops.stream().filter(s-> s.getUserName().equals(user.getName()) && s.getHeroName().equals(hero.getName())).findFirst().orElse(null);
        //hero.getShop().setItems(getItems());
        if (shop.getItems().size() == 0){
            addDefaultItems(userController);
        }else {
            //currentHero.setShop().findFirst().orElse(null));
        }
    }

    private void addDefaultItems(UserController userController) {

        Item item = new Weapon(6, "Test Weapon1", 500, 235, false, true, true,20, 15);
        Item item1 = new Weapon(7, "Test Weapon1", 500, 235, false, true, true,20, 15);
        Item item2 = new Weapon(8, "Test Weapon1", 500, 235, false, true, true,20, 15);
        Item item11 = new Armor(6, "Test Armor2", 500, 200, false, true, true,15, 10, 9, 6, 0, 0);
        Item item22 = new Armor(6, "Test Armor2", 500, 200, false, true, true,15, 10, 9, 6, 0, 0);
        Item item33 = new Armor(6, "Test Armor2", 500, 200, false, true, true,15, 10, 9, 6, 0, 0);
        List<Item> itemsToAdd = new ArrayList<>();
        itemsToAdd.add(item);
        itemsToAdd.add(item1);
        itemsToAdd.add(item2);
        itemsToAdd.add(item11);
        itemsToAdd.add(item22);
        itemsToAdd.add(item33);
        shop.setItems(itemsToAdd);
        userController.getCurrentHero().setShop(shop);
        shops.add(shop);
        save();
        userController.save();
    }

    public List<Item> items(){
        return items;
    }

    private List<Shop> getShops() {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return  (List<Shop>) ois.readObject();

        }catch (Exception e){
            return new ArrayList<Shop>();
        }

    }
    private void save(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(shops);
        }catch (Exception e){

        }
    }

    public void buyItem(int id){
        currentHero.getShop().buyItem(currentHero, id);
        save();
    }


    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Hero getCurrentHero() {
        return currentHero;
    }

    public void setCurrentHero(Hero currentHero) {
        this.currentHero = currentHero;
    }



}
