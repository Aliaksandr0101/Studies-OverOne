package HomeworkKiril;

import java.util.Scanner;

public class HomeworkKirillTwo {
    public void check(){
        int number, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number and I will output  the sum of the squares of these numbers");
        number = scanner.nextInt();

        while (number!=0){
            sum +=(number * number);
            number = scanner.nextInt();
        }
        System.out.println("the sum of the squares = " + sum);
        scanner.close();
    }
}
