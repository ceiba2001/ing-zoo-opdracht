package com.ing.zoo;

import java.util.Random;

public class Snake extends Animal implements Carnivore{
    public String helloText;
    public String eatText;

    public Snake(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "sssssssssss";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "ssssssss lekkar";
        System.out.println(eatText);
    }
}