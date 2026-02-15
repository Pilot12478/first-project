package practice3;

public class Company {
    /*
    Класс Company
Создайте класс Company с полями:
static String companyName — общее название для всех сотрудников
final int employeeID — уникальный идентификатор (нельзя менять)
String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName,
статический метод printCompanyName(), геттеры и сеттеры для employeeName.
В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
Попробуйте изменить employeeID — должно быть невозможно.
     */
    static String companyName = "Рога и копыта";
    final int employeeID;
    String employeeName;

    Company(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void printInfo() {
        System.out.println("Id сотрудника: " + this.employeeID + "\n" +
                "Имя сотрудника: " + this.employeeName + "\n" +
                "Название компании: " + companyName + "\n");
    }

    static void main() {
        Company company1 = new Company("Иванов Иван Иванович", 1);
        Company company2 = new Company("Петров Петр Петрович", 2);
        Company.companyName = "Иванов и Петров inc";
        company1.printInfo();
        company2.printInfo();

    }

}
