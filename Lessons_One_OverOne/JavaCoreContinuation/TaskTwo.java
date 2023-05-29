package JavaCoreContinuation;
import java.util.Scanner;

public class TaskTwo {
    public void check(){
    Scanner scanner = new Scanner(System.in);
    int numberElements, element;
    do {
        System.out.println("enter array size");
        numberElements = scanner.nextInt();
    } while (numberElements < 0 || numberElements == 0);
    int [] array = new int[numberElements];

    for (int i = 0; i < array.length; i++) {
        System.out.println("enter one array element");
        element = scanner.nextInt();
        array[i] = element;
    }
    scanner.close();
    for (int j = 0; j < array.length; j = j+2) {
        System.out.println("this element is in an even position " + array[j]);
        }

    }
}
