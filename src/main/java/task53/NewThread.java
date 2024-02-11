package task53;

public class NewThread extends Thread{
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        NewThread newThread = new NewThread();
        newThread.run();
    }
}
