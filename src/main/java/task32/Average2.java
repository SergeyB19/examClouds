package task32;

public class Average2<T extends Number> {
    private T[] array;

    public Average2(T[] array) {
        this.array = array.clone();
    }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }

        return sum / array.length;
    }

    boolean sameAvg(Average2<?> ob) {
        return average() == ob.average();
    }
}

class AverageDemo2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average2<Integer> iob = new Average2<>(intArray);
        System.out.println("Среднее значения для Integer " + iob.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average2<Double> dob = new Average2<>(doubleArray);
        System.out.println("Среднее значения для Double " + dob.average());

        Float[] floatArray = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Average2<Float> fob = new Average2<>(floatArray);
        System.out.println("Среднее значения для Float " + fob.average());

        System.out.print("Средние значения для iob и dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }

        System.out.print("Средние значения для iob и fob ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }
    }
}