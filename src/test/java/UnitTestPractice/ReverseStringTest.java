package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    //Напишите тесты для метода, который переворачивает строку
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("12345", "54321"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest(name = "{0}->{1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного разворота строки с различными тестовыми данными")
    public void reversStringSuccessTest(String str, String expStr) {
        assertEquals(expStr, reverse(str));
    }

}
