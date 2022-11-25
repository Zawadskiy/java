package com.walking.lesson13.animals.task2.animal;

public class Dog extends Animal {
	
	String whatDouseTheAnimalSay = "woof";
	public static String ANIMAL_DOG = "dog";
	
	public Dog() {
		super(ANIMAL_DOG);
	}
	
	public void woof() {
		sound(whatDouseTheAnimalSay);
	}
}
