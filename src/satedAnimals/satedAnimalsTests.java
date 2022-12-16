package satedAnimals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class satedAnimalsTests {
	//need one test per animal testing isSated()
	@Test
	public void DeerTest() {
	//Arrange
	Deer deer = new Deer();
	//Act
	deer.eat(FoodType.PLANTS, 800);
	deer.eat(FoodType.PLANTS, 600);
	deer.eat(FoodType.MEAT, 800);
	
	//Assert
	assertEquals(true, deer.isSated());

	}
	
	@Test
	public void BushTest() {
	//Arrange
	Bush bush = new Bush();
	//Act
	bush.eat(FoodType.PLANTS, 800);
	bush.eat(FoodType.LIGHT, 40);
	bush.eat(FoodType.MEAT, 800);
	
	//Assert
	assertEquals(false, bush.isSated());
	}
	
	@Test
	public void PigTest() {
	//Arrange
	Pig pig = new Pig();
	//Act
	pig.eat(FoodType.PLANTS, 2000);
	pig.eat(FoodType.MEAT, 2000);
	
	//Assert
	assertEquals(true, pig.isSated());
	}
	
//	@Test
//	public void ChimpTest() {
//	//Arrange
//	Chimp chimp = new Chimp();
//	//Act
//	chimp.eat(FoodType.PLANTS, 1000);
//	chimp.eat(FoodType.MEAT, 100);
//	
//	//Assert
//	assertEquals(false, chimp.isSated());
//	}
}
