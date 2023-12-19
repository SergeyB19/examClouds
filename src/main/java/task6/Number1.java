package task6;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 10) {
            System.out.println("Положительное число меньше 10 или ноль");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }

    }
}

