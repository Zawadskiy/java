package com.walking.lesson13.animals.task2.animal;

public class Cow extends Animal {
    String whatDouseTheAnimalSay = "moo";

    public Cow() {
        super("cow");
    }

    public void moo() {
        sound(whatDouseTheAnimalSay);
    }

}
