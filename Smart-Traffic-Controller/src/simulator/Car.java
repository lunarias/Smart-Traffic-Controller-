package simulator;

import java.util.ArrayList;

public class Car {
    public int id;
    private double current_speed = 0;
    private double braking_ratio = 0;
    private boolean is_moving = false;
    private boolean is_decrelerating = false;
    private boolean is_accelerating = false;
    private int frames_waiting = 0;
    private int x;
    private int y;
    private Enumerations.Directions facing_direction;
    private ArrayList<Integer> idle_times = new ArrayList<>();

    public Car(int num, int x, int y, Enumerations.Directions direction){
        id = num;
        this.x = x;
        this.y = y;
        current_speed = 0;
        this.facing_direction = direction;
    }

    public void change_direction(Enumerations.Directions direction) {
        this.facing_direction = direction;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public ArrayList<Boolean> getConditions(){
        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(is_moving);
        conditions.add(is_accelerating);
        conditions.add(is_decrelerating);
        return conditions;
    }



}