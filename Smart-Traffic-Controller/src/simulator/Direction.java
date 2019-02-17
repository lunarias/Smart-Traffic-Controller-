package simulator;

public class Direction {
    
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
    
}
