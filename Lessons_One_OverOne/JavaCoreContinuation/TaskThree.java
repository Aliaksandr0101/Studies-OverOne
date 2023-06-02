package JavaCoreContinuation;

import java.util.Scanner;

public class TaskThree {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        int numberElements, minIndex = 0, min;
        do {
            System.out.println("enter array size");
            numberElements = scanner.nextInt();
        } while (numberElements < 0 || numberElements == 0);
        int [] array = new int[numberElements];

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter one array element");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]<=min){
                min = array[j];
                minIndex = j;
            }
        }
        System.out.println("index of the minimum array element " + minIndex);

    }
}
