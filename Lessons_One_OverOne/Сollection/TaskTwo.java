package Сollection;

import java.util.ArrayList;

public class TaskTwo {
    ArrayList<Integer> allNumbers = new ArrayList<>();
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    public void create(){
        for (int i = 0; i < 13; i++) {
            allNumbers.add((int) (Math.random()*34-17));
        }
    }
    public void sortOut(){
        for (int i = 0; i < allNumbers.size(); i++) {

            if (allNumbers.get(i) % 2 == 0) {
                evenNumbers.add(allNumbers.get(i));
            } else{
                oddNumbers.add(allNumbers.get(i));
            }
        }
        System.out.printf("%s", "elements even: ");
        for (Integer element: evenNumbers){
            System.out.printf("%s%d", " ", element);
        }
        System.out.printf("\n%s", "elements odd: ");
        for (Integer element: oddNumbers){
            System.out.printf("%s%d", " ", element);
        }
       String result = evenNumbers.size() > oddNumbers.size()
               ? "even list more"
               : "odd list more";
        System.out.printf("\n%s", result);
    }
    
}
