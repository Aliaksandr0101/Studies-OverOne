import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        String taskText1 = "Пусть на ввод с клавиатуры дается буква П, нужно с помощью арифметической операции вывести букву \"Я\". (Используйте таблицу Unicode)";
        System.out.println(taskText1);
        char characterFirst = 'П';
        characterFirst += 16;
        System.out.println("Резултат " + characterFirst);


        Scanner Scanner = new Scanner(System.in);
        double distanceKm;
        double timeMinute;
        String taskText2 = "Путешественник задумал путешествие на автомобиле. На ввод подается время в минутах, за которое он должен проехать дистанцию, и сама дистанция в километрах. Требуется найти необходимую скорость в км/ч.";
        System.out.println(taskText2);
        System.out.println("Введите дистанцию в километрах");
        distanceKm = Scanner.nextInt();
        System.out.println("Введите время в минутах");
        timeMinute = Scanner.nextInt();
        double resultSpeed = distanceKm/(timeMinute/60);
        System.out.println("Нужная скорость автомобиля " + resultSpeed + " :Xкм/ч");





    }
}
