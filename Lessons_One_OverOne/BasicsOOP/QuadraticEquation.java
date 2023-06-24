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
            System.out.printf("%s%n", "The equation has two roots. Find roots, use the method calculate.");
        }else {
            System.out.printf("%s%n","The equation has no roots, because discriminant < 0. Restart and enter new coefficients");
            System.exit(0);
        }
    }
    public void calculate (int discriminant){
        this.discriminant = discriminant;
        rootOne = (-b + Math.sqrt(discriminant)) / 2 * a;
        rootTwo = (-b - Math.sqrt(discriminant)) / 2 * a;
        System.out.printf("%s%f%n", "rootOne = ", rootOne);
        System.out.printf("%s%f", "rootTwo = ", rootTwo);

    }
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        int discriminant = quadraticEquation.decide(10, 9, 4);
        quadraticEquation.define(discriminant);
        quadraticEquation.calculate(discriminant);
    }
}
