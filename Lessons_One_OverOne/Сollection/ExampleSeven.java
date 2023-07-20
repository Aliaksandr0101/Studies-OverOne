package Сollection;
import java.util.ArrayList;
import java.util.Collections;

public class ExampleSeven {
    public void check(){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Elephant"));
        animals.add(new Animal("Snake"));
        animals.add(new Animal("Zebra"));
        animals.add(new Animal("Lion"));
        Collections.sort(animals);
    }
    public class Animal implements Comparable<Animal>{
        private  String name;
        public Animal(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Animal animal) {
            return this.name.compareTo(animal.getName());
        }
    }
}
