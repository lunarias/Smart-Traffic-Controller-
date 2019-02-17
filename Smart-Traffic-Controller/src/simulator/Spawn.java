package simulator;

import simulator.Enumerations.Directions;

public class Spawn extends Road {

	private double spawn_probability;
	
	public Spawn(int x, int y, int speed_limit, Directions[] directions, int weight, double spawn_probability) {
		super(x, y, speed_limit, directions, weight);
		this.spawn_probability = spawn_probability;
	}

	public double get_spawn_probability() {
		return this.spawn_probability;
	}
}
