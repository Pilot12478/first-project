package complexTask2;

import java.util.regex.Pattern;

public class UserValidator {
    private boolean validationEnabled;

    public UserValidator() {
        validationEnabled = true;
    }

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    private void checkName(String name) {
        if (name == null || name.isEmpty() || !Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя пользователя некорретно");

        }
    }

    private void checkAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст пользователя некорректный");
        }
    }

    private void checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@(?!.*\\.\\.)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (!pattern.matcher(email).matches()) {
            throw new InvalidUserException("Email пользователя некорректный");
        }
    }

    public void validateUserProperties(User user) {
        if (validationEnabled) {
            checkName(user.getName());
            checkAge(user.getAge());
            checkEmail(user.getEmail());
        }
    }
}
