import javafx.scene.shape.Circle;
import Сollection.TaskTwo;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


                LinkedList<String> names = new LinkedList<>();
                names.add("Alice");
                names.add("Bob");
                names.add("Eve");
                names.add("Ivan");
                names.add("Olga");

                System.out.println("Список до удаления: " + names);

                Iterator<String> iterator = names.iterator();
                while (iterator.hasNext()) {
                    String name = iterator.next();
                    char firstLetter = Character.toLowerCase(name.charAt(0));
                    if (isVowel(firstLetter)) {
                        iterator.remove();
                    }
                }

                System.out.println("Список после удаления: " + names);
            }

            public static boolean isVowel(char letter) {
                letter = Character.toLowerCase(letter);
                return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
            }
        }





