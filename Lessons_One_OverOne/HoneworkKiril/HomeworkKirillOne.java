package HoneworkKiril;

import java.util.Scanner;

public class HomeworkKirillOne {
    public void check() {
        int a, b, c, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if (b <= c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a <= b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (b <= c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
