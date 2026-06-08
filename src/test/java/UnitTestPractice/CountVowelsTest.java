package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest {
//Напишите тесты для метода, который считает количество гласных букв в строке
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
    @ParameterizedTest
    @DisplayName("Проверка успешного подсчетва глассных букв в строке")
    @CsvSource({
            "hello,2",
            "AEIOU,5",
            "bcdfg,0",
            "'',0"



    })
    public void countVowelsSuccessTest(String str,int expRes){
        assertEquals(expRes,countVowels(str));

    }
    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest(){
     Exception exception = assertThrows(IllegalArgumentException.class,()->countVowels(null));
     assertEquals("Input cannot be null",exception.getMessage());
    }

}
