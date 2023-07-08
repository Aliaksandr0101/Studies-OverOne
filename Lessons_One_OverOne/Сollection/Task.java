package Сollection;
import java.util.PriorityQueue;

public class Task {
    public static void main(String[] args) {
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>(100);
        double numberAverage;
        int sumSizeElement = 0;
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 200 - 100);
            numberQueue.add(number);
        }
        System.out.printf("%s%s", "numberQueue:", " ");
        for (int element : numberQueue) {
            System.out.printf("%d%s", element, " ");
            String sizeElement = Integer.toString(element);
            if(sizeElement.startsWith("-")) {
                sizeElement = sizeElement.substring(1);
                sumSizeElement += sizeElement.length();
            } else {
                sumSizeElement += sizeElement.length();
            }
        }

        System.out.printf("%n%s%s%d", "length of all numbers =", " ", sumSizeElement);
        numberAverage = ((double) sumSizeElement) / numberQueue.size();
        System.out.printf("%n%s%.2f", "numberAverage = ", numberAverage);

  }

}
