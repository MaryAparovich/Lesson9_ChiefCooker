package by.htp.cook.food.dressing;

public class SunflowerOil extends Dressing {

	public SunflowerOil(double weight, String name) {
		super(weight, name);
	}

	@Override
	public double getProteinBy100Gr() {
		return 0;
	}

	@Override
	public double getFatBy100Gr() {
		return 100;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 0;
	}

}
