package simulator;
import java.util.Random;

public class Intersection extends Car_Space {

	private Enumerations.Signals signalNS; //North South signal
	private Enumerations.Signals signalWE; //West East signal
	private boolean[] directions = new boolean[4];
	private int[] weights = new int[4];
	private int tick_rateNS;
	private int tick_rateWE;
	private int tick;
	
	public Intersection(int x, int y, Enumerations.Signals signalNS, int tick_rateNS, int tick_rateWE, int tick, boolean[] directions, int[] weights) {
		super(x, y);
		this.signalNS = signalNS;
		this.tick_rateNS = tick_rateNS;
		this.tick_rateWE = tick_rateWE;
		this.directions = directions;
		this.weights = weights;
		
		if(signalNS == Enumerations.Signals.GREEN) {
			this.signalWE = Enumerations.Signals.RED;
			this.tick = tick_rateNS;
		}
		else if(signalNS == Enumerations.Signals.RED) {
			this.signalWE = Enumerations.Signals.GREEN;
			this.tick = tick_rateWE;
		}
	}
    
	public Enumerations.Signals getSignal(Enumerations.Directions direction) {
		if(direction.order == 0 || direction.order == 2) {
			return signalNS;
		}
		return this.signalWE;
	}
	
	public boolean[] getDirections() { 
		return this.directions;
	}
	
	public Enumerations.Directions calculateDirection(Enumerations.Directions incomingDirection) {
		int totalWeight = 0;
		
		for(int i = 0; i < 4; i++) {
			//skip the direction you're coming from
			if(i == incomingDirection.order) {
				continue;
			}
			
			totalWeight += weights[i];
		}
		
		Random rand = new Random();
		int random = rand.nextInt(totalWeight);
		for(int i = 0; i < 4; i++) {
			//skip the direction you're coming from
			if(i == incomingDirection.order) {
				continue;
			}
			
			random -= weights[i];
			if(random < 0) {
				return Enumerations.Directions.get_direction(i);
			}
		}
		//poorly written code. this line should never be hit so we don't care
		return Enumerations.Directions.get_direction(0);
	}


	public void updateIntersection() {
		this.tick--;
		if(this.tick == 0) {
			if(this.signalNS == Enumerations.Signals.GREEN) {
				this.signalNS = Enumerations.Signals.YELLOW;
				this.tick = 2;
			}
			else if(this.signalNS == Enumerations.Signals.YELLOW) {
				this.signalNS = Enumerations.Signals.RED;
				this.signalWE =  Enumerations.Signals.GREEN;
				this.tick = this.tick_rateWE;
			}
			else if(this.signalWE == Enumerations.Signals.GREEN) {
				this.signalWE = Enumerations.Signals.YELLOW;
				this.tick = 2;
			}
			else if(this.signalWE == Enumerations.Signals.YELLOW) {
				this.signalWE = Enumerations.Signals.RED;
				this.signalNS = Enumerations.Signals.GREEN;
				this.tick = this.tick_rateNS;
			}
		}
	}

    @Override
    public String toString() {
        return "+";
    }
}