package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 5, 7, 88}, "Массив без дубликатов"),
                Arguments.of(new int[]{}, "Пустой массив")
        );
    }

    @ParameterizedTest(name = "{1}:{0}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного получения false при отсутствии дубликатов")
    public void shouldBeFalseTest(int[] array, String message) {
        assertFalse(hasDuplicates(array));

    }

    @Test
    @DisplayName("Проверка успешного получения true при наличии дубликатов")
    public void shouldBetrueTest() {
        int[] arrayWithNonUniqueValues = new int[]{1, 2, 3, 3, 4};
        assertTrue(hasDuplicates(arrayWithNonUniqueValues));

    }

}
