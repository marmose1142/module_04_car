package by.epam.car.carLogic;

import java.util.Scanner;

import by.epam.car.entity.Car;

public class CarLogic {

	public String enteringEngine(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public String enteringWheel(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public String enteringCarBrand(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.hasNext();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public void goCar(Car car) {
		car.getEngine().onEngine();
		car.getWheel().spinTheWheel();
		System.out.println("trrrrrrrrrr");
	}

	public void changeWheel(Car car, CarLogic carLogic) {

		String wheel = carLogic.enteringWheel("Please, enter a new wheel model");

		car.getWheel().setWheel(wheel);

		System.out.println("a new " + car.getWheel() + " wheel has been installed");
	}

	public void refuelingCar() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of gasoline");

		if (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println("enter the amount of gasoline");
		}

		System.out.println("you poured " + sc.nextInt() + " liters into the gas tank");

	}

}
