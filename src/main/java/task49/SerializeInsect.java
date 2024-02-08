package task49;

import java.io.*;

public class SerializeInsect {
    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Bug bug = new Bug("Майский жук", true);
        System.out.println("До сериализации " + bug);
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(bug);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bug = (Bug) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("После сериализации " + bug);
    }
}