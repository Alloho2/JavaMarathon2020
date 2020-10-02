package day11;

public class Picker implements Worker {
    private int salary = 0;
    private Warehouse warehouse;
    private boolean salaryIsOnce = true;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
        bonus();
    }


    @Override
    public void bonus() {
        if (warehouse.getCountOrders() == 1500 && salaryIsOnce) {
            salary *= 3;
            salaryIsOnce = false;
        }
    }
}
