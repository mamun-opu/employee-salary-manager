class Temporary implements Contract {
    private double hourlySalary;
    private int accumulatedHours;

    // Constructor for Temporary contract
    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double accumulatedSalary() {
        return hourlySalary * accumulatedHours;
    }

    // Getters and setters for Temporary contract attributes
    // ...
}
