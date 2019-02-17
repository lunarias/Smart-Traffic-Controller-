package simulator;
import java.util.List;

public class Road {
    
    private int max_speed;
    private List ticks;
    
    public Road (int speed){
        set_speed(speed);
    }
    
    public enum Condition {
        ICY("Icy"),
        WET("Wet"),
        SNOWY("Snowy"),
        DRY("Dry");
    
        public String str;
    
        Condition(String str) {
            this.str = str;
        }
        
        public String get_condition() {
            return this.str;
        }
        
        public double get_friction_coefficient(Condition) {
            if (Condition.ICY) {
                return 0.18;
            } else if (Condition.SNOWY) {
                return 0.28;
            } else if (Condition.WET) {
                return 0.4;
            } else if (Condition.DRY) {
                return 0.6;
            }
        }
    
    }
    
    
    public void set_speed(int speed) {
        this.max_speed = speed;
    }
    

}