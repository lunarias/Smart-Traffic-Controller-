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
    	map[0][0] = new Space(0,0);
    	map[0][1] = new Space(0,1);
        map[0][2] = new Road(0, 2, 50, ns, 4, true);
        spawn_points.add((Road)(map[0][2]));
		map[0][3] = new Space(0,3);
		map[0][4] = new Space(0,4);
		map[1][0] = new Space(1,0);
		map[1][1] = new Space(1,1);
        map[1][2] = new Road(1, 2, 50, ns, 4, false);
        map[1][3] = new Space(1,3);
        map[1][4] = new Space(1,4);
        map[2][0] = new Space(2,0);
        map[2][1] = new Space(2,1);
        map[2][2] = new Intersection(2, 2, Enumerations.Signals.GREEN, 30, 30, 30, directions, weights);
        map[2][3] = new Space(2,3);
        map[2][4] = new Space(2,4);
        map[3][0] = new Space(3,0);
        map[3][1] = new Space(3,1 );
        map[3][2] = new Road(3, 2, 50, ns, 4, false);
        map[3][3] = new Space(3,3);
        map[3][4] = new Space(3,4);
        map[4][0] = new Space(4,0);
        map[4][1] = new Space(4,1);
        map[4][2] = new Road(4, 2, 50, ns, 4, true);
        map[4][3] = new Space(4,3);
        map[4][4] = new Space(4,4);

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
				Enumerations.Directions dir;
				int speed = 0;
				if(spawn_points.get(i).get_x() == 0) {
					//if coming from the north
					dir = Enumerations.Directions.SOUTH;
					if(check_space(spawn_points.get(i).get_x() + 1, spawn_points.get(i).get_y(), dir)){
						speed = 50;
					}
					
				}
				else{
					if(spawn_points.get(i).get_x() == grid_height -1){
						//coming from the south
						dir = Enumerations.Directions.NORTH;
						if(check_space(spawn_points.get(i).get_x() - 1, spawn_points.get(i).get_y(), dir)){
							speed = 50;
						}

					}
					else{
						if(spawn_points.get(i).get_y() == 0){
							//coming from west
							dir = Enumerations.Directions.EAST;
							if(check_space(spawn_points.get(i).get_x(), spawn_points.get(i).get_y() + 1, dir)){
								speed = 50;
							}

						}
						else{
							//coming from East
							dir = Enumerations.Directions.WEST;
							if(check_space(spawn_points.get(i).get_x(), spawn_points.get(i).get_y() -1, dir)){
								speed = 50;
							}
						}
					}
				}
				int x = spawn_points.get(i).get_x();
				int y = spawn_points.get(i).get_y();
				((Road)map[x][y]).addCar(new Car(car_id++, x,y, speed, dir), dir);
				return;
			}
		}
    }

    public boolean check_space(int x, int y, Enumerations.Directions dir){

    	if(map[x][y].getClass() == Intersection.class ){
			Intersection sec = (Intersection) map[x][y];
			if(sec.is_car_here(dir)|| sec.getSignal(dir).equals(Enumerations.Signals.RED)){
				return false;
			}
			else{
				return true;
			}

		}
		else {
    		if(map[x][y].getClass() ==  Road.class){
				Road rec = (Road)map[x][y];
				if(rec.is_car_here(dir)){
					return false;
				}
				else{
					return true;
				}

			}
		}
		return false;
	}
	public void move_car(Space place, Enumerations.Directions dir){
    	if(place.getClass() == Road.class){
    		Road inter = (Road) place;
    		Car car;
			if(dir == Enumerations.Directions.NORTH || dir == Enumerations.Directions.EAST){
				car = inter.get_car_0();
			}
			else{
				car = inter.get_car_1();
			}
			if(car != null){
				boolean can_move = false;
				switch(dir){
					case NORTH:
						can_move = check_space(car.getX()-1, car.getY(), Enumerations.Directions.NORTH);
						break;
					case SOUTH:
						can_move = check_space(car.getX()+1, car.getY(), Enumerations.Directions.SOUTH);
						break;
					case EAST:
						can_move = check_space(car.getX(), car.getY()+1, Enumerations.Directions.EAST);
						break;
					case WEST:
						can_move = check_space(car.getX(), car.getY()-1, Enumerations.Directions.WEST);
						break;
				}
				if(can_move){
					((Road) place).deleteCar(dir);
					switch(dir){
						case NORTH:
							if(map[place.get_x()-1][place.get_y()].getClass() == Intersection.class ||
									map[place.get_x()-1][place.get_y()].getClass() == Road.class){
								((Car_Space)(map[place.get_x()-1][place.get_y()])).addCar(car, dir);
							}

							break;
						case SOUTH:
							if(map[place.get_x()+1][place.get_y()].getClass() == Intersection.class ||
									map[place.get_x()+1][place.get_y()].getClass() == Road.class){
								((Car_Space)(map[place.get_x()+1][place.get_y()])).addCar(car, dir);
							}
							break;
						case EAST:
							if(map[place.get_x()][place.get_y()+1].getClass() == Intersection.class ||
									map[place.get_x()][place.get_y()+1].getClass() == Road.class){
								((Car_Space)(map[place.get_x()][place.get_y()+1])).addCar(car, dir);
							}

							break;
						case WEST:
							if(map[place.get_x()][place.get_y()-1].getClass() == Intersection.class ||
									map[place.get_x()][place.get_y()-1].getClass() == Road.class){
								((Car_Space)(map[place.get_x()][place.get_y()-1])).addCar(car, dir);
							}
							break;
					}
				}
			}
		}
		else{
    		if(place.getClass() == Intersection.class){
    			Intersection inter = (Intersection) place;
				Car car;
				if(dir == Enumerations.Directions.NORTH || dir == Enumerations.Directions.EAST){
					car = inter.get_car_0();
				}
				else{
					car = inter.get_car_1();
				}
				if(car != null){
					Enumerations.Directions nextdir = inter.calculateDirection(dir);
					boolean can_move = false;
					switch(nextdir){
						case NORTH:
							can_move = check_space(car.getX()-1, car.getY(), Enumerations.Directions.NORTH);
							break;
						case SOUTH:
							can_move = check_space(car.getX()+1, car.getY(), Enumerations.Directions.SOUTH);
							break;
						case EAST:
							can_move = check_space(car.getX(), car.getY()+1, Enumerations.Directions.EAST);
							break;
						case WEST:
							can_move = check_space(car.getX(), car.getY()-1, Enumerations.Directions.WEST);
							break;
					}
					if(can_move) {
						car.change_direction(nextdir);
						((Intersection)place).deleteCar(dir);
						switch (dir) {
							case NORTH:
								if (map[place.get_x() - 1][place.get_y()].getClass() == Intersection.class ||
										map[place.get_x() - 1][place.get_y()].getClass() == Road.class) {
									((Car_Space) (map[place.get_x() - 1][place.get_y()])).addCar(car, dir);
								}

								break;
							case SOUTH:
								if (map[place.get_x() + 1][place.get_y()].getClass() == Intersection.class ||
										map[place.get_x() + 1][place.get_y()].getClass() == Road.class) {
									((Car_Space) (map[place.get_x() + 1][place.get_y()])).addCar(car, dir);
								}
								break;
							case EAST:
								if (map[place.get_x()][place.get_y() + 1].getClass() ==Intersection.class ||
										map[place.get_x()][place.get_y() + 1].getClass() == Road.class) {
									((Car_Space) (map[place.get_x()][place.get_y() + 1])).addCar(car, dir);
								}

								break;
							case WEST:
								if (map[place.get_x()][place.get_y() - 1].getClass() ==Intersection.class ||
										map[place.get_x()][place.get_y() - 1].getClass() == Road.class) {
									((Car_Space) (map[place.get_x()][place.get_y() - 1])).addCar(car, dir);
								}
								break;
						}
					}
				}
			}
		}
	}




    public void update() {
		boolean[] directions = new boolean[4];
		int[] weights = new int[4];
		Enumerations.Directions[] ns = new Enumerations.Directions[2];
		for(int i=0; i<grid_height; i++){
			for(int j=0; j<grid_width; j++){
				if(map[i][j].getClass() == Intersection.class){
					((Intersection)map[i][j]).updateIntersection();
				}
			}
		}
		for(int i=0; i<grid_height; i++) {
			for (int j=0; j < grid_width; j++) {
				if(map[i][j].getClass() == Intersection.class ||
						map[i][j].getClass() == Road.class){
					move_car(map[i][j], Enumerations.Directions.WEST);
				}
			}
		}
		for(int i=0; i<grid_height; i++) {
			for (int j=grid_width-1; j >0; j--) {
				if(map[i][j].getClass() == Intersection.class ||
						map[i][j].getClass() == Road.class){
					move_car(map[i][j], Enumerations.Directions.EAST);
				}
			}
		}
		for(int j=0; j< grid_width; j++){
			for(int i=0; i<grid_height; i++){
				if(map[i][j].getClass() == Intersection.class ||
						map[i][j].getClass() == Road.class){
					move_car(map[i][j], Enumerations.Directions.NORTH);
				}
			}
		}

		for(int j=0; j< grid_width; j++){
			for(int i=grid_height-1; i>0; i--){
				if(map[i][j].getClass() == Intersection.class ||
						map[i][j].getClass() == Road.class){
					move_car(map[i][j], Enumerations.Directions.NORTH);
				}
			}
		}


	}

	public void printout(){
    	for(int j=0; j<grid_width; j++){
    		for(int i=0; i<grid_height; i++){
    			System.out.print(map[i][j].toString());
			}
			System.out.println();
		}
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
    	Controller help = new Controller();
    	help.printout();
    	help.spawnCar();
    	help.spawnCar();
    	help.printout();
    	for(int i=0; i<50; i++){
    		help.update();
    		help.printout();
		}
    	
    }


}
