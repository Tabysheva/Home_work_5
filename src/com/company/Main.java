package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Hero h1 = new Hero();

        h1.attack = 50;
        h1.attackType = "Physical";
        h1.health = 300;
        System.out.println(h1.attack + "  " + h1.attackType + "  " + h1.health);


        Hero h2 =new Hero();
        h2.attack=100;
        h2.attackType="Magical";
        h2.health=400;

        System.out.println(h2.attack + "  " + h2.attackType + "  " + h2.health);

        Hero h3 =new Hero();
        h3.attack=150;
        h3.attackType="Kinetic";
        h3.health=500;

        System.out.println(h3.attack + "  " + h3.attackType + "  " + h3.health);

        Hero h4 =new Hero();
        h4.attack=200;
        h4.attackType="Doctor";
        h4.health=600;

        System.out.println(h4.attack + "  " + h4.attackType + "  " + h4.health);

    }


}

