package practiceProgrammingPrinciples;

public class MathOperations {



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
