package Ex_01;

import Ex_01.Engine;
import Ex_01.Helm;

public class Auto {
	
	private int power;
	private int years;
	private Helm helm;
	private Engine engine;
	
	public Auto(int power, int years, Helm helm, Engine engine) {
		super();
		this.power = power;
		this.years = years;
		this.helm = helm;
		this.engine = engine;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [power=" + power + ", years=" + years + ", helm=" + helm + ", engine=" + engine + "]";
	}
	
	
	

}