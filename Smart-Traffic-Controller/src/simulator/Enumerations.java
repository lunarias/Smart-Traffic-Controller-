package simulator;

public class Enumerations {
    
    public enum Directions {
        
        NORTH("North"),
        EAST("East"),
        SOUTH("South"),
        WEST("West");
    
        public String str;
    
        Directions(String str) {
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
