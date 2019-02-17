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
    
    }
    
    
    public void set_speed(int speed) {
        this.max_speed = speed;
    }
    

}