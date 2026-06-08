package UnitTestPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbersTest {
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8), List.of(2, 4, 6, 8), "Обычный список"),
                Arguments.of(List.of(1, 3, 5, 7), List.of(), "Список без четных чисел"),
                Arguments.of(List.of(), List.of(), "Пустой список")

        );
    }

    @ParameterizedTest(name = "На вход:{2}:{0}->на выход {1}")
    @MethodSource("testData")
    @DisplayName("Проверка успешной фильтрации четных чисел")
    public void filterEvenNumbersSuccessTest(List<Integer> nums, List<Integer> expListOfNum, String message) {
        Assertions.assertIterableEquals(expListOfNum, filterEvenNumbers(nums));

    }

}
