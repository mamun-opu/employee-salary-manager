public class Motorcycle extends Vehicle{
    private boolean hasSideCar;


    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSideCar) {
        super(make, plate, color, category);
        this.hasSideCar = hasSideCar;

    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public String toString(){
        String Total = super.toString();
        Total = Total + "   -SideCar: "+ this.isHasSideCar() + "\n";
        return  Total;
    }
}
