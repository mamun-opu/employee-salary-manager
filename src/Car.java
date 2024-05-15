public class Car extends Vehicle {
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public Gear getGear() {
        return gear;
    }

    public CarType getType() {
        return type;
    }
    public String toString() {
        // Call the toString method of the superclass (Vehicle) to include common attributes
        String total = super.toString();
        // Add Car-specific information to the string representation
        total = total + "   -Gear: " + this.getGear() + "\n";
        total = total + "   -Type: " + this.getType() + "\n";
        return total;
    }
}
