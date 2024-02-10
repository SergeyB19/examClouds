package task51;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Важная работа выполняется в потоке " + getName());
    }
}