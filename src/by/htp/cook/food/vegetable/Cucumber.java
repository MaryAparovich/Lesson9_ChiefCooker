package by.htp.cook.food.vegetable;

public class Cucumber extends Vegetable {

	public Cucumber(double weight, String name) {
		super(weight, name);
	}

	@Override
	public double getProteinBy100Gr() {
		return 0.7;
	}

	@Override
	public double getFatBy100Gr() {
		return 0.1;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 3.6;
	}

}
