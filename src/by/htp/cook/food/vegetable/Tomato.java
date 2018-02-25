package by.htp.cook.food.vegetable;

public class Tomato extends Vegetable {

	public Tomato(double weight, String name) {
		super(weight, name);
	}
	
	@Override
	public double getProteinBy100Gr() {
		return 0.9;
	}

	@Override
	public double getFatBy100Gr() {
		return 0.2;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 3.9;
	}	
}
