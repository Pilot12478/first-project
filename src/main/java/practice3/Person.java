package practice3;

public class Person {
    /*
    Создайте класс Person с полями:
private String firstName
private String lastName
private final String ssn — номер социального страхования Реализуйте конструктор для всех трёх полей,
 геттеры для всех полей, сеттеры только для firstName и lastName, метод printPersonInfo() — выводит:
  "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789". В main: создайте несколько объектов, измените имя у одного и выведите информацию.
     */
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + " " +
                "Фамилия: " + this.lastName + " " +
                "SSN: " + this.ssn + " ");
    }

    static void main() {
        Person person1 = new Person("Василий", "Иванов", "123-45-5789");
        Person person2 = new Person("Николай", "Иванов", "822-45-6889");
        Person person3 = new Person("Василий", "Стародубов", "423-45-3789");
        person1.setFirstName("Петр");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
