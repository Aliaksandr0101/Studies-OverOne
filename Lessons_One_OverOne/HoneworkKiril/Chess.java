package HoneworkKiril;

import java.util.Scanner;

public class Chess {
    public void check(){
        int horizontalFigureOne, verticalFigureOne, horizontalFigureTwo, verticalFigureTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the shapes. Enter 4 numbers from 1 to 8");
        horizontalFigureOne = scanner.nextInt();
        verticalFigureOne = scanner.nextInt();
        horizontalFigureTwo = scanner.nextInt();
        verticalFigureTwo = scanner.nextInt();
        scanner.close();
        boolean beat;
        int rezultHorizontal = Math.abs(horizontalFigureOne-horizontalFigureTwo);
        int rezultVertical = Math.abs(verticalFigureOne-verticalFigureTwo);
        if (rezultHorizontal == rezultVertical){
            beat = true;
           /* System.out.println("Beat");*/
        }else if(horizontalFigureOne == horizontalFigureTwo || verticalFigureOne == verticalFigureTwo){
            beat = true;
            /*System.out.println("beat");*/
        }else beat = false;
            /*System.out.println("no beat");*/

         if (beat) {
             System.out.println("beat");
          }else System.out.println("no beat");

    }
}
