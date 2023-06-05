package JavaCoreContinuation;
import java.util.Scanner;

public class TaskFive {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        int size, temp, count=0;
        do {
            System.out.println("enter array is size");
            size = scanner.nextInt();
        } while (size < 0 || size == 0);

        int[] array = new int[size];

        System.out.println("now enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        temp = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==temp){
                count++;
                break;
            }
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j && array[i] != temp) {
                    count++;
                    for (int k = 0; k < array.length; k++) {
                        if (array[k] == array[j]) {
                            array[k] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("number of different equal elements = " +count);
    }
}