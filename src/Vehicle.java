public class Vehicle {
    private final String make;
    private final String plate;
    private String color;
    private final String category;
    public Vehicle(String make, String plate, String color, String category){
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }
}
