package simulator;
import java.util.List;

public class Road {
    
    protected int speed_limit = 0;
    private List ticks;
    private List directions_list;
    private int weight;
    
    public Road (int speed_limit, List directions, int weight){
        this.speed_limit = speed_limit;
        this.directions_list = directions;
        this.weight = weight;
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
    
    public int get_weight() {
    	return weight;
    }
    
    
}