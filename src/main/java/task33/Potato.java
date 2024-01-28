package task33;

public class Potato {
    public void peel() {
        System.out.println("Чистим картошку.");
    }
}

class Food {
    public static void main(String[] args) {
        Potato potato = new Potato() {
            @Override
            public void peel() {
                System.out.println("Чистим картошку в анонимном классе.");
            }
        };
        potato.peel();
    }
}
