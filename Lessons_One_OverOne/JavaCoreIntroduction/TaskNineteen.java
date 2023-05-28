package JavaCoreIntroduction;

import java.util.Scanner;

public class TaskNineteen {
    public void check(){
        int numberRang, number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter any  number more zero");
            numberRang = scanner.nextInt();
        } while (numberRang < 0 || numberRang == 0);
        do {
            System.out.println("enter any number more zero");
            number = scanner.nextInt();
        }while (number == 0 || number < 0 );
        scanner.close();

        for (int i = 0; i < number; i++) {

            int result = (int) (Math.random()*(numberRang-(-numberRang)+1))+(-numberRang);
            System.out.println("random number "+ i + " = " + result);

        }

    }
}
