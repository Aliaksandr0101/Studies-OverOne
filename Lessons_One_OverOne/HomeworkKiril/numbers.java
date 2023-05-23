package HomeworkKiril;
import java.util.Scanner;

public class numbers {
    public void check(){
        int a, b, c, temp;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if (b>=c){
            temp = b;
            b = c;
            c = temp;
        }
        if (a>=b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b>=c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
