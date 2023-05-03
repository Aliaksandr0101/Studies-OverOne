import java.util.Scanner;

public class HomeworkOneThree {
    public static void main(String[] args) {
        /*Условие задачи
        На ввод подаётся четырёхзначное число. 1000 - пример четырёхзначного числа. Выведите сумму цифр этого числа.
                Пример ввода: 1234
        Пример вывода: 10*/
        int numberEnter, numberResult;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число от 1000 до 9999 и вы увидите сумму его цифр");
        numberEnter = scanner.nextInt();
        scanner.close();
        numberResult = (numberEnter/1000)+(numberEnter%1000/100)+(numberEnter%1000%100/10)+(numberEnter%1000%100%10);
        System.out.println("Сумма цифр вашего числа = " + numberResult);

    }
}
