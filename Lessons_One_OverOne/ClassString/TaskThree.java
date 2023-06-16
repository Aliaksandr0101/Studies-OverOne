package ClassString;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public void check(){
        boolean allWards = true ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the words");
        String words = scanner.nextLine();
        scanner.close();
        String [] arrayWords = words.split("\\s+");
        System.out.println(Arrays.toString(arrayWords));

        for (int i = 0; i < arrayWords.length ; i++) {
            if (arrayWords[i].charAt(0) == arrayWords[i].charAt(arrayWords[i].length()-1)) {
            System.out.println("this word start and end with the same letter: " + arrayWords[i]);
             allWards = false;
            }
        }
      if(allWards){
          System.out.println("all words conditions are not provided");
      }
    }
}
