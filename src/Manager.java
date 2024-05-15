public class Manager extends Employee {
    private int travelDays;
    private int clientsNumber;

    // Constructors
    public Manager(String name, int birthYear, int clientsNumber, int travelDays) {
        super(name, birthYear);
        initializeManager(clientsNumber, travelDays);
    }

    public Manager(String name, int birthYear, int travelDays, int clientsNumber, double occupationRate) {
        super(name, birthYear, occupationRate);
        initializeManager(clientsNumber, travelDays);
    }

    public Manager(String name, int birthYear, int clientsNumber, int travelDays, double occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        initializeManager(clientsNumber, travelDays);
    }

    public Manager(String name, int birthYear, int clientsNumber, int travelDays, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        initializeManager(clientsNumber, travelDays);
    }

    private void initializeManager(int clientsNumber, int travelDays) {
        this.clientsNumber = clientsNumber;
        this.travelDays = travelDays;
    }

    public int getTravelDays() {
        return travelDays;
    }

    public int getClientsNumber() {
        return clientsNumber;
    }

    @Override
    public double annualIncome() {

        return super.annualIncome() + 500 * this.getClientsNumber() + 100 * this.getTravelDays();
    }
}
