package complexTask4;

public class Rating<T extends Number> {
    private T grade;
    public Rating(T grade){
        this.grade = grade;
    }

    public T getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "grade=" + grade +
                '}';
    }
}
