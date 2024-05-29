package packages;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число число");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число");
        double c = scanner.nextDouble();
        double result = a > b ? b : c;
        System.out.println(result);
    }
}
