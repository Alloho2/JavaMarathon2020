package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;
    private boolean salaryIsOnce = true;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        bonus();

    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() == 1_000_000 && salaryIsOnce) {
            salary *= 2;
            salaryIsOnce = false;
        }
    }
}
