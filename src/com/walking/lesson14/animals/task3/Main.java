package com.walking.lesson14.animals.task3;

import com.walking.lesson14.animals.task3.animal.Animal;
import com.walking.lesson14.animals.task3.animal.Cat;
import com.walking.lesson14.animals.task3.animal.Cow;
import com.walking.lesson14.animals.task3.animal.Dog;

public class Main {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		Cow cow1 = new Cow();
		Animal[] animals = {cat1, dog1, cow1};
		
		whatDouseTheFoxSay(animals);
	}
	
	static void whatDouseTheFoxSay(Animal[] animals) {
		
		for (Animal animal : animals) {
			animal.sound();
		}
	}
}
