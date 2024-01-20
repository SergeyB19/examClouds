package task22;

import org.jetbrains.annotations.NotNull;

public class Dog implements Comparable<Dog> {
    String nickName;
    String poroda;
    private Collar collar;

    public Dog(String nickName, String poroda, String color, double razmerCollar) {
        this.nickName = nickName;
        this.poroda = poroda;
        this.collar = new Collar(color, razmerCollar);

    }

    @Override
    public int compareTo(@NotNull Dog o) {
        int a = (int) (o.collar.getRazmerCollar() - o.collar.getRazmerCollar());
        if (a - a == 1) {
            System.out.println("Первая собака больше");
        } else if (a - a == -1) {
            System.out.println("Вторая собака больше");
        } else {
            System.out.println("Собаки одинакового размера");
        }
        return (int) a;
    }


    private class Collar {
        String color;
        double razmerCollar;

        public Collar(String color, double razmerCollar) {
            this.color = color;
            this.razmerCollar = razmerCollar;
        }

        public double getRazmerCollar() {
            return razmerCollar;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Жучка", "болонка", "красный", 40);
        Dog dog2 = new Dog("Мухтар", "овчарка", "черный", 70.5);
        dog2.compareTo(dog1);
    }
}
