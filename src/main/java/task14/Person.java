package task14;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(getFullName() + " говорит");
    }
    public void talk() {
        System.out.println(getFullName() + " говорит");
    }

}

class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Kung-Lao", 25);
        person.talk();
        person1.move();
    }
}
