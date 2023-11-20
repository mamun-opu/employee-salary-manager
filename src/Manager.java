public class Manager extends Employee{
    private int nbTravelDays;
    private int nbClients;
    public Manager(String name, int birthYear, double monthlySalary, int nbTravelDays, int nbClients) {
        super(name, birthYear, monthlySalary);
        if(IsValidateInputs(nbTravelDays, nbClients)){
            this.nbTravelDays = nbTravelDays;
            this.nbClients = nbClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
        System.out.println(", manager!");
    }
    public Manager(String name, int birthYear, double monthlySalary, int nbTravelDays, int nbClients, int rate) {
        super(name, birthYear, monthlySalary, rate);
        if(IsValidateInputs(nbTravelDays, nbClients)){
            this.nbTravelDays = nbTravelDays;
            this.nbClients = nbClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
        System.out.println(", manager!");
    }

    public Manager(String name, int birthYear, double monthlySalary, int nbTravelDays, int nbClients, Vehicle vehicle){
        super(name, birthYear, monthlySalary, vehicle);
        if(IsValidateInputs(nbTravelDays, nbClients)){
            this.nbTravelDays = nbTravelDays;
            this.nbClients = nbClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
        System.out.println(", manager!");
    }
    public Manager(String name, int birthYear, double monthlySalary, int nbTravelDays, int nbClients, Vehicle vehicle, int rate){
        super(name, birthYear, monthlySalary,vehicle, rate);
        if(IsValidateInputs(nbTravelDays, nbClients)){
            this.nbTravelDays = nbTravelDays;
            this.nbClients = nbClients;
        }else {
            throw new IllegalArgumentException("invalid input for travel days or client number");
        }
        System.out.println(", manager!");
    }
    private boolean IsValidateInputs(int nbTravelDays, int nbClients) {
        return nbTravelDays >= 0 && nbClients >= 0;
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
