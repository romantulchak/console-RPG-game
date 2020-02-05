package com.controllers;

import com.models.Boss;
import com.models.Hero;
import com.models.User;

public class BattleController {

    private Hero currentHero;
    private Boss currentBoss;
    private double heroHp;
    private double bossHp;
    private boolean isEnd = false;
    private boolean bossWin;
    private boolean heroWin;
    public BattleController(Hero currentHero, Boss currentBoss){
        this.currentHero = currentHero;
        this.currentBoss = currentBoss;
        heroHp = currentHero.getHealthPoints() + (currentHero.getPhysicalArmor()*0.1);
        bossHp = currentBoss.getHealthPoints() + (currentBoss.getPhysicalArmor()*0.1);
    }


    public void battle() {

        System.out.printf("Hero hp: %s \t x Boss hp: %s \n",
                heroHp,
                bossHp);
        if (heroWin){
            System.out.printf("Hero %s win \n", currentHero.getName());
        }else if(bossWin){
            System.out.printf("Boss %s win \n", currentBoss.getName());
        }


    }

    public boolean isEnd() {
        return isEnd;
    }
    public void setEnd(boolean isEnd){
        this.isEnd = isEnd;
    }

    public void attack() {


        heroHp -= currentBoss.getAttackAmount();
        bossHp -= currentHero.getAttackAmount();
        if (heroHp <= 0) {
            isEnd = true;
        }
        if (bossHp <= 0){
            isEnd = true;
        }
        if (isEnd){
            if (heroHp<=0){
                bossWin =true;
            }else {
                heroWin = true;
            }
        }


    }

}
