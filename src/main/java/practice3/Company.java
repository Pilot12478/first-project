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

    public Company(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void printInfo() {
        System.out.println("Id сотрудника: " + this.employeeID + "; " +
                "Имя сотрудника: " + this.employeeName + "; " +
                "Название компании: " + companyName + "; ");
    }

    static void main() {
        Company company1 = new Company("Иванов Иван Иванович", 1);
        Company company2 = new Company("Петров Петр Петрович", 2);
        Company.companyName = "Иванов и Петров inc";
        company1.printInfo();
        company2.printInfo();

    }

}
