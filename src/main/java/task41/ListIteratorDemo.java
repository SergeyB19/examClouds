package task41;


import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("A", "B", "C", "D");

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");

        }
    }
}