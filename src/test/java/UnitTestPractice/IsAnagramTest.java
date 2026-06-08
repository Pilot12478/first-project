package UnitTestPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAnagramTest {
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    @Test
    @DisplayName("Проверка получения true при передаче слов анаграм")
    public void sholdBetrueTest() {
        String str1 = "listen";
        String str2 = "silent";
        assertTrue(isAnagram(str1, str2));
    }

    @Test
    @DisplayName("Проверка получения false при передаче слов неанаграм")
    public void sholdBefalseTest() {
        String str1 = "java";
        String str2 = "python";
        assertFalse(isAnagram(str1, str2));
    }

    @Test
    @DisplayName("Проверка на null")
    public void nullTest() {
        String str1 = null;
        String str2 = "python";
        assertFalse(isAnagram(str1, str2));
    }
}
