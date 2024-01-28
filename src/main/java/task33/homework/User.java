package task33.homework;

public class User {
    public User() {
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    private String name;

    private String login;
    private String password;

    class Query {
        void printToLog() {
            System.out.println(name + " with " + login + " and " + password + " send Query");
        }
    }

    void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("name","login", "password");
        user.createQuery();
        Query query = user.new Query();
        query.printToLog();
        Query query1 = new User().new Query();
        query1.printToLog();


    }

}
