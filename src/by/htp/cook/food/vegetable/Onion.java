package by.htp.cook.food.vegetable;

public class Onion extends Vegetable {

	public Onion(double weight, String name) {
		super(weight, name);
	}

	@Override
	public double getProteinBy100Gr() {
		return 1.1;
	}

	@Override
	public double getFatBy100Gr() {
		return 0.1;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 9;
	}

	
	
}
