package task5;

import java.util.Scanner;

public class SystemInDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
