package satedAnimals;

public class Pig implements Animal  {

	
	int meatCal;
	int plantCal;
	int cal = plantCal + meatCal;
	int totalCal;
	public static final int REQUIRED_CALORIES =3000;
	public static final int REQUIRED_MEAT_CALORIES =1000;
	public static final int REQUIRED_PLANT_CALORIES =1000;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.PLANTS) {
			plantCal+=calories;
		} else if (food == FoodType.MEAT) {
			meatCal += calories;
		}
		totalCal += calories;
		
	}
	@Override
	public boolean isSated() {
		return totalCal >= REQUIRED_CALORIES;
	}
}
