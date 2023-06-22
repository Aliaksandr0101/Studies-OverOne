package BasicsOOP;

public class Student {
    private String name, username;
    private float [] gradesArray;
    private float gradePointAverage = 0, sumGrades = 0;

    public Student(String name, String username, float [] gradesArray) {
        this.name = name;
        this.username = username;
        this.gradesArray = gradesArray;
    }

    public void calculate(){
        for (float element : gradesArray) {
            sumGrades = sumGrades + element;
        }
        gradePointAverage = sumGrades / gradesArray.length;
        System.out.printf("Your GPA = %.1f", gradePointAverage);
    }

    public static void main(String[] args) {
        Student student = new Student("Sasha", "Komar", new float[] {5, 1, 5, 2, 5});
        student.calculate();
    }
}
