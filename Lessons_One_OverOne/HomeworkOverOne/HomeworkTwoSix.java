package HomeworkOverOne;

import java.util.Scanner;

import  java.util.Scanner;
public class HomeworkTwoSix {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        int timeHourNow, timeMinuteNow, timeHourJob, timeMinuteJob, convertertimeNow, convecterTimeJob;
        String timeMinuteWayOne, timeMinuteWayTwo;
        System.out.println("Введите 6 чисел. Первые два текущее время, Вторые две - время на которое нужно успеть добраться на работу и последние три время вашего пути в минутах ");
        timeHourNow = scanner.nextInt();
        timeMinuteNow = scanner.nextInt();
        timeHourJob = scanner.nextInt();
        timeMinuteJob = scanner.nextInt();
        timeMinuteWayOne = scanner.next();
        timeMinuteWayTwo = scanner.nextLine();
        String sum = timeMinuteWayOne + timeMinuteWayTwo;
        int timeMinuteWay = Integer.parseInt(sum.replace(" ", ""));
        scanner.close();
        convertertimeNow = timeMinuteNow + timeHourNow * 60;
        convecterTimeJob = timeMinuteJob + timeHourJob * 60;
        /*convecterTimeWay = timeMinuteWay + timeHourWay * 60;*/
        int substraction = Math.abs(convecterTimeJob - convertertimeNow);
        if (timeMinuteWay <= substraction)
            System.out.println("Успеете на работу");
        else System.out.println("Не успеете");
    }
}
