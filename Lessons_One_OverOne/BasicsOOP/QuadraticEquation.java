package BasicsOOP;

public class QuadraticEquation {
    private int a, b, c, discriminant;

    public void decide( int a, int b, int c ){
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = b * b  - 4 * a * c;
        System.out.printf("%s%d", "discriminant = ", discriminant);
    }
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.decide(15, -2, -1);

    }
}
