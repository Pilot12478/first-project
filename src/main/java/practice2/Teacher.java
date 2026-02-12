package practice2;

public class Teacher {
    /*
    Создайте класс Teacher с полями name и subject. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
     выводящий информацию о учителе и предмете. В main измените предмет и выведите обновлённую информацию.
     */

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Учитель: " + name);
        System.out.println("Предмет: " + subject);
    }

    static void main() {
        Teacher teacher = new Teacher("Иванова А.А.", "География");
        teacher.setSubject("Философия");
        teacher.printInfo();
    }
}
