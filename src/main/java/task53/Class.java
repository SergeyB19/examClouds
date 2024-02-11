package task53;

public class Class implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                Thread.sleep(100);
                System.out.println(i);
            }
        }
    }
}
