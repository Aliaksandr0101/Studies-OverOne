package JavaCoreContinuation;
import java.util.Scanner;

public class TaskFour {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        int numberElements, count = 0, number = 0, minHonest=0;
        do {
            System.out.println("enter array size");
            numberElements = scanner.nextInt();
        } while (numberElements < 0 || numberElements == 0);

        int [] array = new int[numberElements];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("enter one array element");
            array[i] = scanner.nextInt();

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

        for (int i = 0; i <arrayHonest.length-1 ; i++) {
            for (int j = 1; j <arrayHonest.length; j++) {
                if (arrayHonest[i] > arrayHonest[j]){
                int temp = arrayHonest[j];
                arrayHonest[j] = arrayHonest[i];
                arrayHonest[i] = temp;
                }
            }
        }

        for (int i = 0; i < arrayHonest.length ; i++) {

               if (arrayHonest[i] !=0) {
                   minHonest = arrayHonest[i];
                   break;
               }
        }
        System.out.println(minHonest);

        System.out.println("new array elements");
        for (int i = 0; i <array.length ; i++) {
            double arrayI = array[i];
            double arrayHonestMin = minHonest;
            double newElement = arrayI / arrayHonestMin;
            System.out.print(" " + newElement);

        }
    }

    }


