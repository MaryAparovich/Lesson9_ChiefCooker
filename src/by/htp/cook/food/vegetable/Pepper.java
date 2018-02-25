package by.htp.cook.food.vegetable;

public class Pepper extends Vegetable {

	public Pepper(double weight, String name) {
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
		return 4.6;
	}

}
