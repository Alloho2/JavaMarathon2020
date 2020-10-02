package day11;

public class Warehouse {
    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }

    private int countOrders;
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "На складе " +
                " Количество заказов=" + countOrders +
                ", Баланс=" + balance +
                '}';
    }
}
