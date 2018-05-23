public abstract class Vehicle{

    private String make;
    private String model;
    private int wheels;
    private double price;
    private String colour;
    private String engine;
    protected TireType type;

    public Vehicle(String make, String model, int wheels, double price,
                   String colour, String engine, TireType type){
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.type = type;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getNumberOfWheels(){
        return this.wheels;
    }

    public double getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }

    public String getEngine(){
        return this.engine;
    }

    public TireType getTireType(){
        return this.type;
    }



}
