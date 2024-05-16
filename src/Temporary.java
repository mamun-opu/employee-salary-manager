public class Temporary implements Contract {
    private double hourlyWages;
    private int workingHours;

    public Temporary(double hourlyWages, int workingHours) {
        this.hourlyWages = hourlyWages;
        this.workingHours = workingHours;
    }

    public double accumulatedSalary() {
        return hourlyWages * (double) workingHours;
    }

    @Override
    public String toString() {
        return "Temporary{hourlyWages=" + hourlyWages + ", workingHours=" + workingHours + "}";
    }

    public String contractInfo() {
        return String.format("He is a temporary employee with %.2f hourly salary, and he has worked for %d hours.\n", hourlyWages, workingHours);
    }
}
