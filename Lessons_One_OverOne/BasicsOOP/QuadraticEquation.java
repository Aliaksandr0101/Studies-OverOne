package BasicsOOP;

public class QuadraticEquation {
    private int a, b, c, discriminant;
    private double rootOne, rootTwo;

    public int decide( int a, int b, int c ){
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = b * b  - 4 * a * c;
        return discriminant;
    }

    public void define( int discriminant ){
        this.discriminant = discriminant;
        if ( discriminant > 0 ) {
           calculate(discriminant);
        }else {
            System.out.printf("%s","The equation has no roots because discriminant < 0");
            System.exit(0);
        }
    }
    public void calculate (int discriminant){
        rootOne = (-b + Math.sqrt(discriminant)) / 2 * a;
        rootTwo = (-b - Math.sqrt(discriminant)) / 2 * a;
        System.out.printf("%s%f%n", "rootOne = ", rootOne);
        System.out.printf("%s%f", "rootTwo = ", rootTwo);

    }
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.define(quadraticEquation.decide(9, 7, 4));


    }
}
