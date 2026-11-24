package com.ing.zoo;

import java.util.Random;

public class Mouse extends Animal implements Carnivore, Herbivore {
    public String helloText;
    public String eatText;
    public String trick;

    public Mouse(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "piep piep piep";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "piep piep nom";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nom nom piep";
        System.out.println(eatText);
    }
}
