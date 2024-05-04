import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выбирите действия: \n1 - Список всех животных\n2 - Завести новое животное\n3 - Изменить данные о животном\n4 - Что умеет животное\n5 - Дрессировка\n6 - Удалить запись\n0 - Выход");
            int n = scanner.nextInt();
            switch (n) {
                case (1):
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Тимофей\\Desktop\\ControlWork\\System\\animals"));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
                    }
                    break;

                case (0):
                    System.out.println("досвидание");
                    return;
                    
                default:
                    System.out.println("2");
            }
        }
    }
}
