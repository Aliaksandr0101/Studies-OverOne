package HomeworkKiril;

import java.util.Scanner;

public class HomeworkKirilThree {
    public void check(){
        int number, preMax=0, max=0;
        System.out.println("pls any numbers I will find preMax number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        do {
            if (number>=max){
                preMax=max;
                max=number;
                number = scanner.nextInt();
            }
            if (number>=preMax&&number<max){
                preMax = number;
                number = scanner.nextInt();
            }
        }while (number!=0);
        scanner.close();
        System.out.println("preMax number = " + preMax);
    }
}
