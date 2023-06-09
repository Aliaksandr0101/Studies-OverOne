package ClassString;

import java.util.Scanner;

public class TaskOne {
    public void check(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("enter one letter of the Latin alphabet");
        String letter = scanner.nextLine();
        scanner.close();

        char [] sentenceChar = sentence.toCharArray();
        char letterChar = letter.charAt(0);
        for (int i = 0; i < sentenceChar.length ; i++) {
            if (sentenceChar[i] == letterChar ){
                count++;
            }
        }
        String conclusion = (count  > 0)
                ? "this symbol repeats " + count
                : "this symbol is not here";
        System.out.println(conclusion);
    }
}
