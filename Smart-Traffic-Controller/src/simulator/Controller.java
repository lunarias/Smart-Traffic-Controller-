package simulator;

import java.util.ArrayList;

public class Controller{

    private int grid_height = 8;
    private int grid_width = 8;


    private ArrayList<Car> list_car = new ArrayList<>();
    private int max_cars = 280;
    private Car[][] cars = new Car[][];
    private Intersection[][] intersections = new Intersection[][];
    private Road[][] roads = new Road[grid_height][grid_width];




    public Controller(){
        roads[0][2] = 
    }

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

    public static void main(String[] args) {

    }


}
