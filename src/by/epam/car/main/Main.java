package by.epam.car.main;

import by.epam.car.carLogic.CarLogic;
import by.epam.car.carView.CarView;
import by.epam.car.entity.Car;

/*Создать объект класса Автомобиль, используя классы Колесо и Двигатель.Методы:ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.*/

public class Main {
	public static void main(String[] args) {
		CarLogic carLogic = new CarLogic();
		CarView carView = new CarView();

		Car car = new Car(carLogic.enteringCarBrand("Please, enter the car model"));
		car.getEngine().setEngine(carLogic.enteringEngine("Please, enter the engine model"));
		car.getWheel().setWheel(carLogic.enteringWheel("Please, enter the wheel model"));

		carLogic.goCar(car);
		carLogic.changeWheel(car, carLogic);
		carView.printCarBrand(car);
		carLogic.refuelingCar();
	}

}
