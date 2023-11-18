public class Manager extends Employee{
    private int nbTravelDays;
    private int nbClients;
    public Manager(String name, int birthYear, double monthlySalary, int rate, int nbTravelDays, int nbClients) {
        super(name, birthYear, monthlySalary, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        System.out.println("We have a new employee");
    }

    public void setNbTravelDays(int nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }

    @Override
    double annualIncome() {
        int gain_factor_client = 500;
        int gain_factor_travel = 100;
        return ((getMonthlySalary() * 12) + (gain_factor_travel * nbTravelDays) + (gain_factor_client * nbClients));
    }
}
