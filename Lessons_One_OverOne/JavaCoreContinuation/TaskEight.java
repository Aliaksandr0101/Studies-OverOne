package JavaCoreContinuation;

import java.util.Scanner;

public class TaskEight {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        int sizeMatrix, numberLine;
        do {
            System.out.println("pls enter size matrix");
            sizeMatrix = scanner.nextInt();
        } while (sizeMatrix <= 0);
        do {
            System.out.println("pls enter number line from 0 to " + (sizeMatrix - 1));
            numberLine = scanner.nextInt();
        } while (numberLine < 0 || numberLine >= sizeMatrix);
        scanner.close();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = (int) ((Math.random() * 10));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizeMatrix ; i++) {
            matrix[i][i] = matrix[numberLine][i];
        }
        System.out.println();
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        }
    }
