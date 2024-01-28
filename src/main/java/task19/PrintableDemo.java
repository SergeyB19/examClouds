package task19;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("name1");
        Book book2 = new Book("name2");

        Magazine magazine1 = new Magazine("magazine1");
        Magazine magazine2 = new Magazine("magazine2");

        Printable newsPaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Print newsPaper");
            }
        };

        Printable[] printables = {book1,book2,magazine1,magazine2, newsPaper};
        for (Printable printable : printables) {
            printable.print();
        }

        Magazine.printMagazines(printables);
    }
}
