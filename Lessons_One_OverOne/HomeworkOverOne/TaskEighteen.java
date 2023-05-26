package HomeworkOverOne;

public class TaskEighteen {
    public void check(){
        int numberOne, numberTwo, numberThree, numberFour;
        for (int i = 999; i < 10000; i++) {
            numberOne = i % 10;
            numberTwo = (i / 10) % 10;
            numberThree = (i / 100) % 10;
            numberFour = i / 1000;
            if (numberOne*numberTwo*numberThree*numberFour == numberOne+numberTwo+numberThree+numberFour)
                System.out.println("it is number = " + i);
        }

    }
}
