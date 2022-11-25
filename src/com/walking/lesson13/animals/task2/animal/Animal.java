package com.walking.lesson13.animals.task2.animal;

public class Animal {

    String animal;

    Animal(String animal) {
        this.animal = animal;
    }

    protected void sound(String sound) {
        System.out.println(sound);
    }

    public String getAnimal() {
        return animal;
    }
}
