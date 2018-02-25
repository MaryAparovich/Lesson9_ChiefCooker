package by.htp.cook.logic;

import by.htp.cook.food.dressing.Dressing;
import by.htp.cook.food.dressing.Mayo;
import by.htp.cook.food.salad.Salad;
import by.htp.cook.food.vegetable.Cucumber;
import by.htp.cook.food.vegetable.Tomato;
import by.htp.cook.food.vegetable.Vegetable;

public class FrenchChief extends Cook {

	public FrenchChief(String nameChief) {
		super(nameChief);
	}
	
	@Override
	public Salad cookSalad(String name) {
		Salad salad = super.cookSalad(name);
		System.out.println("\nFrench chef " + getChiefName() + "\n");
		return salad;
	}

	protected Vegetable[] getVegetables() {
		Vegetable tomato = new Tomato(90, "Tomato");
		Vegetable cucumber = new Cucumber(80, "Cucumber");
		Vegetable[] vegetableArray = { tomato, cucumber };
		return vegetableArray;
	}

	protected Dressing getDressing() {
		Dressing dressing = new Mayo(10, "Mayo");
		return dressing;
	}
}
