public class Car extends Vehicle{
    private String gear;
    private String type;
    public Car(String make, String plate, String color, Management.VehicleType category, Management.Gear gear, Management.CarType type) {
        super(make, plate, color, category);

        if(gear == Management.Gear.Automatic){
            this.gear = "Automatic";
        }else if(gear == Management.Gear.Manual){
            this.gear = "Manual";
        }

        if(type == Management.CarType.SUV){
            this.type = "SUV";
        } else if (type == Management.CarType.Sport) {
            this.type = "Sport";
        } else if(type == Management.CarType.Sedan){
            this.type = "Sedan";
        } else if (type == Management.CarType.Hatchback) {
            this.type = "Hatchback";
        }
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGear() {
        return gear;
    }

    public String getType() {
        return type;
    }
}
