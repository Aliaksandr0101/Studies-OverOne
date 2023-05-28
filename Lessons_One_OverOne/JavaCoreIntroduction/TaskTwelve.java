package JavaCoreIntroduction;

import java.util.Scanner;

public class TaskTwelve {
    public void check(){
        long number, count = 1, result  = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number more zero");
        number = scanner.nextLong();
        while (number<=0){
            System.out.println("you enter number less or equals zero. repeat input");
            number = scanner.nextLong();
        }
        scanner.close();

        while (result <= number) {
            result = count * count;
            String output = result<=number?"output: " + result: "the end";
            System.out.println(output);
            count++;
        }

    }
}
