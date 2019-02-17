package simulator;
import java.util.List;

public class Road {
    
    protected int speed_limit = 0;
    private List ticks;
    private List directions_list;
    
    public Road (int speed, List directions){
        this.speed_limit = speed;
        this.directions_list = directions;
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
    
    public boolean is_valid_path(Direction direction) {
        if (this.directions_list.contains(direction)) {
            return true;
        } else {
            return false;
        }
    }
    
    public int get_speed_limit() {
        return speed_limit;
    }
    
    
}