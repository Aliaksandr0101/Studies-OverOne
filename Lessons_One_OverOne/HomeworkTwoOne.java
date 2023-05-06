import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkTwoOne {
    /*Даны три целых числа. Определите, сколько среди них совпадающих.
    Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадает) или 0 (если все числа различны).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo, numberThree;
        System.out.println("Введите первое целое число");
        numberOne = scanner.nextInt();
        System.out.println("Введите второе целое число");
        numberTwo = scanner.nextInt();
        System.out.println("Введите третье целое число");
        numberThree = scanner.nextInt();

        if(numberOne == numberTwo && numberOne == numberThree){
            System.out.println("Number of coincidences 3");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree){
            System.out.println("Number of coincidences 0");
        }else {
            System.out.println("Number of coincidences 2");
        }
//        Шахматная ладья ходит по горизонтали или вертикали. Даны две различные клетки шахматной доски, определите, может ли ладья попасть с
//        первой клетки на вторую одним ходом.
//        Формат входных данных
//        Программа получает на вход четыре числа от 1 до 8 каждое, задающие номер столбца и номер строки сначала для первой клетки, потом для второй клетки.
          int numberVerticalRook, numberHorizontalRook, numberVerticalEnemyFigure, numberHorizontalEnemyFigure;
        System.out.println("Введите координату ладьи по вертикали от 1 до 8");
        numberVerticalRook = scanner.nextInt();
        System.out.println("Введите координату ладьи по горизонтали от 1 до 8");
        numberHorizontalRook = scanner.nextInt();
        System.out.println("Ввведите координату фигуры противника по вертикали от 1 до 8");
        numberVerticalEnemyFigure = scanner.nextInt();
        System.out.println("Ввведите координату фигуры противника по горизонтали от 1 до 8");
        numberHorizontalEnemyFigure = scanner.nextInt();
        if(numberVerticalRook == numberVerticalEnemyFigure && numberHorizontalRook == numberHorizontalEnemyFigure) {
            System.out.println("Здесь уже находится ладья. Введите новые данные");
            System.out.println("Ввведите координату фигуры противника по вертикали от 1 до 8");
            numberVerticalEnemyFigure = scanner.nextInt();
            System.out.println("Ввведите координату фигуры противника по горизонтали от 1 до 8");
            numberHorizontalEnemyFigure = scanner.nextInt();
        }
        if (numberVerticalRook == numberVerticalEnemyFigure || numberHorizontalRook == numberHorizontalEnemyFigure) {
            System.out.println("Вы попадете за один шаг");
        } else {
            System.out.println("Вам нужно сделать два шага");
        }
        scanner.close();
    }

    }

