package JavaCoreContinuation;
import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        int numberElements, count = 0, element = 0, number = 0, size;
        do {
            System.out.println("enter array size");
            numberElements = scanner.nextInt();
        } while (numberElements < 0 || numberElements == 0);

        int [] array = new int[numberElements];

        while (element < array.length) {
            System.out.println("enter one array element except zero");
                size = scanner.nextInt();
                if (size != 0){
                    array[element] = size;
                    element++;
                }
        }
        scanner.close();

        for (int i = 0; i < array.length ; i++) {
                if ( array[i]%2 == 0){
                    count++;
                }
            }

        int [] arrayHonest = new int[count];

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                arrayHonest[number] = array[i];
                number++;
            }
        }

        for (int i = 0; i <arrayHonest.length ; i++) {
            for (int j = 1; j <arrayHonest.length; j++) {
                if (arrayHonest[i] > arrayHonest[j]){
                int temp = arrayHonest[j];
                arrayHonest[j] = arrayHonest[i];
                arrayHonest[i] = temp;
                }
            }

        }
        System.out.println("new array elements");
        for (int i = 0; i <array.length ; i++) {
            double arrayI = array[i];
            double arrayHonestMin = arrayHonest[0];
            double newElement = arrayI / arrayHonestMin;
            System.out.print(" " + newElement);

        }
    }

    }


