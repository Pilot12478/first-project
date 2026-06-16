import complexTask3.GradeService;
import complexTask3.InvalidGradeException;
import complexTask3.StudentGrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    GradeService<Integer> gradeService;

    @BeforeEach
    public void setUp() {
        gradeService = new GradeService<>();
    }

    public void testDataForAvgCheck() {
        StudentGrade<Integer> studentGrade1 = new StudentGrade<>("Вася", "Физика", 5);
        StudentGrade<Integer> studentGrade2 = new StudentGrade<>("Петя", "Физика", 4);
        StudentGrade<Integer> studentGrade3 = new StudentGrade<>("Катя", "Физика", 3);
        StudentGrade<Integer> studentGrade4 = new StudentGrade<>("Таня", "Физика", 2);
        StudentGrade<Integer> studentGrade5 = new StudentGrade<>("Леня", "Физика", 4);
        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);
        gradeService.addGrade(studentGrade4);
        gradeService.addGrade(studentGrade5);
    }
    public static Stream<Arguments>testDataForSubjectNotInListAvgTest(){
        return Stream.of(
                Arguments.of(""),
                Arguments.of("Химия"),
                Arguments.of((Object) null)
        );
    }

    @Test
    @DisplayName("Проверка успешного добавления оценки")
    public void addGradeSuccessTest() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Вася", "Физика", 5);
        gradeService.addGrade(studentGrade);
        int expSizeList = 1;
        assertAll(
                () -> assertEquals(expSizeList, gradeService.getList().size()),
                () -> assertEquals(studentGrade, gradeService.getList().getFirst())
        );

    }

    @Test
    @DisplayName("Проверка ошибки при добавлении некорректной оценки")
    public void addGradeFailedTest() {
        StudentGrade<Integer> studentGrade = new StudentGrade<>("Вася", "Физика", -5);
        Exception exception = assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(studentGrade));
        assertEquals("Передана некорректная оценка", exception.getMessage());
    }
    @Test
    @DisplayName("Проверка успешного рассчета средней оценки по конкретному предмету")
    public void avgSuccessTest(){
        testDataForAvgCheck();
        double expAvgResult =3.6;
        assertEquals(expAvgResult,gradeService.avgGrade("Физика"));
    }
    @ParameterizedTest
    @MethodSource("testDataForSubjectNotInListAvgTest")
    @DisplayName("Проверка получения получения ошибки если предмет отсутствует в списке")
    public void subjectNotInListAvgTest(String subject){
        testDataForAvgCheck();
        assertThrows(NoSuchElementException.class,()->gradeService.avgGrade(subject));
    }

}
