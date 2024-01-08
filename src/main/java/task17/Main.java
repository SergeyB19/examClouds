package task17;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {5,2,9,1,5};
        System.out.println(sumArray(numbersArray));
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }
}
