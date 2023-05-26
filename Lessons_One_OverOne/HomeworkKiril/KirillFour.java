package HomeworkKiril;

import java.util.Scanner;

public class KirillFour {
    public void check() {
        long n, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number and I will find the factorial");
        n = scanner.nextLong();
        if (n == 0){
            System.out.println("The factorial =  " + 1);

        }
        else {
            for (long i = 1; i <= n; i++) {
                fact *=i;
            }
        }
        System.out.println("the factorial  = " + fact);
    }
}
