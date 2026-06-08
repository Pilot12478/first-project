package UnitTestPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SplitStringTest {
    public String[] splitString(String input, String delimiter) {
        return input.split(delimiter);
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"})

        );
    }

    @ParameterizedTest(name = "На вход передана строка:{0}, на выход получен {2}")
    @DisplayName("Проверка успешного разбиения строки по разделителю")
    @MethodSource("testData")
    public void splitStringSuccessTest(String str, String del, String[] array) {
        Assertions.assertArrayEquals(array, splitString(str, del));
    }
}
