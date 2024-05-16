public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee has a " + getClass().getSimpleName() + " -make='" + make + "\n,-plate='" + plate + "\n,-color='" + color + "\n,-category=" + String.valueOf(category) + "\n";
    }
}
