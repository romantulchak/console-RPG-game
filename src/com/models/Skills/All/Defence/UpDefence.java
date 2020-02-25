package com.models.Skills.All.Defence;

import com.models.Hero;
import com.models.Skills.DefenceSkill;

public class UpDefence extends DefenceSkill {

    public UpDefence(){
        super(1, "Up Defence", 4, 45, 0, false, 2, 4);
    }

    @Override
    public double useSkill(double heroHp) {
        if (!this.isRecharge()){
            this.setRecharge(true);
            return heroHp + this.getMagicalDefence();
        }else {
            System.out.println("Recharge");
            return heroHp;
        }
    }



    @Override
    public void sellSkill() {

    }

    @Override
    public void upSkill() {

    }

    @Override
    public void info() {
        System.out.printf("Name: %s \n Physical Defence: %d \tMagical Defence: %d\n", this.getName(), this.getPhysicalDefence(), this.getMagicalDefence());
    }
}
