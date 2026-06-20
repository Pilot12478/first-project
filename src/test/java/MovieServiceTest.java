import complexTask4.Movie;
import complexTask4.MovieService;
import complexTask4.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static complexTask4.MovieService.MAX_VALUE;
import static complexTask4.MovieService.MIN_VALUE;
import static complexTask4.UnitTestHelpersMethods.avg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    MovieService movieService;
    Map<Movie, Double> expectedAvgMap;
    Movie greenMile;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService();
    }

    public void prepareTestData() {
        greenMile = new Movie("Green Mile", "good movie");
        Movie forrestGump = new Movie("Forrest Gump", "good movie");
        Movie loveAndPigeons = new Movie("Love and Pigeons", "good movie");

        Rating<Double> userGrade1 = new Rating<>(9.5);
        Rating<Double> userGrade2 = new Rating<>(4.5);
        Rating<Double> userGrade3 = new Rating<>(6.5);

        Rating<Double> userGrade4 = new Rating<>(8.3);
        Rating<Double> userGrade5 = new Rating<>(3.2);
        Rating<Double> userGrade6 = new Rating<>(9.8);

        movieService.addGrade(greenMile, userGrade1);
        movieService.addGrade(greenMile, userGrade2);
        movieService.addGrade(greenMile, userGrade5);

        movieService.addGrade(forrestGump, userGrade6);
        movieService.addGrade(forrestGump, userGrade3);
        movieService.addGrade(forrestGump, userGrade1);

        movieService.addGrade(loveAndPigeons, userGrade4);
        movieService.addGrade(loveAndPigeons, userGrade3);
        movieService.addGrade(loveAndPigeons, userGrade6);

        expectedAvgMap = new LinkedHashMap<>();
        expectedAvgMap.put(greenMile, avg(userGrade1.getGrade(), userGrade2.getGrade(), userGrade5.getGrade()));
        expectedAvgMap.put(loveAndPigeons, avg(userGrade4.getGrade(), userGrade3.getGrade(), userGrade6.getGrade()));
        expectedAvgMap.put(forrestGump, avg(userGrade6.getGrade(), userGrade3.getGrade(), userGrade1.getGrade()));
    }

    public static Stream<Arguments> testDataForAddFailedTest() {
        return Stream.of(
                Arguments.of(new Rating<>(11.0), "оценка больше 10.0"),
                Arguments.of(new Rating<>(0.0), "оценка меньше 1.0")
        );
    }

    @Test
    @DisplayName("Проверка успешного добавления оценок, расчета среднего значения рейтинга для каждого фильма и сортировки")
    public void addAvgSortingTest() {
        prepareTestData();
        assertEquals(expectedAvgMap, movieService.sorting(movieService.getAvgGradeByAllMovies()));
    }

    @ParameterizedTest(name = "{0}:{1}")
    @DisplayName("Проверка ошибки при добавлении рейтинга не в диапозоне от 1.0 до 10.0")
    @MethodSource("testDataForAddFailedTest")
    public void addFailedTest(Rating<Double> userGrade, String message) {
        prepareTestData();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> movieService.addGrade(greenMile, userGrade));
        assertEquals("Rating must be between " + MIN_VALUE + " AND " + MAX_VALUE, exception.getMessage());
    }

    @Test
    @DisplayName("Проверка метода добавления на Null")
    public void nullTest() {
        assertThrows(IllegalArgumentException.class, () -> movieService.addGrade(null, null));
    }


}
