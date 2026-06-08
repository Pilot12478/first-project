package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPasswordTest {
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }

    @Test
    @DisplayName("Проверка успешного получения true при передаче валидного пароля")
    public void shouldBeTrueTest() {
        String validPass = "Password1";
        assertTrue(isValidPassword(validPass));
    }

    @Test
    @DisplayName("Проверка успешного получения true при передаче валидного пароля")
    public void shouldBeFalseTest() {
        String inValidPass = "pass";
        assertFalse(isValidPassword(inValidPass));
    }

    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest() {
        assertFalse(isValidPassword(null));
    }
}
