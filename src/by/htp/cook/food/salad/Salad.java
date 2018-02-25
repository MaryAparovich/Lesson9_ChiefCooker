package by.htp.cook.food.salad;

import by.htp.cook.food.Product;
import by.htp.cook.food.dressing.Dressing;
import by.htp.cook.food.vegetable.Vegetable;

public class Salad extends Product {

	Vegetable[] vegetables;
	Dressing dressing;

	public Salad(String name, Vegetable[] vegetables, Dressing dressing) {
		super(name);
		this.vegetables = vegetables;
		this.dressing = dressing;
	}

	private double calculateTotalWeight() {
		double TotalWeight = 0;
		for (int i = 0; i < vegetables.length; i++) {
			TotalWeight = TotalWeight + vegetables[i].getWeight();
		}
		TotalWeight = TotalWeight + dressing.getWeight();
		return TotalWeight;
	}

	public double getProteinSumSalad() {
		double sumProtein = 0;
		for (int i = 0; i < vegetables.length; i++) {
			sumProtein = sumProtein + vegetables[i].getProtein();
		}
		sumProtein = sumProtein + dressing.getProtein();
		return sumProtein;
	}

	public double getFatSumSalad() {
		double sumFat = 0;
		for (int i = 0; i < vegetables.length; i++) {
			sumFat = sumFat + vegetables[i].getFat();
		}
		sumFat = sumFat + dressing.getFat();
		return sumFat;
	}

	public double getCarboSumSalad() {
		double sumCarbo = 0;
		for (int i = 0; i < vegetables.length; i++) {
			sumCarbo = sumCarbo + vegetables[i].getCarbohydrate();
		}
		sumCarbo = sumCarbo + dressing.getCarbohydrate();
		return sumCarbo;
	}

	@Override
	public double getCalories() {
		double result = 4 * getProteinSumSalad() + 9 * getFatSumSalad() + 4 * getCarboSumSalad();
		return result;
	}

	public void bubbleSort() {

		for (int i = 0; i < vegetables.length; i++) {
			for (int j = 0; j < vegetables.length - 1; j++) {
				if (vegetables[j].getWeight() < vegetables[j + 1].getWeight()) {
					Vegetable min = vegetables[j];
					vegetables[j] = vegetables[j + 1];
					vegetables[j + 1] = min;
				}
			}
		}
	}

	public void findRangeCaloricity(double caloricityFirst, double caloricitySecond) {
		System.out.println("\nThe range of calories given: ");
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i].getCalories() > caloricityFirst && vegetables[i].getCalories() < caloricitySecond)
				vegetables[i].printInfo();
		}
	}

	@Override
	public void printInfo() {
		System.out.println("kcal/weight\t" + "weight\t\t" + "Product");
		System.out.println("---------------------------------------");
		for (int i = 0; i < vegetables.length; i++) {
			vegetables[i].printInfo();
		}
		dressing.printInfo();
		System.out.println("---------------------------------------");
		System.out.println("Calories of the salad " + "'" + getName() + "': " + getCalories() + " " + "kcal");
	}

	@Override
	public double getProteinBy100Gr() {
		return getProteinSumSalad() * 100 / calculateTotalWeight();
	}

	@Override
	public double getFatBy100Gr() {
		return getFatSumSalad() * 100 / calculateTotalWeight();
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return getCarboSumSalad() * 100 / calculateTotalWeight();
	}
}