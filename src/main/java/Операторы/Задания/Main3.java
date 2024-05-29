package Операторы.Задания;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("Понедельник");
            }
            case 2 -> {
                System.out.println("Вторник");
            }
        }
    }
}
