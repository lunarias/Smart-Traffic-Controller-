package simulator;

//North and East are 0 index, South and West are 1 index
public class Road extends Space{
    
    protected int speed_limit = 50;
    private Enumerations.Directions[] directions = new Enumerations.Directions[2];
    private Car[] cars = new Car[2];
    private int weight;
    private boolean isSpawn;
    
    public Road (int x, int y, int speed_limit, Enumerations.Directions[] directions, int weight, boolean isSpawn){
        super(x, y);
    	this.speed_limit = speed_limit;
        this.directions = directions;
        this.weight = weight;
        this.isSpawn = isSpawn;
    }

    public boolean check_is_spawn() {
    	return isSpawn;
    }
    
    public Enumerations.Directions[] get_directions() {
        return directions;
    }
    
    public int get_speed_limit() {
        return speed_limit;
    }
    
    public int get_weight() {
    	return weight;
    }
    
    public Car[] getCars() {
    	return this.cars;
    }
    
    public void addCar(Car car, Enumerations.Directions direction) {
    	if(direction == Enumerations.Directions.NORTH || direction == Enumerations.Directions.EAST) {
    		cars[0] = car;
    	}
    	else {
    		cars[1] = car;
    	}
    }
    
    public void deleteCar(Enumerations.Directions direction) {
    	if(direction == Enumerations.Directions.NORTH || direction == Enumerations.Directions.EAST) {
    		cars[0] = null;
    	}
    	else {
    		cars[1] = null;
    	}
    }
    
    
}