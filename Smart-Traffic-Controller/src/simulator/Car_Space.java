package simulator;

public class Car_Space extends Space{

    public Car_Space(int x, int y){
        super(x,y);
    }

    private Car[] cars = new Car[2];
    private boolean has_car_0 = false;
    private boolean has_car_1 = false;

    public Car[] getCars() {
        return this.cars;
    }


    public Car get_car_0(){
        if(has_car_0){
            return cars[0];
        }
        else{
            return null;
        }
    }

    public Car get_car_1(){
        if(has_car_1){
            return cars[1];
        }
        else{
            return null;
        }
    }

    public boolean has_car(){
        return has_car_0||has_car_1;
    }

    public boolean is_car_here(Enumerations.Directions dir){
        if(dir == Enumerations.Directions.NORTH || dir == Enumerations.Directions.EAST) {
            return has_car_0;
        }
        else{
            return has_car_1;
        }
    }

    public void addCar(Car car, Enumerations.Directions direction) {
        if(direction == Enumerations.Directions.NORTH || direction == Enumerations.Directions.EAST) {
            cars[0] = car;
            has_car_0 = true;
        }
        else {
            cars[1] = car;
            has_car_1 = true;
        }
    }

    public void deleteCar(Enumerations.Directions direction) {
        if(direction == Enumerations.Directions.NORTH || direction == Enumerations.Directions.EAST) {
            has_car_0 = false;
        }
        else {
            has_car_1 = false;
        }
    }
}
