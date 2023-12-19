package task2;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double g = Double.NEGATIVE_INFINITY;
        double h = Double.POSITIVE_INFINITY;

        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(b == c);
        System.out.println(g * 0);
        System.out.println(h * 0);
    }
}