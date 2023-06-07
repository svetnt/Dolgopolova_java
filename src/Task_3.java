import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputNumbers = new ArrayList<>();
        while (scanner.hasNext()) {
            inputNumbers.add(scanner.nextInt());
        }
        Integer[] arrayNumbers = inputNumbers.toArray(new Integer[0]);
        multipleOfThree(arrayNumbers);
    }

    static void multipleOfThree(Integer[] arrayNumbers) {
        Arrays.stream(arrayNumbers)
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);
    }
}
