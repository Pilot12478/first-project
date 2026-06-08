package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Напишите тесты для метода, который определяет, является ли число чётным
public class IsEvenTest {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(6, "Положительное четное число"),
                Arguments.of(-4, "Отрицательное четное число"),
                Arguments.of(0, "Специальное четное число")
        );
    }

    @ParameterizedTest(name = "{1}:{0}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного получения true для четных чисел")
    public void returnTrueTestForEvenNumbers(int evenNum, String message) {
        assertTrue(isEven(evenNum));

    }

    @ParameterizedTest(name = "{1}:{0}")
    @CsvSource({
            "-3, Отрицательное нечетное число",
            "3, Положительное нечетное число"
    })
    @DisplayName("Проверка успешного получения false для нечетных чисел")

    public void returnFalseTestForOddNumbers(int oddNum, String message) {
        assertFalse(isEven(oddNum));
    }


}
