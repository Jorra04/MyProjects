package Enumerations;

public class Lights {
	enum LightState{
		OFF,
		LOW,
		MEDIUM,
		HIGH
	}
	LightState state;
	public Lights(LightState state) {
		this.state = state;
	}
	/*
	 * other code for class
	 * goes here
	 */
}
