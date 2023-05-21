import java.util.Scanner;

public class HomeworkTwoFour {
    public  void check(){
        /*Условие задачи
        На вход подаётся 6 чисел. Первые два - это количество минут и часов текущего времени. Вторые два - время к которому вам нужно успеть на работу.
        Третья двойка - время в минутах за которое нужно добраться до работы. Нужно узнать, успеете ли вы к нужному времени на работу.
                Пример ввода: 8 0 9 0 1 20 Пример ввода: 8 25 9 10 1 10
        Вывод: Не успеете Вывод: Не успеете*/
        Scanner scanner = new Scanner(System.in);
        int timeHourNow, timeMinuteNow, timeHourJob, timeMinuteJob, timeHourWay, timeMinuteWay, convecterTimeWay, convertertimeNow, convecterTimeJob;
        System.out.println("Введите 6 чисел. Первые два текущее время, Вторые две - время на которое нужно успеть добраться на работу и последние две время вашего пути в минутах ");
        timeHourNow = scanner.nextInt();
        timeMinuteNow = scanner.nextInt();
        timeHourJob = scanner.nextInt();
        timeMinuteJob = scanner.nextInt();
        timeHourWay = scanner.nextInt();
        timeMinuteWay = scanner.nextInt();
        scanner.close();
        convertertimeNow = timeMinuteNow + timeHourNow * 60;
        convecterTimeJob = timeMinuteJob + timeHourJob * 60;
        convecterTimeWay = timeMinuteWay + timeHourWay * 60;
        int substraction = Math.abs(convecterTimeJob - convertertimeNow);
        if (convecterTimeWay <= substraction)
            System.out.println("Успеете на работу");
        else System.out.println("Не успеете");




    }
}
