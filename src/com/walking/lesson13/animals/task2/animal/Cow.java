package com.walking.lesson13.animals.task2.animal;

public class Cow extends Animal {
	
	String whatDouseTheAnimalSay = "moo";
	public static String ANIMAL_COW = "cow";
	
	public Cow() {
		super(ANIMAL_COW);
	}
	
	public void moo() {
		sound(whatDouseTheAnimalSay);
	}
}
