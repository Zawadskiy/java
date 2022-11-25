package com.walking.lesson13.animals.task2;

import com.walking.lesson13.animals.task2.animal.Animal;
import com.walking.lesson13.animals.task2.animal.Cat;
import com.walking.lesson13.animals.task2.animal.Cow;
import com.walking.lesson13.animals.task2.animal.Dog;

public class Main {
    static String ANIMAL_CAT = "cat";
    static String ANIMAL_DOG = "dog";
    static String ANIMAL_COW = "cow";

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Cow cow1 = new Cow();
        Animal[] animals = {cat1, dog1, cow1};

        whatDouseTheFoxSay(animals);

    }

    static void whatDouseTheFoxSay(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.getAnimal().equals(ANIMAL_CAT)) {
                ((Cat) animal).meow();
            } else if (animal.getAnimal().equals(ANIMAL_DOG)) {
                ((Dog) animal).woof();
            } else if (animal.getAnimal().equals(ANIMAL_COW)) {
                ((Cow) animal).moo();
            }
        }
    }
}
