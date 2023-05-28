package JavaCoreIntroduction;

import java.util.Scanner;

public class TaskTwenty {
    public void check() {
        int numberA, numberB;
        double root = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("you have equation ax+b=0. enter any number for variables a");
        numberA = scanner.nextInt();
        System.out.println("you have equation ax+b=0. enter any number for variables b");
        numberB = scanner.nextInt();
        scanner.close();

        if (numberA == 0 && numberB == 0){
            System.out.println("X equals any number");
        }
        if (numberA == 0) {
            System.out.println("equation not root");
         }
       else {
            root = -1.0*(numberB)/numberA;
            String result = (root == -0)
                    ?"equation have one root x = 0"
                    : "root x = " + root;
            System.out.println(result);

        }
    }

    }

