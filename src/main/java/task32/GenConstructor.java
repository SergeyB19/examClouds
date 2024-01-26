package task32;

public class GenConstructor {
    private double value;

    public <T extends Number> GenConstructor(T arg) {
        value = arg.doubleValue();
    }

    public void showValue() {
        System.out.println("value: " + value);
    }
}

class GenConstructorDemo {
    public static void main(String[] args) {
        GenConstructor genConstructor1 = new GenConstructor(100);
        GenConstructor genConstructor2 = new GenConstructor(123.5F);

        genConstructor1.showValue();
        genConstructor2.showValue();
    }
}
