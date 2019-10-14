package com.company;

public class Hero {
    public int attack;
    public int health;
   public String attackType;

    Hero() {};
    public Hero(int health, int attack, String attackType) {
        this.health = health;
        this.attack = attack;
        this.attackType = attackType;

    }
}