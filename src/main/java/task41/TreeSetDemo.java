package task41;

import task14.Phone;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<Phone> phones = new TreeSet<>();
        phones.add(new Phone("0671111", "iphone", 45.5));
        phones.add(new Phone("0672222", "nokia", 45.7));
        phones.add(new Phone("067333", "samsung", 2));

        phones.forEach(System.out::println);

    }
}
