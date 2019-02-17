package simulator;
import java.util.List;

public class Intersection extends Space {

	private Enumerations.Signals signal;
	private boolean[] directions = new boolean[4];
	private int[] weights = new int[4];
	
	public Intersection(int x, int y, Enumerations.Signals signal, boolean[] directions, int[] weights) {
		super(x, y);
		this.signal = signal;
		this.directions = directions;
		this.weights = weights;
	}
    
	public Enumerations.Signals getSignal() {
		return this.signal;
	}
	
	public boolean[] getDirections() { 
		return this.directions;
	}
	
	public Enumerations.Directions calculateDirection(Enumerations.Directions incomingDirection) {
		int number_directions = 0;
		for(int i = 0; i < 4; i++) {
			
		}
		
		return;
	}
}