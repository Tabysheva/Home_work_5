package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero();

        h1.Attack = 50;
        h1.attackType = "Physical";
        h1.Health = 300;
        System.out.println(h1.Attack + "  " + h1.attackType + "  " + h1.Health);


        Hero h2 =new Hero();
        h2.Attack=100;
        h2.attackType="Magical";
        h2.Health=400;

        System.out.println(h2.Attack + "  " + h2.attackType + "  " + h2.Health);

        Hero h3 =new Hero();
        h3.Attack=150;
        h3.attackType="Kinetic";
        h3.Health=500;

        System.out.println(h3.Attack + "  " + h3.attackType + "  " + h3.Health);

        Hero h4 =new Hero();
        h4.Attack=200;
        h4.attackType="Doctor";
        h4.Health=600;

        System.out.println(h4.Attack + "  " + h4.attackType + "  " + h4.Health);

    }


}

