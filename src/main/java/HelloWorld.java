public class HelloWorld {
    static int a = 1;

    static void main() {
        System.out.println("Hello World");
        System.out.println(1 + 2);
        System.out.println(3 * 4);
        System.out.println(a);
        int z = sum(3, 3);
        int b = multiple(3, 6);
        int f = substract(5, 9);
        double k = devide(5, 9);

        System.out.println("Результат сложения: " + z);
        System.out.println("Результат деления: " + k);
        System.out.println("Результат вычитания: " + f);
        System.out.println("Результат умножения: " + b);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiple(int x, int y) {
        return x * y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static double devide(int x, int y) {
        return (double) x / y;

    }
    /*
      что интересно: поскольку переменные созданные внутри метода существуют только во время
    выполнения этого метода, то можно их же использовать дальше x  и y при выполнении метода они просто
    затрутся и вновь создадутся уже в другом методе
    Ctrl + Alt + L — для форматирования кода в соответствии с текущим стилем (Code Style)
     */

}
