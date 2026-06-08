package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest {
    //Напишите тесты для метода, который находит второе по величине число:
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    @Test
    @DisplayName("Проверка успешного определения второго по величине числа в массиве")
    public void findSecondMaxSuccessTest() {
        int[] array = new int[]{1, 2, 4, 6, 7, 8, 33};
        int expSecondMaxNum = 8;
        assertEquals(expSecondMaxNum, findSecondMax(array));
    }

    @Test
    @DisplayName("Проверка сценария с массивом одинаковых чисел")
    public void identicalNumbersInArrayTest() {
        int[] array = new int[]{5, 5, 5, 5, 5};
        assertThrows(NoSuchElementException.class, () -> findSecondMax(array));

    }

    @Test
    @DisplayName("Проверка сценария с одним элементом в массиве")
    public void onlyOneNumberInArrayTest() {
        int[] array = new int[]{5};
        assertThrows(NoSuchElementException.class, () -> findSecondMax(array));

    }

    /*
    org.opentest4j.AssertionFailedError: Unexpected exception type thrown,
Expected :class java.util.NoSuchElementException
Actual   :class java.lang.IllegalArgumentException
     */
    @Test
    @DisplayName("Проверка сценария с пустым массивом")
    public void emptyArrayTest() {
        int[] array = new int[]{};
        assertThrows(NoSuchElementException.class, () -> findSecondMax(array));

    }
        /*
    org.opentest4j.AssertionFailedError: Unexpected exception type thrown,
Expected :class java.util.NoSuchElementException
Actual   :class java.lang.IllegalArgumentException
     */
}
