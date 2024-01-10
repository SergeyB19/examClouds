package task21;

public class WrapperDemo {
    public static void main(String[] args) {
        Byte byte1 = new Byte((byte)3);
        Byte byte2 = new Byte("7");
        Byte byte3 = Byte.valueOf((byte) 4);
        Byte byte4 = Byte.valueOf("78");

        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(byte3);
        System.out.println(byte4);
    }
}
