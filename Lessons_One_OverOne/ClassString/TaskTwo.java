package ClassString;
import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public void check(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter  something (string or number)");
        String string = scanner.nextLine();

        char [] stringChar = string.toCharArray();
        System.out.println(Arrays.toString(stringChar));
        scanner.close();

    if (stringChar[0] == 45) {
        count=1;
        for (int i = 1; i < stringChar.length ; i++) {
            if (stringChar[i] > 47 && stringChar[i] < 58) {
                count++;
            } else {
                System.out.println("it is not number");
                System.exit(1);
            }
        }
    } else {

        for (int i = 0; i < stringChar.length ; i++) {
            if(stringChar[i]>47 && stringChar[i]<58){
                count++;
            } else {
                System.out.println("it is not number");
                System.exit(1);
            }
        }
    }

         if (count == stringChar.length) {
             int number = Integer.parseInt(string);
             String programAnswer = (number % 2 == 0)
                     ? "number is even"
                     : "number is not even";
             System.out.println(programAnswer);
         }
}
}
