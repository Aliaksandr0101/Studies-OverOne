package ClassString;

import java.util.Scanner;

public class TaskTwo {
    public void check(){
        int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("pls enter enter something (string or number)");
    String string = scanner.nextLine();

    char [] stringChar = string.toCharArray();
    scanner.close();

        for (int i = 0; i < stringChar.length ; i++) {
            if(stringChar[i]>47 && stringChar[i]<58){
                count++;
            } else
                System.out.println("it is not number");
            break;
        }

         if (count == stringChar.length-1) {
             int number = Integer.parseInt(string);
             String programAnswer = (number%2 == 0) ? "number is even" : "number is not even";
             System.out.println(programAnswer);
         }
}
}
