import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                number = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка! Введите дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }

        return number;
    }
}