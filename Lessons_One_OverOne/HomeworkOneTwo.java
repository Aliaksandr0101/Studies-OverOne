import java.util.Scanner;

public class HomeworkOneTwo {
    public static void main(String[] args) {
//        Условие задачи
//        На вход подаётся число, вывести следующее за ним, нечётное число.
        int number, nextOddNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        number = scanner.nextInt();
        nextOddNumber = (number + 1) + number%2;
        System.out.println("Следующее нечетное число = " + nextOddNumber);
        scanner.close();
    }
}
