package homeW3;

public class PasswordVerifier {
    public void verifyPassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Пароль должен быть не менее 8 символов.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new Exception("Пароль должен содержать хотя бы одну цифру.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Пароль должен содержать хотя бы одну заглавную букву.");
        }
    }
}
