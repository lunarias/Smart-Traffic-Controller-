package simulator;
import java.util.List;

public class Intersection {
    
    private int carsPassed;
    
    private List directions_active;
    
    
    // Priority for turns, weighted - currently set to 1/3 chance for any turn
    private double left_priority = 1;
    private double straight_priority = 1;
    private double right_priority = 1;
    
    
    public Intersection(List directions) {
        this.directions_active = directions;
    }
    
    public boolean is_direction_active(Enumerations.Directions checkDirection) {
        return (directions_active.contains(checkDirection));
    }
    
    
}