package HomeworkOverOne;

import java.util.Scanner;

public class TaskThirteen {
    public void check(){
        long number, count;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any natural number");
        number = scanner.nextLong();
        while (number <= 0){
            System.out.println("you enter number less zero or zero. repeat input");
            number = scanner.nextLong();
        }
        scanner.close();
        count = number - 1;

        while (count < number){
            if (number%count==0){
                System.out.println("Maximum natural divisor = " + count);
                break;
            }
            count--;
        }
    }
}
