package HomeworkOverOne;

import java.util.Scanner;

public class TaskTen {
    public void check(){
        int numberOne, numberTwo, numberThree, replacement;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three any numbers and I will display these numbers in ascending order");
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();
        numberThree = scanner.nextInt();
        scanner.close();
        if (numberTwo >= numberThree){
            replacement = numberThree;
            numberThree = numberTwo;
            numberTwo = replacement;
        }
        if (numberOne >= numberTwo) {
            replacement = numberTwo;
            numberTwo = numberOne;
            numberOne = replacement;
        }
        if (numberTwo >= numberThree){
            replacement = numberThree;
            numberThree = numberTwo;
            numberTwo = replacement;
        }
        System.out.println("Your numbers are ascending " + numberOne + " " + numberTwo + " " + numberThree);
    }
}
