package by.htp.cook.runner;

import by.htp.cook.food.salad.Salad;
import by.htp.cook.input.Input;
import by.htp.cook.logic.Cook;
import by.htp.cook.logic.FrenchChief;
import by.htp.cook.logic.ItalianChef;

public class MainApp {

	public static void main(String[] args) {

		Cook cookItalian = new ItalianChef("Antonio Carluccio");
		Cook cookFrench = new FrenchChief("Paul Bocuse");

		Salad italianSalad = cookItalian.cookSalad("Ladies");
		italianSalad.bubbleSort();
		italianSalad.printInfo();
		italianSalad.findRangeCaloricity(Input.getCaloricityFirst(), Input.getCaloricitySecond());
		
		Salad frenchSalad = cookFrench.cookSalad("Mood");
		frenchSalad.bubbleSort();
		frenchSalad.printInfo();
		frenchSalad.findRangeCaloricity(Input.getCaloricityFirst(), Input.getCaloricitySecond());
	}
}
