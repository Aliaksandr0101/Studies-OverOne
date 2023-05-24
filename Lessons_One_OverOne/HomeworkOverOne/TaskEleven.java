package HomeworkOverOne;

import java.util.Scanner;

public class TaskEleven {
    public void check(){
        int numberOne, numberTwo;
        char action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two any numbers and sign: +  sum, - difference, : division, * subtraction, % remainder of the division");
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();
        action = scanner.next().charAt(0);
        scanner.close();
        switch (action) {
            case '+':
                System.out.println("sum " + numberOne+numberTwo);
                break;
            case '-':
                    System.out.println("difference " + (numberOne-numberTwo));
                    break;
            case '*':
                System.out.println("subtraction " + numberOne*numberTwo);
                break;
            case '/':
                System.out.println("division " + numberOne/numberTwo);
                break;
            case '%':
                System.out.println("remainder of the division " + numberOne%numberTwo);
                break;
            default:
                System.out.println("no such action");
                break;
        }

    }
}
