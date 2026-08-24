package Iterator;

public class Main {

    static void main() {
        String[] skills = {"Git","Java","Spring"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Alyosha",skills);

        System.out.println(javaDeveloper.getName());

        Iterator skillIterator = javaDeveloper.getIterator();

        while (skillIterator.hasNext()){
            System.out.println(skillIterator.next());
        }
    }
}
