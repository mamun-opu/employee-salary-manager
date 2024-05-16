public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSideCar) {
        super(make, plate, color, category);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    @Override
    public String toString() {
        String total = super.toString();
        total = total + "   -SideCar: " + isHasSideCar() + "\n";
        return total;
    }
}
