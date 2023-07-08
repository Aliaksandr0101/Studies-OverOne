package Сollection;
import java.util.LinkedList;
import java.util.List;

public class Animal {
    private String name;
    static List<Animal> allAnimal = new LinkedList<>();
    public Animal(String name) {
        this.name = name;
        allAnimal.add(this);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Cat");
        Animal elk = new Animal("Elk");
        Animal dog = new Animal("Dog");
        Animal elephant = new Animal("Elephant");

        allAnimal.removeIf(a -> a.name.matches("(?i)[AEIOU]\\w+"));
        for (Animal element : allAnimal) {
            System.out.println(element.name);

        }
    }
}

