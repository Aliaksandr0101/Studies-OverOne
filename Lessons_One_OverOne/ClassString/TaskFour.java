package ClassString;
import java.util.Scanner;

public class TaskFour {

    public void check(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter any words");
        String words = scanner.nextLine();
        scanner.close();
        String[] wordsArray = words.split("\\s+");
        String maxWord = wordsArray[0];

        for (int i = 1; i < wordsArray.length ; i++) {
            if (wordsArray[i].length() > maxWord.length()){
                maxWord = wordsArray[i];
            }
        }
        System.out.println("this is the longest word " + maxWord);
    }
    public void checkTWo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter any first line words");
        String firstLine = scanner.nextLine();
        System.out.println("pls enter any second line words");
        String secondLine = scanner.nextLine();
        scanner.close();
        boolean result = false;
        result = firstLine.toLowerCase().contains(secondLine.toLowerCase());
        if (result){
            System.out.println("the first line contains the second");
            System.exit(0);
        }
        result = firstLine.toUpperCase().contains(secondLine.toUpperCase());
        if (result){
            System.out.println("the first line contains the second");
        } else
            System.out.println("the first line does not contains the second");

    }
}
