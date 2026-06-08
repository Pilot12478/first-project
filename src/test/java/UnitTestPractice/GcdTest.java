package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    @ParameterizedTest(name = "{3}:{0},{1}, Наибольший общий делитель равен {2}")
    @CsvSource({
            "24,36,12,Обычные числа",
            "101,103,1,Простые числа",
            "10,0,10,Нулевое значение"
    })
    @DisplayName("Проверка успешного нахождения наибольшего общего делителя")
    public void gcdSuccessTest(int a,int b,int expNum,String message){
        assertEquals(expNum,gcd(a,b));

    }
}
