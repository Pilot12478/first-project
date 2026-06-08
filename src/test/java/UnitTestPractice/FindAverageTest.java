package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0, "Обычный массив"),
                Arguments.of(new int[]{10}, 10.0, "Массив с одним элеметом")
        );
    }

    @ParameterizedTest(name = "{2}:{0}, avr = {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного нахождения среднего числа в массиве целых чисел")
    public void findAvrSuccessTest(int[] array, double expAvr, String message) {
        assertEquals(expAvr, findAverage(array));
    }

    @Test
    @DisplayName("Проверка сценария с пустым массивом")
    public void emptyArrayScenarioTest() {
        assertThrows(NoSuchElementException.class, () -> findAverage(new int[]{}));
    }

}