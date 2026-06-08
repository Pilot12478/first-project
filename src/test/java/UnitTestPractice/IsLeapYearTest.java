package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {
    //Напишите тесты для метода, который определяет, является ли год високосным
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @ParameterizedTest
    @DisplayName("Проверка успешного получения true")
    @ValueSource(ints = {2020, 2000, 1600, 0, 4, 400})
    public void shouldBeTrueTest(int year) {
        assertTrue(isLeapYear(year));
    }

    @ParameterizedTest
    @DisplayName("Проверка успешного получения false")
    @ValueSource(ints = {2021, 1900, 2100})
    public void shouldBeFalseTest(int year) {
        assertFalse(isLeapYear(year));
    }
}
