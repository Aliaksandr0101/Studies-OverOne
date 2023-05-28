package JavaCoreIntroduction;

import java.util.Scanner;

public class HomeworkTwoThree {
    public void check(){
        /*На вход подаются три числа: x, y, z. Определите, могут ли эти числа быть длинами сторон прямоугольного треугольника.
        Пример ввода: 3, 4, 5.
        Пример ввода: 1, 2, 3.
        Пример вывода: может быть.
        Пример вывода: не может быть.*/
        int sideTriangleOne, sideTriangleTwo, sideTriangleThree, sumLeg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону(катет) треугольника");
        sideTriangleOne = scanner.nextInt();
        if (sideTriangleOne == 0)
            System.out.println("Вы ввели ноль. Сторона должна быть сторого больше нуля, введите новое число");
            sideTriangleOne = scanner.nextInt();
        System.out.println("Введите ввторую сторону(катет) треугольника");
        sideTriangleTwo = scanner.nextInt();
        if (sideTriangleTwo == 0)
            System.out.println("Вы ввели ноль. Сторона должна быть сторого больше нуля, введите новое число");
            sideTriangleTwo = scanner.nextInt();
        System.out.println("Введите третью сторону(гипотенуза) треугольника");
        sideTriangleThree = scanner.nextInt();
        if (sideTriangleThree == 0)
            System.out.println("Вы ввели ноль. Сторона должна быть сторого больше нуля, введите новое число");
            sideTriangleThree = scanner.nextInt();
        scanner.close();
        sumLeg = sideTriangleTwo * sideTriangleTwo + sideTriangleOne * sideTriangleOne ;


        if (sideTriangleThree*sideTriangleThree == sumLeg) {
            System.out.println("Такой треугольник может быть");
        } else
            System.out.println("Такого треугольника не может быть");
    }
}
