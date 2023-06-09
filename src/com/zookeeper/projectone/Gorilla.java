package com.zookeeper.projectone;

public class Gorilla extends Mammal{
	public Gorilla() {
		super(50);
	}
	public void throwSomething() {
		System.out.println("Gorilla throw");
		energyLevel -= 5;
		System.out.println("Energy: " + energyLevel);
	}
	
	public void eatBanana() {
		System.out.println("Banana good");
		energyLevel += 10;
		System.out.println("Energy: " + energyLevel);
	}
	
	public void climb() {
		System.out.println("Gorilla climb tree");
		energyLevel -= 10;
		System.out.println("Energy: " + energyLevel);
	}
}
