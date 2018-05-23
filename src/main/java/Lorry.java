public class Lorry extends Vehicle {

    private int doors;
    private int load;

    public Lorry(String make, String model, int wheels, double price,
               String colour, String engine, TireType type, int doors, int load){
        super(make, model, wheels, price, colour, engine, type);
        this.doors = doors;
        this.load = load;
    }

    public int getNumberOfDoors(){
        return this.doors;
    }

    public int getLoad() {
        return this.load;
    }
}
