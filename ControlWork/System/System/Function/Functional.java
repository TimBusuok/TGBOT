package System.Function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void read(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Тимофей\\Desktop\\ControlWork\\System\\animals"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                break;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}