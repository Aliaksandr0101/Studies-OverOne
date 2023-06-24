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

    public String define( int discriminant ){
        this.discriminant = discriminant;
        String result = discriminant > 0
                ? "The equation has two roots. Find roots, use the method calculate."
                : "The equation has no roots, because discriminant < 0. Restart and enter new coefficients";
        return result;
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
        int discriminant = quadraticEquation.decide(1, 9, 4);
        System.out.println(quadraticEquation.define(discriminant));
        quadraticEquation.calculate(discriminant);
    }
}
