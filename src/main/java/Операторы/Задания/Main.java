package Операторы.Задания;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        if (a % 2 != 0) {
            System.out.println(a);
        }

    }
}
