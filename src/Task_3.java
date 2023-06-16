import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите массив целых чисел. Для завершения ввода нажмите CMD+D");
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputNumbers = new ArrayList<>();
        try {
            while (scanner.hasNext()) {
                inputNumbers.add(scanner.nextInt());
            }
        } catch (InputMismatchException ex) {
            System.out.println("Ввод некорректен. Необходимо ввести целое число");
            return;
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
