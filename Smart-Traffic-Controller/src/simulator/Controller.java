package simulator;

import java.util.ArrayList;
import java.util.Random;

public class Controller{

    private int grid_height = 5;
    private int grid_width = 5;
    private int wait_times = 0;
    private int car_id = 1;

    private Space[][] map = new Space[grid_height][grid_width];
    private ArrayList<Road> spawn_points = new ArrayList<>();

//    private ArrayList<Car> list_car = new ArrayList<>();
//    private int max_cars = 280;
//    private Car[][] cars = new Car[][];
//    private Intersection[][] intersections = new Intersection[][];
//    private Road[][] roads = new Road[grid_height][grid_width];




    public Controller(){
    	Enumerations.Directions[] ns = new Enumerations.Directions[2];
    	Enumerations.Directions[] we = new Enumerations.Directions[2];
    	ns[0] = Enumerations.Directions.NORTH;
    	ns[1] = Enumerations.Directions.SOUTH;
    	we[0] = Enumerations.Directions.EAST;
    	we[1] = Enumerations.Directions.WEST;
    	boolean[] directions = new boolean[4];
    	int[] weights = new int[4];
    	for(int i = 0;i<4;i++) {
    		directions[i] = true;
    		weights[i] = 4;
    	}
        map[0][2] = new Road(0, 2, 50, ns, 4, true);
        spawn_points.add((Road)(map[0][2]));
        map[1][2] = new Road(1, 2, 50, ns, 4, false);
        map[2][2] = new Intersection(2, 2, Enumerations.Signals.GREEN, 30, 30, 30, directions, weights);
        map[3][2] = new Road(3, 2, 50, ns, 4, false);
        map[4][2] = new Road(4, 2, 50, ns, 4, true);
        spawn_points.add((Road)(map[4][2]));
        
        
    }
    
    public void spawnCar() {
    	int totalWeight = 0;
		
		for(int i = 0; i < spawn_points.size(); i++) {
			totalWeight += spawn_points.get(i).get_weight();
		}
		
		Random rand = new Random();
		int random = rand.nextInt(totalWeight);
		for(int i = 0; i < spawn_points.size(); i++) {
			
			random -= spawn_points.get(i).get_weight();
			if(random < 0) {
				if(spawn_points.get(i).get_x() == 0) {
					//if coming from the north
					
				}
				spawn_points.get(i).addCar(new Car(car_id++, spawn_points.get(i).get_x(), spawn_points.get(i).get_y(), 50, Enumerations.Directions direction), direction);
			}
		}
		//poorly written code. this line should never be hit so we don't care
		return Enumerations.Directions.get_direction(0);
    }
    
    public void update() {
    	
    }
/*
    public void spawn_car(Enumerations.Directions dir) {
        int id = list_car.size();
        list_car.add(new Car(id,x ,y, dir));
        cars.get(x).set(y, id);
    }

    public void move_car(int id, int old_x, int old_y){
        cars.get(old_x).set(old_y, -1);
        int new_x = list_car.get(id - 1).getX();
        int new_y = list_car.get(id - 1).getY();
        cars.get(new_x).set(new_y, id);

    }

    public ArrayList<Boolean> check_front_car(int x, int y, Enumerations.Directions direction){
        ArrayList<Boolean> no_car = new ArrayList<>();
        for(int i=0; i<4; i++){
            no_car.add(false);
        }
        ArrayList<Boolean> must_stop = new ArrayList<>();
        must_stop.add(true);
        for(int i=0; i<3; i++){
            must_stop.add(false);
        }
        int id;
        int front_x = x;
        int front_y = y;
        switch (direction){
            case EAST:
                front_x = x+1;
                break;
            case WEST:
                front_x = x-1;
                break;
            case NORTH:
                front_y = y-1;
                break;
            case SOUTH:
                front_y = y+1;
                break;
        }
        if(0<=x && x<grid_width){
            if(0<= y && y<grid_height){
                id = cars.get(front_x).get(front_y);
                if(id == -1){
                    return no_car;
                }
                return list_car.get(id).getConditions();
            }
            else{
                return must_stop;
            }
        }
        else {
            return must_stop;
        }


    }
    public void move_all_cars(){

    }
*/
    public static void main(String[] args) {
    	
    }


}
