package Сollection;

import java.util.*;

public class ExampleFour {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList();
        HeavyBox boxOne = new HeavyBox("first", 3);
        HeavyBox boxTwo = new HeavyBox("second", 7);
        HeavyBox boxThree = new HeavyBox("third", 23);
        HeavyBox boxFour = new HeavyBox("fourth", 13);
        heavyBoxes.add(boxOne);
        heavyBoxes.add(boxTwo);
        heavyBoxes.add(boxThree);
        heavyBoxes.add(boxFour);
        for (HeavyBox element : heavyBoxes) {
            System.out.println(element.toString());
        }
        boxOne = new HeavyBox("first", 1);
        heavyBoxes.set(0, boxOne);
        heavyBoxes.remove(3);

        HeavyBox[] heavyBoxesOne = new HeavyBox[heavyBoxes.size()];
        for (int i = 0; i < heavyBoxes.size(); i++) {
            heavyBoxesOne[i] = heavyBoxes.get(i);
        }
        for (HeavyBox element : heavyBoxesOne) {
            System.out.println(element.toString());
        }

        HeavyBox[] heavyBoxesTwo = heavyBoxes.toArray(new HeavyBox[0]);
        for (HeavyBox element : heavyBoxesTwo) {
            System.out.println(element.toString());
        }

        HeavyBox[] heavyBoxesThree = heavyBoxes.stream().toArray(HeavyBox[]::new);
        for (HeavyBox element : heavyBoxesThree) {
            System.out.println(element.toString());
        }

        Iterator<HeavyBox> iterator = heavyBoxes.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\npls enter numbers separated by commas and spaces and press the button Enter");
        String stringEnter = scanner.nextLine();
        scanner.close();
        StringTokenizer tokenizer = new StringTokenizer(stringEnter, ", ");
        HashSet<Integer> numbers = new HashSet<>();
        while (tokenizer.hasMoreTokens()) {
            String numberElement = tokenizer.nextToken();
            int number = Integer.parseInt(numberElement);
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}

    class HeavyBox {
        String numberBox;
        int weightBox;

        public HeavyBox(String numberBox, int weightBox) {
            this.numberBox = numberBox;
            this.weightBox = weightBox;
        }

        @Override
        public String toString() {
            return "HeavyBox{" +
                    "numberBox = " + numberBox + ',' +
                    " " +
                    "weightBox = " + weightBox +
                    '}' +
                    ';';
        }

    }

