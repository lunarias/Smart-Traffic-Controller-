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

    
    public boolean is_valid_path(Enumerations direction) {
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