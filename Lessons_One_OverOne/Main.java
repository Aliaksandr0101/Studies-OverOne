import Phone.Work;

public class Main {
    public static void main(String[] args) {
     Work workOne = new Work(3.14);
     Work workTwo = new Work(3.12);
     workOne.sum(workTwo, workOne);
        System.out.println(workOne.compare(workTwo,workTwo));
        workOne.subtraction(workTwo);
        workTwo.multiplication(workOne);


    }
}

