package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmail {
    //Напишите тесты для метода, который проверяет, является ли строка валидным email:
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
    @ParameterizedTest(name = "{0}->true")
    @DisplayName("Проверка успешного получения true, при передаче корректной почты")
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    public void checkTrueTest(String email){
        assertTrue(isValidEmail(email));
    }
    @ParameterizedTest(name = "{0}->false")
    @DisplayName("Проверка успешного получения false, при передаче некорректной почты")
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain",""})
    public void checkFalseTest(String email){
        assertFalse(isValidEmail(email));
    }
    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest(){
        assertFalse(isValidEmail(null));
    }
}
