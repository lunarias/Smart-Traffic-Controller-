package simulator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller{

    private int grid_height = 8;
    private int grid_width = 8;

    private ArrayList<ArrayList<Integer>> cars = new ArrayList<>();
    private ArrayList<ArrayList<Intersection>> intersections = new ArrayList<>();
    private ArrayList<ArrayList<Road>> roads = new ArrayList<>();


    public Controller(){
        for(int i=0; i<grid_width; i++ ){
            cars.add(new ArrayList<>());
            intersections.add(new ArrayList<>());
            roads.add(new ArrayList<>());
            for(int j = 0; j<grid_height; j++){
                cars.get(i).add(0);
                intersections.get(i).add(new Intersection());
                roads.get(i).add(new Road());
            }
        }
    }


}