package com.ing.zoo;

import java.util.Scanner;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";


        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Hippo("elsa"));
        animals.add(new Lion("henk"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        animals.add(new Snake("lisa"));
        animals.add(new Mouse("tammie"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts[0].equals(commands[0]))
        {

            for (Animal animal : animals)
            {
                if (parts.length == 1 || animal.name.equalsIgnoreCase(parts[1]))
                {
                    animal.sayHello();
                }
            }

        }
        else if (input.equals(commands[1]))
        {
            for (Animal animal : animals)
            {
                if (animal instanceof Herbivore)
                {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        else if (input.equals(commands[2]))
        {
            for (Animal animal : animals)
            {
                if (animal instanceof Carnivore)
                {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        else if (input.equals(commands[3]))
        {
            for (Animal animal : animals)
            {
                if (animal instanceof TrickPerformer)
                {
                    ((TrickPerformer) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
