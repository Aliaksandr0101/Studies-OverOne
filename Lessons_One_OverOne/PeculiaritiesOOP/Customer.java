package PeculiaritiesOOP;

public class Customer {
    String name, address;
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void compare(Order order ){
        String result = (order.name.equalsIgnoreCase(this.name) && order.address.equalsIgnoreCase(this.address))
                ? "this order belongs to the current customer"
                : "this order does not belong to the current customer";
        System.out.printf("%S%n", result);
    }

    public static void main(String[] args) {
        Order order = new Order("Vladimir", "Shevchenko, 7", 13);
        Customer customer = new Customer("VladimiR", "Shevchenko, 7");
        customer.compare(order);
    }

}
