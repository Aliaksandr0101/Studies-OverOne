package BasicsOOP;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Customer customerFirst = new Customer();
        customerFirst.surname = "Silkin";
        customerFirst.name ="Petr";
        customerFirst.dateOfBirth = "08.12.1994";
        customerFirst.numberPhone = 375257540828L;
        customerFirst.check(customerFirst);
    }
    String surname;
    String name;
    String dateOfBirth;
    long numberPhone ;

      public void check(Customer customer){
        Customer customerSecond = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter phone number");
        if (scanner.hasNextLong()){
            customerSecond.numberPhone = scanner.nextLong();
            String result = customerSecond.numberPhone == customer.numberPhone
                    ? "phone number matches"
                    : "phone number  does not match";
            System.out.println(result);
        }
        else{
            System.out.println("You did not enter a phone number. Restart the program and try again");
        }

      }

}
