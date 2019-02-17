package simulator;
import java.util.List;

public class Intersection {
    
    private int carsPassed;
    private List directions_active;
    
    
    public Intersection(List directions) {
        this.directions_active = directions;
    }
    
    public boolean is_direction_active(Enumerations.Directions checkDirection) {
        return (directions_active.contains(checkDirection));
    }
    
    
}