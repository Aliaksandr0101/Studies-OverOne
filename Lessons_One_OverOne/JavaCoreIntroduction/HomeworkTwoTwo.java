package JavaCoreIntroduction;

import java.util.Scanner;

public class HomeworkTwoTwo {
    public void check() {
        /*На входе подаётся три числа. Ожидается, что одно из них нечётное. Вывести номер нечётного.
                Пример ввода: 2 6 7.
        Вывод: 3.*/
        int numberOne, numberTwo, numberThree;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целочисленных числа, одно из которых НЕЧЕТНОЕ");
        System.out.println("Введите первое число");
        numberOne = scanner.nextInt();
        System.out.println("Введите второе число");
        numberTwo = scanner.nextInt();
        System.out.println("Введите третье число");
        numberThree = scanner.nextInt();
        scanner.close();
        if (numberOne%2 != 0) {
            System.out.println("Первое число нечетное");
        } else if (numberTwo%2 == 1){
            System.out.println("Второе число нечетное");
        }else
            System.out.println("Третье число нечетное");

    }
}
