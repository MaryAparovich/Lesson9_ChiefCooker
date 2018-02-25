package by.htp.cook.logic;

import by.htp.cook.food.dressing.Dressing;
import by.htp.cook.food.salad.Salad;
import by.htp.cook.food.vegetable.Vegetable;

public abstract class Cook {
	private String chiefName;

	public Cook(String nameChief) {
		this.chiefName = nameChief;
	}

	public Salad cookSalad(String name) {
		Vegetable[] vegetableArray = getVegetables();
		Dressing dressing = getDressing();
		Salad salad = new Salad(name, vegetableArray, dressing);
		return salad;
	}

	public String getChiefName() {
		return chiefName;
	}

	protected abstract Vegetable[] getVegetables();

	protected abstract Dressing getDressing();
}
