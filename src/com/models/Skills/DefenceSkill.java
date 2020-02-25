package com.models.Skills;

import com.models.Hero;
import com.models.Skill;

public abstract class DefenceSkill extends Skill {


    private int magicalDefence;
    private int physicalDefence;

    protected DefenceSkill(int id, String name, int coolDown, int manaPoint, int price, boolean canBeSell, int magicalDefence, int physicalDefence) {
        super(id, name, coolDown, manaPoint, price, canBeSell);
        this.magicalDefence = magicalDefence;
        this.physicalDefence = physicalDefence;
        this.setSkillCategory(SkillCategory.DEFENCE);
    }

    public int getMagicalDefence(){
        return this.magicalDefence;
    }
    public int getPhysicalDefence(){
        return this.physicalDefence;
    }
    public void setMagicalDefence(int magicalDefence){
        this.magicalDefence = magicalDefence;
    }
    public void setPhysicalDefence(int physicalDefence){
        this.physicalDefence = physicalDefence;
    }

}
