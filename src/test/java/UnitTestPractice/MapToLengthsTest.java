package UnitTestPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToLengthsTest {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of("Java", "C++", "Go"), List.of(4,3,2)),
                Arguments.of(List.of(), List.of())

        );
    }

    @ParameterizedTest(name = "На вход:{0}->на выход {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешного преобразование списка строк в список их длин")
    public void mapToLengthsSuccessTest(List<String> words, List<Integer> expList) {
        Assertions.assertIterableEquals(expList, mapToLengths(words));

    }
}
