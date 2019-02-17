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
            cars.add(new ArrayList<>(grid_height));
            intersections.add(new ArrayList<>(grid_height));
            roads.add(new ArrayList<>(grid_height));
        }
    }

    public void place_car(int x, int y) {
    }


}
