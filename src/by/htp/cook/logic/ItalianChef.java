package by.htp.cook.logic;

import by.htp.cook.food.dressing.Dressing;
import by.htp.cook.food.dressing.OliveOil;
import by.htp.cook.food.salad.Salad;
import by.htp.cook.food.vegetable.Cabbage;
import by.htp.cook.food.vegetable.Cucumber;
import by.htp.cook.food.vegetable.Onion;
import by.htp.cook.food.vegetable.Pepper;
import by.htp.cook.food.vegetable.Tomato;
import by.htp.cook.food.vegetable.Vegetable;

public class ItalianChef extends Cook {

	public ItalianChef(String nameChief) {
		super(nameChief);
	}
	
	@Override
	public Salad cookSalad(String name) {
		Salad salad = super.cookSalad(name);		
		System.out.println("Italian chef " + getChiefName() + "\n");
		return salad;
	}

	protected Vegetable[] getVegetables() {
		Vegetable tomato = new Tomato(100, "Tomato");
		Vegetable cucumber = new Cucumber(50, "Cucumber");
		Vegetable cabbage = new Cabbage(150, "Cabbage");
		Vegetable onion = new Onion(10, "Onion");
		Vegetable pepper = new Pepper(60, "Pepper");
		Vegetable[] vegetableArray = { tomato, cucumber, cabbage, onion, pepper };
		return vegetableArray;
	}

	protected Dressing getDressing() {
		Dressing dressing = new OliveOil(20, "Olive Oil");
		return dressing;
	}

}
