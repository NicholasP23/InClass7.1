package com.github.nicholasp23.inclass7_1;

public class Wizard extends Character{
    public static final int attackPower = 5, attackSpeed = 15;

    public Wizard(int level, String name){
        super(level, name);
    }

    @Override
    public void attack() {
        System.out.println("~" + getName() + "~ - your level is " + getLevel() + " and attack power is: " + getAttackPower());
        System.out.println("~" + getName() + "~ - your level is " + getLevel() + " and attack speed is: " + getAttackSpeed());

    }

    public int getAttackPower(){
        return getLevel() * attackPower;
    }

    public int getAttackSpeed(){
        return getLevel() * attackSpeed;
    }

    public String getName(){
        return name;
    }

    public void setLevel(int level){
        this.level = level;
    }
}
