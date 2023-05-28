package JavaCoreIntroduction;

import java.util.Scanner;

public class TaskSeventeen {
    public void check(){
        long number, power, result=1;
        double resultNegativePower;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        number = scanner.nextLong();
        System.out.println("enter any number-power");
        power = scanner.nextLong();
        while(number == 0){
            System.out.println("you enter zero. pls enter new  number");
            number = scanner.nextLong();
        }
        scanner.close();

        if (power == 0) {
            System.out.println("number = " + 1);
        }
        if (power > 0){
            for (long i  = 1; i <= power ; i++) {
                result *=number;
            }
            System.out.println("positive power number = " + result);
        }
        if (power < 0){
            power = Math.abs(power);
            for (long i  = 1; i <= power ; i++) {
                result *=number;
            }
            resultNegativePower = 1.0/result;
            System.out.println("negative power number = " + resultNegativePower);
        }
    }
}
