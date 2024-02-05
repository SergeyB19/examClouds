package task44;

public class Homework {
    public static void Check(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            try {
                throw new WrongLoginException("Длина логина больше 20 символов");
            } catch (WrongLoginException e) {
                throw new RuntimeException(e);
            }
        } else if (password.length() > 20 || password.length()!=confirmPassword.length()) {
            try {
                throw new WrongPasswordException("Длина пароля больше 20 символов");
            } catch (WrongPasswordException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Check("12341819120","12331233123312331233123312331233123312331233","1233");
    }
}
