package task6;

import java.util.Scanner;

public class Number extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        } else System.out.println("ошибка");
    }
}

