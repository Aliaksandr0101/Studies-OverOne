package HomeworkOverOne;

import java.util.Scanner;

public class HomeworkOneFour {
    public static void main(String[] args) {
        /*Условие задачи
        На вход по даётся расстояние, в километрах и скорость в километрах в час, найти время , затраченное на путь.
        Пример ввода: 150 50
        Вывод: 3*/
        int distance, speed, time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние пути в километрах");
        distance = scanner.nextInt();
        System.out.println("Введите скорость в километрах");
        speed = scanner.nextInt();
        scanner.close();
        time = distance/speed;
        System.out.println("Время затраченное на путь " +time+ " ч");


    }
}
