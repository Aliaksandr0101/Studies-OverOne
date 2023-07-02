package Phone;

import java.util.Scanner;

public class Shells {
    public void checkPartOne() {
        int numberAfterParse, numberOfLines;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s\n", "pls enter the number of lines to check");
        numberOfLines = scanner.nextInt();
        for (int i = 0; i < numberOfLines; i++) {
            System.out.printf("%s\n", "pls enter any line");
            String line = scanner.next();
            try {
                numberAfterParse = Integer.parseInt(line);
                System.out.printf("%s%s%d\n", "pls enter any line:", " ", numberAfterParse);

            } catch (NumberFormatException e) {
                System.out.printf("%s\n", "Not valid");
            }
        }
        scanner.close();
    }
    public void checkPartTwo() {
        int number = 120;
        Integer numberI = Integer.valueOf(number);
        double numberD = 4.12;
        Double numberDouble = Double.valueOf(number);
        float numberF = 4.12f;
        Float numberFloat = Float.valueOf(numberF);
        long numberL = 789155548784115548L;
        Long longNumber = Long.valueOf(numberL);
        short numberShort = 32766;
        Short shortNumber = Short.valueOf(numberShort);
        char symbol = 'r';
        Character symbolCh = Character.valueOf(symbol);
        boolean word = true;
        Boolean wordB = Boolean.valueOf(word);

    }
}



