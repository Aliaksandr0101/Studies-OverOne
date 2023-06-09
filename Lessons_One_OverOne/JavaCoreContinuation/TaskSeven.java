package JavaCoreContinuation;

import java.util.Scanner;

public class TaskSeven {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        int sizeLine, sizeColumn;
        do {
            System.out.println("pls enter size line");
            sizeLine = scanner.nextInt();
        }while(sizeLine <= 0);
        do {
            System.out.println("pls enter size column");
            sizeColumn = scanner.nextInt();
        }while(sizeLine <= 0);
        scanner.close();
        int[][] matrix = new int[sizeLine][sizeColumn];

        for (int i = 0; i < sizeLine; i++) {
            for (int j = 0; j < sizeColumn ; j++) {
                matrix[i][j] = (int) (Math.random()*20);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < sizeColumn ; j++) {
                matrix[i][j] *= 3;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
