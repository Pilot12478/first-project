package practiceProgrammingPrinciples.ISP;

public class Programmer implements Worker{
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}
