package practice3;

public class University {
    /*
    Создайте класс University с полями:
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName Реализуйте конструктор для studentID и studentName,
 статический метод changeUniversityName(String newName), геттер для studentName,
  метод printStudentInfo() — выводит имя, ID и университет. \
  В main: создайте 3 студента, измените название университета и выведите данные.
     */
    static String universityName = "Гарвард";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + this.studentID + ". " +
                "Имя студента: " + this.studentName + ". " +
                "Наименование университета: " + universityName + ". ");
    }

    static void main() {
        University university = new University(1, "Иванов Иван Иванович");
        University university1 = new University(2, "Петров Иван Иванович");
        University university2 = new University(3, "Сидоров Иван Иванович");
        University.changeUniversityName("Кембридж");
        university1.printStudentInfo();
        university.printStudentInfo();
        university2.printStudentInfo();
    }
}
