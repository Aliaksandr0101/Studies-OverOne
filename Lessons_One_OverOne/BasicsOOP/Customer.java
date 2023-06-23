package BasicsOOP;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Customer customerFirst = new Customer();
        customerFirst.surname = "Silkin";
        customerFirst.name ="Petr";
        customerFirst.dateOfBirth = "08.12.1994";
        customerFirst.numberPhone = 375257540828L;
        customerFirst.address = "Шевченко 5";
        customerFirst.сompare(customerFirst);
    }
     String surname;
     String name;
     String dateOfBirth;
     String address;
     long numberPhone ;

      public void check(Customer customer){
        Customer customerSecond = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter phone number. Phone number consists of 12 digits");
        if (scanner.hasNextLong()){
            customerSecond.numberPhone = scanner.nextLong();
            scanner.close();
            String result = customerSecond.numberPhone == customer.numberPhone
                    ? "Your phone number matches"
                    : "Your phone number  does not match";
            System.out.println(result);
        }
        else{
            System.out.println("You did not enter a phone number. Restart the program and try again");
            scanner.close();
        }
      }
      public void сompare( Customer customer ) {
          Customer customerSecond = new Customer();
          Scanner scanner = new Scanner(System.in);
          System.out.printf("%s%n", "pls enter your address through one space: name street and number house ");
          customerSecond.address = scanner.nextLine();
          scanner.close();

          String result = (customer.address.equals(customerSecond.address))
                  ? "this address matches"
                  : "this address not matches";
          System.out.println(result);
          }
}

