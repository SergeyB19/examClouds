package task37;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,String> function = integer -> {
            String result = "Ноль";
            if (integer > 0) {
                result = "Положительнок число";
            } else if (integer < 0) {
                result = "Отрицательное число";
            }
            return result;
        };

        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));

    }
}
