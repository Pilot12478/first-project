package complexTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> gradeList;

    public GradeService() {
        gradeList = new ArrayList<>();
    }

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Передана некорректная оценка");
        }
        gradeList.add(grade);
    }

    public synchronized double avgGrade(String subject) {
        return gradeList.stream().filter(studentGrade -> studentGrade.getSubject().equals(subject)).mapToDouble(studentGrade -> studentGrade.getGrade().doubleValue()).average().orElseThrow();

    }

    public List<StudentGrade<T>> getList() {
        return List.copyOf(gradeList);
    }
}
