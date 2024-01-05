package task12;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    void print() {
        System.out.println(firstName);
    }

    @Override
    public double getScholarShip() {
        return averageMark == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов",
                "Group1",4.5);
        Aspirant aspirant1 = new Aspirant("Петр","Петров",
                "Group2",5,"Work1");
        Student aspirant2 = new Aspirant("Петр","Сидоров",
                "Group3",4.8,"Work2");

        Student[] students = {student,aspirant1,aspirant2};
        for (Student s : students) {
            System.out.println(s.getScholarShip());
        }

    }
}
