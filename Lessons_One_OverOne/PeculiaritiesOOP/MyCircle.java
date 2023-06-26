package PeculiaritiesOOP;

public class MyCircle {
    public static final double PI = 3.14;
    private double radius, area, length;

    public MyCircle( double radius ) {
        this.radius = radius;
    }
    public void calculate( MyCircle myCircle ){
        area = PI * radius * radius;
        length = 2 * PI * radius;
        System.out.printf( "%s%.4f%n%s%.4f%n", "Circle area = ", area, "Circle length = ", length );
    }

    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(2.4);
        myCircle.calculate( myCircle );
    }
}
