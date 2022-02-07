package by.epam.car.entity;

import java.util.Objects;

public class Engine {
	private String engine;

	public Engine() {

	}

	public Engine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void onEngine() {
		System.out.println("Включить зажигание");
	}

	public void offEngine() {
		System.out.println("Выключить зажигание");
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(engine, other.engine);
	}

	@Override
	public String toString() {
		return "Engine [engine=" + engine + "]";
	}

}
