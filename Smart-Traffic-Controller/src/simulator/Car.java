package simulator;

public class Car {
    public int id;
//    private double current_speed = 0;
//    private double braking_ratio = 0;
//    private boolean is_moving = false;
//    private boolean is_decelerating = false;
//    private boolean is_accelerating = false;
//    private int frames_waiting = 0;
    private int speed;
    private int x;
    private int y;
    private Enumerations.Directions facing_direction;
    private boolean stuck = false;
    private int stuck_count = 0;

    public Car(int num, int x, int y, int speed, Enumerations.Directions direction){
        id = num;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.facing_direction = direction;
    }

    public void change_direction(Enumerations.Directions direction) {
        this.facing_direction = direction;
    }
    
    public Enumerations.Directions get_facing_direction() {
    	return this.facing_direction;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public int get_speed() {
    	return this.speed;
    }
    
    public void set_speed(int speed) {
    	this.speed = speed;
    }
    
    public void update_stuck_time() {
    	if(stuck == true) {
    		stuck_count++;
    	}
    	if(speed == 0) {
    		stuck = true;
    	}
    }
    
    public int reset_stuck() {
    	this.stuck = false;
    	int temp = stuck_count;
    	stuck_count = 0;
    	return temp;
    }
    
}