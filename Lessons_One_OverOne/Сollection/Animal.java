package Сollection;

import java.util.LinkedList;
import java.util.List;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Animal> allAnimal = new LinkedList<>();

        Animal cat = new Animal("Cat");
        Animal elk = new Animal("Elk");
        Animal dog = new Animal("Dog");
        Animal elephant = new Animal("Elephant");


        allAnimal.add(cat);
        allAnimal.add(elk);
        allAnimal.add(dog);
        allAnimal.add(elephant);
        allAnimal.removeIf(a -> a.name.matches("(?i)[AEIOU][a-z]+"));
        for (Animal element : allAnimal) {
            System.out.println(element.name);

        }
    }
}

