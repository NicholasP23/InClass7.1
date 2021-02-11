package com.github.nicholasp23.inclass7_1;

public class Driver {

    public static void main(String[] args){
        Character[] characters = {
                new Archer(5, "Yo it is"),
                new Archer(10, "Your boy"),
                new Warrior(15, "Skinny Penis"),
                new Warrior(20, "Violets are red"),
                new Wizard(25, "roses are blue"),
                new Wizard(30, "Peekaboo")
        };

        for(Character character : characters){
            character.attack();
            System.out.println("");
        }



    }




}
