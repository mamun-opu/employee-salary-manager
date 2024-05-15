public class Temporary implements Contract {
    private double hourlyWages;
    private int workingHours;

    public Temporary(double hourlyWages, int workingHours) {
        this.hourlyWages = hourlyWages;
        this.workingHours = workingHours;
    }

    @Override
    public double accumulatedSalary() {
        return hourlyWages*workingHours;
    }

    @Override
    public String toString() {
        return "Temporary{" +
                "hourlyWages=" + hourlyWages +
                ", workingHours=" + workingHours +
                '}';
    }

    @Override
    public String getContractInfo() {
        return String.format("He is a temporary employee with %.2f hourly salary, and he has worked for %d hours.\n",
                hourlyWages, workingHours);
    }
}