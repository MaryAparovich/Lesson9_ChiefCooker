package by.htp.cook.food;

import by.htp.cook.print.Printable;

public abstract class Product implements Printable {

	private double weight;
	private String name;
	
	public Product(String name) {
		this.name = name;
	}

	public Product(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public double getProtein() {
		return getProteinBy100Gr() * weight / 100;
	}

	public double getFat() {
		return getFatBy100Gr() * weight / 100;
	}

	public double getCarbohydrate() {
		return getCarbohydrateBy100Gr() * weight / 100;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCalories() {
		double calories = 4 * getProtein() + 9 * getFat() + 4 * getCarbohydrate();
		return calories;
	}
	
	public void printInfo() {
		System.out.println(getCalories() + "\t\t" + getWeight() + "\t\t" + getName());
	}
	
	public abstract double getProteinBy100Gr();

	public abstract double getFatBy100Gr();

	public abstract double getCarbohydrateBy100Gr();
}
