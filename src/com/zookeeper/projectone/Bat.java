package com.zookeeper.projectone;

public class Bat extends Mammal{
	public Bat() {
		super(300); 
	}
	public void fly() {
		System.out.println("Skkkrt Skrrrt");
		energyLevel -= 50;
		System.out.println("Energy: " + energyLevel);
	}
	public void eatHumans() {
		System.out.println("I vant to drink yer blahhd");
		energyLevel += 25;
		System.out.println("Energy: " + energyLevel);
	}
	public void attackTown() {
		System.out.println("HUMAN SCREAMING *AHHHHHHH, Bat Attack!!!*");
		energyLevel -= 100;
		System.out.println("Energy: " + energyLevel);
	}

}
