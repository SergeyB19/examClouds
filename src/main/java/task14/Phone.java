package task14;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;
    static int count;

    public void receiveCall(String nameCall) {
        System.out.println("Звонит " + nameCall);
    }

    public void receiveCall(String nameCall, String number) {
        System.out.println("Звонит " + nameCall + " телефон " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Будут отправлены сообщение на номерa: " + Arrays.toString(numbers));
    }

    public Phone() {
        count++;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        count++;


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    static int getCount() {
        return count;
    }
}

class PhoneTest {
    public static void main(String[] args) {


        Phone phone1 = new Phone("8-888-888-88-88", "Samsung", 50.3);
        Phone phone2 = new Phone("9-999-999-99-99", "Sony", 24.2);
        Phone phone3 = new Phone("7-777-777-77-77", "Nokia", 515.2);
        System.out.println("Первый телефон: " + phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println("Второй телефон: " + phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println("Третий телефон: " + phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());
        phone1.receiveCall("Jax");
        phone2.receiveCall("Sector");
        phone3.receiveCall("Sub_Zero");

        phone1.receiveCall("Jax", "8-888-888-88-88");
        phone2.receiveCall("Sector", "9-999-999-99-99");
        phone3.receiveCall("Sub_Zero", "7-777-777-77-77");

        phone1.sendMessage("8-888-888-88-88", "9-999-999-99-99", "7-777-777-77-77");

        System.out.println(Phone.getCount());
    }
}
