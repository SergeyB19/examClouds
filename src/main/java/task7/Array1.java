package task7;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        double[] number = new double[4];
        number = new double[]{2.1, 3, 4,5.4,6};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
