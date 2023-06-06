package JavaCoreContinuation;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
    public void check(){
        int sizeLine, sizeColumn;
        Scanner scanner = new Scanner(System.in);
        sizeLine = scanner.nextInt();
        sizeColumn = scanner.nextInt();
        int [][] matrix = new int[sizeLine][sizeColumn];
        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < sizeLine ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {


            }

        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
