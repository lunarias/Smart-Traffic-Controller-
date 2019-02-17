package simulator;

import java.util.ArrayList;

public class Controller{

    private int grid_height = 8;
    private int grid_width = 8;

    private ArrayList<ArrayList<Integer>> cars = new ArrayList<>();
    private ArrayList<ArrayList<Intersection>> intersections = new ArrayList<>();
    private ArrayList<ArrayList<Road>> roads = new ArrayList<>();
    private ArrayList<Car> list_car = new ArrayList<>();



    public Controller(){
        for(int i=0; i<grid_width; i++ ){
            intersections.add(new ArrayList<>(grid_height));
            roads.add(new ArrayList<>(grid_height));
            for(int j=0; j<grid_height; j++){
                cars.get(i).add(-1);
            }
        }
    }

    public void place_car(int x, int y) {
        int id = list_car.size();
        list_car.add(new Car(id,x ,y));
        cars.get(x).set(y, id);
    }

    public void move_car(int id, int old_x, int old_y){
        cars.get(old_x).set(old_y, -1);
        int new_x = list_car.get(id - 1).getX();
        int new_y = list_car.get(id - 1).getY();
        cars.get(new_x).set(new_y, id);

    }

    public void move_all_cars(){

    }


}
