package Сollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ExampleFive {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < 14; i = i + 2 ){
            int number = randomNumber.nextInt(30) - 15;
            arrayListNumbers.add(number);
        }
        System.out.println(arrayListNumbers.toString());
        Iterator<Integer> iterator = arrayListNumbers.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 == 0) {
                System.out.printf("%3d%n", element);
            } else {
                iterator.remove();
            }
        }
    }
}
