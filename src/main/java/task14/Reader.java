package task14;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String number;

    public Reader() {
    }

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String number) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public void takeBook(int book) {
        System.out.println(getFullName() + " взял " + book + " книги");
    }

    public void takeBook(String...bookName) {
        System.out.println(getFullName() + " взял книги " + Arrays.toString(bookName));
    }

    public void takeBook(Book...books) {
        System.out.println(getFullName() + " взял книги " + Arrays.toString(books));
    }

    public void returnBook(Book...books) {
        System.out.println(getFullName() + " вернул книги " + books);
    }

}

class ReaderTest {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения", "Remark");
        Book book2 = new Book("Словарь", "Remark");
        Book book3 = new Book("Энциклопедия", "Remark");
        Scanner scanner = new Scanner(System.in);
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Lu-Kang",1,"A","1801","8-999-000-11-37");
        readers[1] = new Reader("Scorpion",2,"B","1802","8-999-001-11-36");
        readers[2] = new Reader("Lu-Kang",3,"C","1803","8-999-023-12-45");
        for (int i = 0; i < readers.length; i++) {
            System.out.println(readers[i]);
        }
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь" ,"Энциклопедия");




    }

}
