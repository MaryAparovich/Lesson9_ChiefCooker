package by.htp.cook.food.dressing;

public class CheeseSauce extends Dressing{

	public CheeseSauce(double weight, String name) {
		super(weight, name);
	}

	@Override
	public double getProteinBy100Gr() {
		return 2.5;
	}

	@Override
	public double getFatBy100Gr() {
		return 36;
	}

	@Override
	public double getCarbohydrateBy100Gr() {
		return 5.5;
	}
}
