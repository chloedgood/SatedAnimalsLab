package satedAnimals;

public class Chimp implements Animal  {

	int meatCal;
	int totalCal;
	public static final int REQUIRED_CALORIES =1000;
	public static final int REQUIRED_MEAT_CALORIES =200;
	
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.MEAT) {
			meatCal+=calories;
		} 
		totalCal += calories;
		
	}
	@Override
	public boolean isSated() {
		return totalCal >= REQUIRED_CALORIES;
	}
}
