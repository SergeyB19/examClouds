package Операторы.Задания;

import java.util.Scanner;

public class Girlyanda {

    static void blink(int g) {
        for (int i = 0; i < 10; i++) {
            g = ~g;
        }
        System.out.println(Integer.toBinaryString(g));
    }

   static void run(int g) {
       for (int i = 0; i < 10; i++) {
           g = g;
       }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> {
                blink(32);
            }
            case 2 -> {
                blink(1);
            }
            case 3 -> {
                run(3);
            }
            case 4 -> {
                blink(32);
            }
        }
        int g = 32;
        System.out.println(Integer.toBinaryString(32));
        blink(32);
    }
}
