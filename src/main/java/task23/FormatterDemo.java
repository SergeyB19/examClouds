package task23;

import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        print("Иванов",5,"Математика");
        print("Петрова",5,"Физика");

    }

    private static void print(String fullName, int mark, String subject) {
//        Formatter formatter = new Formatter();
        System.out.printf("Студент %-15s получил %-3s по %-10s.\n",fullName,mark,subject);
        System.out.format("Студент %-15s получил %-3s по %-10s.\n",fullName,mark,subject);
//        System.out.println(formatter);
    }

}
