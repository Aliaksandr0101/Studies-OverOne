package PeculiaritiesOOP;

public class A {
    public interface Bird {
       default void takeOff(){
           System.out.println("I taking off");
       }
        default void sit(){
            System.out.println("I siting dawn");
        }
    }

    static class Finch implements Bird{
        @Override
        public void takeOff() {
            System.out.println("I am Finch and taking off");
        }

        @Override
        public void sit() {
            System.out.println("I am Finch and siting dawn");
        }
    }
    static class Martin implements Bird{
        @Override
        public void takeOff() {
            System.out.println("I am Martin and taking off");
        }

        @Override
        public void sit() {
            System.out.println("I am Martin and siting dawn");
        }
    }

    public static void main(String[] args) {
        Finch finch = new Finch();
        finch.takeOff();
        finch.sit();
        Martin martin = new Martin();
        martin.takeOff();
        martin.sit();

    }
}
