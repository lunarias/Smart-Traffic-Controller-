package simulator;

import java.util.ArrayList;

public class Car {

    private double current_speed = 0;
    private double braking_ratio = 0;
    private boolean is_moving = false;
    private boolean is_decrelerating = false;
    private boolean is_accelerating = false;
    private int frames_since_moved = 0;
    private ArrayList<Integer> idle_times = new ArrayList<>();

    public Car(){

    }

}