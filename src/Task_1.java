import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        try {
            double inputNumber = new Scanner(System.in).nextDouble();
            if (inputNumber > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Ввод некорректен. Необходимо ввести число в десятичной системе исчисления");
        }
    }
}
