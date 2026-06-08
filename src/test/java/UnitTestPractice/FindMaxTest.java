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

public class FindMaxTest {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 5, 7, 88}, 88, "Обычный массив"),
                Arguments.of(new int[]{1}, 1, "Массив с одним элеметом"),
                Arguments.of(new int[]{-1, -3, -2, -5, -7, -88}, -1, "Массив отрицательных чисел")
        );
    }

    @ParameterizedTest(name = "{2}:{0}, max = {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного нахождения максимального числа в массиве целых чисел")
    public void findMaxSuccessTest(int[] array, int expMax, String message) {
        assertEquals(expMax, findMax(array));
    }
    @Test
    @DisplayName("Проверка сценария с пустым массивом")
    public void emptyArrayTest(){
        assertThrows(NoSuchElementException.class,()->findMax(new int[]{}));
    }
    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest(){
        assertThrows(IllegalArgumentException.class,()->findMax(null));
    }
    /*
    тест падает с ошибкой
    Expected :class java.lang.IllegalArgumentException
    Actual   :class java.lang.NullPointerException
     */
}
