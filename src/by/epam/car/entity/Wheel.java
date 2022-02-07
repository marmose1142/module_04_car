package by.epam.car.entity;

import java.util.Objects;

public class Wheel {
	private String wheel;

	public Wheel() {

	}

	public Wheel(String wheel) {
		this.wheel = wheel;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public void spinTheWheel() {
		System.out.println("Колеса крутяться");
	}

	@Override
	public int hashCode() {
		return Objects.hash(wheel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return Objects.equals(wheel, other.wheel);
	}

	@Override
	public String toString() {
		return "Wheel [wheel=" + wheel + "]";
	}

}
