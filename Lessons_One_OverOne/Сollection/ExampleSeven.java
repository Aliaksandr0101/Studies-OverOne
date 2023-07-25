package Сollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleSeven {
    public void check(){

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", "Brown"));
        animals.add(new Animal("Dog", "Black"));
        animals.add(new Animal("Dog", "White"));
        animals.add(new Animal("Elephant", "Grey"));
        animals.add(new Animal("Snake", "Orange"));
        animals.add(new Animal("Zebra", "White-black"));
        animals.add(new Animal("Cat", "Brown"));
        animals.add(new Animal("Cat", "Orange"));
        Collections.sort(animals, new ComparatorAnimal());
        System.out.println(animals.toString());
    }
    public class Animal{
        private  String name;
        private  String color;

        public Animal(String name, String color) {
            this.name = name;
            this.color = color;
        }
        public String getName() {
            return name;
        }
        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Animal {" +
                    "name = " + name + ", "+
                    "colour = " + color +
                    "}";
        }
    }
    public class ComparatorAnimal implements Comparator<Animal>{

        @Override
        public int compare(Animal animalOne, Animal animalTwo) {
           int nameCompare = animalOne.getName().compareTo(animalTwo.getName());
           if (nameCompare != 0){
               return nameCompare;
           } else
            return animalOne.getColor().compareTo(animalTwo.getColor());

        }
    }
}
