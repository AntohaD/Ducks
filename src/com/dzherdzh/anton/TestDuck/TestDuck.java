package com.dzherdzh.anton.TestDuck;

import com.dzherdzh.anton.Ducks.*;

public class TestDuck {
	
	public static void main(String[] args)
	{
		ADuck firstDuck = new RedHeadDuck();
		firstDuck.display();
		firstDuck.move();
		firstDuck.swim();
		firstDuck.usefly();
		System.out.println("");
		ADuck secondDuck = new ToyDuck();
		secondDuck.display();
		secondDuck.move();
		secondDuck.swim();
		secondDuck.usefly();
		System.out.println("");
		ADuck thirdDuck = new WoodDuck();
		thirdDuck.display();
		thirdDuck.move();
		thirdDuck.swim();
		thirdDuck.usefly();
		System.out.println("");
	}

}
