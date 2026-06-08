package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    //Напишите тесты для метода, который вычисляет факториал числа
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    @ParameterizedTest(name = "{0}->{1}")
    @DisplayName("Проверка успешного определения факториал числа")
    @CsvSource({
            "0,1",
            "1,1",
            "5,120",
            "7,5040",
    })
    public void factorialSuccessTest(int num, int expFactorial) {
        assertEquals(expFactorial, factorial(num));

    }

    @Test
    @DisplayName("Проверка сценария с отрицательным числом")
    public void negativeNumTest() {
        assertThrows(IllegalArgumentException.class, () -> factorial(-1));
    }

}
