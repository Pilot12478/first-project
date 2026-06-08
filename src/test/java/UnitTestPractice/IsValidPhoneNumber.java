package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumber {
    /*
    Напишите тесты для метода, который проверяет валидность телефонного номера:
     */
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

    @ParameterizedTest(name = "{0}->true")
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    @DisplayName("Проверка успешного получения true, при передаче валидного номера телефона")
    public void shouldBeTrueTest(String phoneNumber) {
        assertTrue(isValidPhoneNumber(phoneNumber));

    }

    @ParameterizedTest(name = "{0}->false")
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", ""})
    @DisplayName("Проверка успешного получения false, при передаче невалидного номера телефона")
    public void shouldBeFalseTest(String phoneNumber) {
        assertFalse(isValidPhoneNumber(phoneNumber));

    }

    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest() {
        assertThrows(IllegalArgumentException.class, () -> isValidPhoneNumber(null));
    }
    /*
    org.opentest4j.AssertionFailedError: Unexpected exception type thrown,
Expected :class java.lang.IllegalArgumentException
Actual   :class java.lang.NullPointerException
     */
}
