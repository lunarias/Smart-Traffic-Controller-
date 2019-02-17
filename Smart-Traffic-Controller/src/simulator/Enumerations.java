package simulator;

public class Enumerations {
    
    public enum Directions {
        
        NORTH("North", 0),
        EAST("East", 1),
        SOUTH("South", 2),
        WEST("West", 3);
    
        public String str;
        public int order;
    
        Directions(String str, int order) {
            this.str = str;
            this.order = order;
        }
        
        public int getOrder() {
        	return this.order;
        }
        
        public static Directions get_direction(int i) {
        	if(i == 0)
        		return NORTH;
        	else if(i == 1)
        		return EAST;
        	else if(i == 2)
        		return SOUTH;
        	else
        		return WEST;
        }
    }

    public enum Signals {
    	GREEN("Green"),
    	YELLOW("Yellow"),
    	RED("Red");
    	
    	public String str;
        
        Signals(String str) {
            this.str = str;
        }
    }
    
    public enum Condition {
        ICY("Icy", 0.18),
        WET("Wet", 0.4),
        SNOWY("Snowy", 0.28),
        DRY("Dry", 0.6);

        public String str;
        public Double coefficient;

        Condition(String str, double coefficient) {
            this.str = str;
            this.coefficient = coefficient;
        }

        public String get_condition() {
            return this.str;
        }

        public double get_friction_coefficient() {
            return this.coefficient;
        }

    }
    
}
