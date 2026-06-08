package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {

    /*
    Напишите тесты для метода, который считает количество слов в строке:
     */
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("Hello world", 2, "Обычная строка"),
                Arguments.of(" Java is awesome ", 3, "Строка с лишними пробелами"),
                Arguments.of("", 0, "Пустая строка"),
                Arguments.of("  ", 0, "Строка с пробелами")
        );
    }

    @ParameterizedTest(name = "{2}:{0}, количество слов = {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного подсчета слов в строке")
    public void countWordsSuccessTest(String str, int exp, String message) {
        assertEquals(exp, countWords(str));

    }

    @Test
    public void nullTest() {
        assertThrows(IllegalArgumentException.class, () -> countWords(null));
    }
    /*
    org.opentest4j.AssertionFailedError: Unexpected exception type thrown,
Expected :class java.lang.IllegalArgumentException
Actual   :class java.lang.NullPointerException
     */
}
