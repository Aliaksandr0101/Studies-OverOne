package JavaCoreContinuation;

import java.util.Scanner;

public class TaskFive {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        int numberElements, count=0;
        do {
            System.out.println("enter array is size");
            numberElements = scanner.nextInt();
        } while (numberElements < 0 || numberElements == 0);

        int[] array = new int[numberElements];

        System.out.println("now enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (array[i]==array[j] && i!=j){
                    count++;
                }
            }
        }

        System.out.println("number of different equal elements = " +count);
    }
}