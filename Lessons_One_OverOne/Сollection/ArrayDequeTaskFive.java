package Сollection;
import java.util.*;

public class ArrayDequeTaskFive {
    public static void main(String[] args) {
        Deque<String> capital = new ArrayDeque<>();
        capital.addFirst("Tel-Aviv");
        capital.addLast("Nicosia");
        capital.addFirst("Rome");
        capital.addLast("Berlin");
        capital.addFirst("Sidney");
        capital.addLast("Kiev");
        capital.addFirst("Minsk");
        System.out.printf("%s%s%n", "Last element: ", capital.getLast());
        System.out.printf("%s%s%n", "First element: ", capital.getFirst());
        System.out.printf("%s%s", "length collection: ", capital.size());

    }
}
