import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String inputName = new Scanner(System.in).nextLine();
        System.out.println(inputName.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }
}
