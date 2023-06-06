package JavaCoreContinuation;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
    public void check(){
        int sizeLine, sizeColumn;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("pls enter size line");
            sizeLine = scanner.nextInt();
        }while(sizeLine > 0);
        do {
            System.out.println("pls enter size column");
            sizeColumn = scanner.nextInt();
        }while(sizeLine > 0);
        scanner.close();

        int [][] matrix = new int[sizeLine][sizeColumn];
        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j]>max) {
                    max = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j]==max) {
                    System.out.println("index of maximum element i = " + (i + 1) +" j = " + (j + 1));
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
