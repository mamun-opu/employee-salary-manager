public class Motorcycle extends Vehicle{
    private boolean hasSideCar;


    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSideCar) {
        super(make, plate, color, category);
        this.hasSideCar = hasSideCar;

    }
}
