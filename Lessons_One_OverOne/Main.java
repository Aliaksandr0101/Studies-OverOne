import PeculiaritiesOOP.Customer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Vladimir", "Shevchenko, 7", 13);
        Customer customer = new Customer("Vladimir", "Shevchenko, 7");
        customer.compare(order);
    }
}

