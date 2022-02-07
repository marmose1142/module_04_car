package by.epam.car.entity;

import java.util.Objects;

public class Car {
	private String carBrand;
	private Wheel wheel;
	private Engine engine;

	public Car() {
		this.wheel = new Wheel();
		this.engine = new Engine();
	}

	public Car(String carBrand) {
		this.carBrand = carBrand;
		this.wheel = new Wheel();
		this.engine = new Engine();
	}

	public Car(String carBrand, Wheel wheel, Engine engine) {
		this.carBrand = carBrand;
		this.wheel = wheel;
		this.engine = engine;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carBrand, engine, wheel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carBrand, other.carBrand) && Objects.equals(engine, other.engine)
				&& Objects.equals(wheel, other.wheel);
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", wheel=" + wheel + ", engine=" + engine + "]";
	}

}
