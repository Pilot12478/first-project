package practiceProgrammingPrinciples;

public class MathOperations {

    //Исходный код:
    public int add(int a, int b) {
        return a + b;
    }

    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public int addFourNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //С применением принципа DRY

    public static int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    static void main() {
        System.out.println(add(1,3,5));
        //результат 9
        System.out.println(add(1,3,5,7));
        //результат 16
    }
}
