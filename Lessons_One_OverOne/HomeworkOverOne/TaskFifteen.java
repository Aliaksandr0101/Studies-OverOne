package HomeworkOverOne;

import java.util.Scanner;

public class TaskFifteen {
    public void check(){
        int preNumber, number, postNumder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter any positive numbers");
        preNumber = scanner.nextInt();
        number = scanner.nextInt();
        postNumder = scanner.nextInt();
        while (preNumber==0||number==0||postNumder==0){
            System.out.println("no local max");
            System.out.println("pls enter any positive numbers");
            preNumber = scanner.nextInt();
            number = scanner.nextInt();
            postNumder = scanner.nextInt();
        }
        if (number>preNumber&&number>postNumder){
            System.out.println("local max = " + number);
            while (postNumder!=0){
                preNumber = number;
                number = postNumder;
                postNumder = scanner.nextInt();
                if (postNumder ==0 ){
                    System.out.println("more no local max");
                    break;
                }
                if (number>preNumber&&number>postNumder){
                    System.out.println("local max = " + number);
            }
        }
    }
}
}
