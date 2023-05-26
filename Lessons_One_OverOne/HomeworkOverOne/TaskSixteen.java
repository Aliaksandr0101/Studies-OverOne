package HomeworkOverOne;

import java.util.Scanner;

public class TaskSixteen {
    public void check(){
        long number, sum = 0;
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("enter any number and I will find the factorial");*/
        do { System.out.println("enter any natural number more than one and I will find sum all even number");
            number = scanner.nextLong();
        } while (number <=1);
       /* number = scanner.nextLong();
        while(number<=0){
            System.out.println("you entered zero or a negative number. try again");
            number = scanner.nextLong();
        }*/
        scanner.close();
        for (int i = 2; i <= number && i%2 == 0 ; i = i + 2) {
                 sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
