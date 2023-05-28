package JavaCoreIntroduction;

import java.util.Scanner;

public class TaskFourteen {
    public void check() {
        double numberNegativePower;
        long number, power, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number except zero");
        number = scanner.nextLong();
        System.out.println("Enter any number power");
        power = scanner.nextLong();
        while (number == 0) {
            System.out.println("you enter zero. pls enter new number");
            number = scanner.nextLong();
        }
        scanner.close();
        temp = number;
        if (power == 0) {
            System.out.println("number raised to a power = " + 1);
        }
        if (power > 0) {
            while (power != 1) {
                number = number * temp;
                power--;
            }
            System.out.println("number raised to a power = " + number);
        }
        if(power < 0){
            power = Math.abs(power);
            while (power != 1){
                number = number * temp;
            power--;
        } numberNegativePower = 1.0/number;
        System.out.println("number raised to a power = " + numberNegativePower);
        }

    }
}
