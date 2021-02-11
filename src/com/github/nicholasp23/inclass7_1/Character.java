package com.github.nicholasp23.inclass7_1;

public abstract class Character {

    protected String name;
    protected int level;

    public Character(int level, String name){
        this.level = level;
        this.name = name;
    }

    public abstract void attack();

    public String getName(){ return name; }

    public int getLevel() { return level; }
}
