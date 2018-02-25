package by.htp.cook.food.dressing;

public class Mayo extends Dressing {
	
	public Mayo(double weight, String name) {
		super(weight, name);
	}

	@Override
	public double getProteinBy100Gr() {
		return 1;
	}

	@Override
	public double getFatBy100Gr() {
		return 75;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 0.6;
	}
}
