package by.htp.cook.input;

import java.util.Scanner;

public class Input {
	
	static Scanner myScanner;
	static {
		myScanner = new Scanner(System.in);
		myScanner.useLocale(java.util.Locale.ENGLISH);
	}

	public static double getCaloricityFirst() {
		double caloricityFirst = enterCaloricityFirst();
		return caloricityFirst;
	}

	public static double  getCaloricitySecond() {
		double caloricitySecond = enterCaloricitySecond();
		return caloricitySecond;
	}

	private static double enterCaloricityFirst() {
		System.out.print("\nSet the caloricity range of the salad from: ");
		double numberOne = myScanner.nextDouble();
		return numberOne;
	}

	private static double enterCaloricitySecond() {
		System.out.print("to: ");
		double numberSecond = myScanner.nextDouble();
		return numberSecond;
	}
}
