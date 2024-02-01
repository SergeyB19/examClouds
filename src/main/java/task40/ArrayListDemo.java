package task40;

import task14.Phone;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("0671111","iphone",45));
        phones.add(new Phone("0672222","nokia",56));
        phones.add(new Phone("067333","samsung",2));

        System.out.println(phones);

        for (Phone phone : phones) {
            System.out.println("phone.getNumber() = " + phone.getNumber());
        }
        phones.forEach(p-> System.out.println(p.getModel()));
    }
}
