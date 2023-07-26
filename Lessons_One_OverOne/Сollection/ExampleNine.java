package Сollection;
import java.util.Arrays;

public class ExampleNine {
    public void check(){
        int [] numbers = {-12, 2, 56, -76, 3, 9, 94, 0, -13, -6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println(Arrays.equals(numbers, numbersCopy));
        int [] numbersCopyTwo = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersCopyTwo));
        System.out.println(Arrays.equals(numbers, numbersCopyTwo));
    }
}
