package JavaCoreContinuation;
import java.util.Scanner;

public class TaskFour {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        int numberElements, min;
        do {
            System.out.println("enter array size");
            numberElements = scanner.nextInt();
        } while (numberElements < 0 || numberElements == 0);
        int [] array = new int[numberElements];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("enter one array element");
            array[i] = scanner.nextInt();
        }
        scanner.close();

       min = array[0];

        for (int i = 0; i < array.length; i++) {
            if ((min % 2 != 0 && array[i] % 2 == 0 && array[i]!=0) || (min > array[i] && array[i] % 2 == 0 && array[i]!=0) ){
                min=array[i];
            }
        }
             System.out.print("new array elements:");
        if (min!=0){
             for (int i = 0; i < array.length; i++) {
                 double arrayI = array[i];
                 double arrayHonestMin = min;
                 double newElement = arrayI / arrayHonestMin;
                 System.out.print(" " + newElement);
             }
        }else System.out.println("no even or non-zero element");

         }
    }




