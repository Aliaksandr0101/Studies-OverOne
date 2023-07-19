package Сollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ExampleSix {
    public void check(){
        ArrayList<String> rivers = new ArrayList<>();
        String riverOne = "Pripyat";
        String riverTwo = "Amazon";
        String riverThree = "Nil";
        String riverFour = "Yangtze";
        String riverFive = "Elena";
        String riverSix = "Yenisei";
        String riverSeven = "Ob";
        String riverEight = "Huanghe";
        String riverNine = "Mississippi";
        rivers.add(riverOne);
        rivers.add(riverTwo);
        rivers.add(riverThree);
        rivers.add(riverFour);
        rivers.add(riverFive);
        rivers.add(riverSix);
        rivers.add(riverSeven);
        rivers.add(riverEight);
        rivers.add(riverNine);
        ListIterator<String> reverseIterator = rivers.listIterator(rivers.size());
        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
            reverseIterator.remove();
        }
        System.out.println(rivers.isEmpty());
    }
}
