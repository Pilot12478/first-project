package UnitTestPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByLengthTest {
    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),
                Arguments.of(List.of(), List.of())

        );
    }

    @ParameterizedTest(name = "На вход:{0}->на выход {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешной фильтрации четных чисел")
    public void filterEvenNumbersSuccessTest(List<String> words, List<String> expWordList) {
        Assertions.assertIterableEquals(expWordList, sortByLength(words));

    }
}
