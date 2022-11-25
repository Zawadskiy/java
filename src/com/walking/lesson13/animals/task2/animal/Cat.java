package com.walking.lesson13.animals.task2.animal;

public class Cat extends Animal {
    String whatDouseTheAnimalSay = "meow";
    public static String ANIMAL_CAT = "cat";

    public Cat() {
        super("cat");
    }

    public void meow() {
        sound(whatDouseTheAnimalSay);
    }

}
