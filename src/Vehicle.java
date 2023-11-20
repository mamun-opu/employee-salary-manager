public class Vehicle {
    private final String make;
    private final String plate;
    private String color;
    private String category;

    public Vehicle(String make, String plate,String color, Management.VehicleType category){
        this.make = make;
        this.plate = plate;
        this.color = color;

        if(category == Management.VehicleType.RACE){
            this.category = "RACE";
        } else if (category == Management.VehicleType.NOT_FOR_RACE) {
            this.category = "NOT_FOR_RACE";
        } else if(category == Management.VehicleType.Family){
            this.category = "FAMILY";
        }
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
