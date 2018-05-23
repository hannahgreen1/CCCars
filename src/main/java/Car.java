import behaviours.IEngine;

public class Car extends Vehicle implements IEngine{

    private int doors;
    public Car(String make, String model, int wheels, double price,
               String colour, String engine, TireType type, int doors){
        super(make, model, wheels, price, colour, engine, type);
        this.doors = doors;
    }

    public int getNumberOfDoors(){
        return this.doors;
    }

    public TireType getTireType(){
        return this.type;
    }

    public String noise (String noise) {
        return noise;
    }

    @Override
    public String engine(String noise) {
        return null;
    }
}
