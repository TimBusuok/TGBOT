package View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {
    // private Double firstDouble;
    // private Double seconDouble;

    // public UI(Double x, Double y) {
    //     this.firstDouble = x;
    //     this.seconDouble = y;
    // }

    Scanner in = new Scanner(System.in, "cp866");

    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    // public Function<String, Integer> inputInt = msg -> {
    //     System.out.println(msg);
    //     return in.nextInt();
    // };

    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Summarize");
        System.out.println("\t2. Subtraction");
        System.out.println("\t3. Multiplication");
        System.out.println("\t4. Division");
        return in.nextInt();
    }
}
