package simulator;
import java.util.List;

public class Road {
    
    private int max_speed;
    private List ticks;
    
    public Road (int speed){
        set_speed(speed);
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
    
    
    public void set_speed(int speed) {
        this.max_speed = speed;
    }
    

}