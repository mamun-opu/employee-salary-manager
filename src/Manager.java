public class Manager extends Employee{
    private int nbTravelDays;
    private int nbClients;
    public Manager(String name, int birthYear, double monthlySalary, int rate, int nbTravelDays, int nbClients) {
        super(name, birthYear, monthlySalary, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }
}
