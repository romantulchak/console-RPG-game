package com.game;

import com.controllers.UserController;
import com.models.EHeroes;
import com.models.Hero;
import com.models.Item;
import com.models.Items.Weapon;
import com.sun.istack.internal.NotNull;


import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        out.println("1) Login");
        out.println("2) Registration");

        int id = input.nextInt();
        input.nextLine();
        switch (id){
            case 1:
                login();
                break;
            case 2:
                registration();
                break;
            default:
                login();
                break;
        }
    }

    private static void registration() {
        UserController userController = new UserController();
        out.print("Set your login: ");
        String login = input.nextLine();
        out.print("Set your password: ");
        String password = input.nextLine();
        userController.createUser(login, password);
        if (userController.isSuccess){
            menu(userController);
        }



    }

    private static void menu(UserController userController) {


        if (userController.isFirstHero) {
            createHero(userController);
        }
            for (Hero hero : userController.getCurrentUser().getHeroes()){
                out.println(hero.getId());
                out.println(hero.getName());
            }
            while (true) {
                out.println(userController.getCurrentUser().getName());
                out.println("What do you want to do ?");
                out.println("1) Choose hero");
                out.println("2) Create new hero");
                out.println("3) Show all heroes");
                out.println("4) Remove hero");
                int id = input.nextInt();
                input.nextLine();
                switch (id) {
                    case 1:
                        chooseHero(userController);
                        break;
                    case 2:
                        createHero(userController);
                        break;
                    case 3:
                        showAllHeroes(userController);
                        break;
                    case 4:
                        removeHero(userController);
                        break;
                }

            }

    }

    private static void removeHero(UserController userController) {
        out.println("Set id");
        int id = input.nextInt();
        input.nextLine();
        userController.removeHero(id);
    }

    private static void showAllHeroes(UserController userController) {

        for (Hero hero : userController.getCurrentUser().getHeroes()) {
            out.printf("Hero id: %d \t Hero name: %s \t Hero profession: %s \t  Health: %d \t Mana: %d \t Attack: %d\n",
                    hero.getId(),
                    hero.getName(),
                    hero.getProfession(),
                    hero.getHealthPoints(),
                    hero.getManaPoints(),
                    hero.getAttackAmount()
                    );
        }



    }


    private static void chooseHero(UserController userController){
        out.println("Choose your hero");
        out.println("Pls set id");
        int id = input.nextInt();
        input.nextLine();
        userController.chooseHero(id);
        heroMenu(userController);
    }

    private static void heroMenu(UserController userController) {

        userController.getCurrentHero().info();
        while (true) {
            out.println("1) Show information about hero");
            out.println("2) Show inventory");
            out.println("3) Show skills");
            out.println("4) Battle");
            out.println("5) Shop");
            out.println("6) Change hero");
            out.println("7) Exit");
            int id = input.nextInt();
            input.nextLine();
            switch (id) {
                case 1:
                    userController.getCurrentHero().info();
                    break;
                case 2:
                    showInventory(userController);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    exit(0);

            }

        }
    }

    private static void showInventory(UserController userController) {
        for (Item item:userController.getCurrentHero().getInventory().getItems()
        ) {
            item.info();
        }
        out.println("What do you want to do ?");
        out.println("1) Set item");
        out.println("2) Sell item");
        out.println("3) Drop item");
        int id = input.nextInt();
        input.nextLine();
        switch (id){
            case 1:
                userController.getItem(getIdForMethods());
                break;
            case 2:
                break;
            case 3:
                userController.dropItem(getIdForMethods());
                break;

        }

    }
    private static int getIdForMethods(){
        out.println("Set id");
        int newId = input.nextInt();
        input.nextLine();
        return newId;
    }
    private static void createHero(@NotNull UserController userController) {

            out.println("Create your first hero");
            out.println("Set your hero name");
            String heroName = input.nextLine();
            out.println("Choose profession you should write 1, 2 or 3");
            int i = 1;
            for (EHeroes hero : EHeroes.values()) {
                out.println(i++ + ")" + hero.name());
            }
            int id = input.nextInt();

            out.println("Set an id for your hero it will help you in the future");
            int idHero = input.nextInt();
            userController.setUserHero(heroName, id, idHero);

    }

    private static void login() {

        out.print("Set your login: ");
        String login = input.nextLine();
        out.print("Set your password: ");
        String password = input.nextLine();
        UserController userController = new UserController(login, password);
        if (userController.isSuccess) {
            menu(userController);
        }else if (userController.isNew){
            
            out.println("Do you want to sign up ?");
            out.println("1) Yes");
            out.println("2) No");
            int id = input.nextInt();
            input.nextLine();
            switch (id){
                case 1:
                    registration();
                    break;
                case 2:
                    exit(1);
                    break;
                default:
                    registration();
                    break;
            }
        }
    }
}

