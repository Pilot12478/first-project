package UnitTestPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJsonTest {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Test
    @DisplayName("Проверка успешного получения true при передаче валидного json")
    public void shouldBeTrueTest() {
        String validJson = "{\"key\":\"value\"}";
        assertTrue(isValidJson(validJson));
    }

    @Test
    @DisplayName("Проверка успешного получения false при передаче невалидного json")
    public void shouldBeFalseTest() {
        String inValidJson = "invalidJson";
        assertFalse(isValidJson(inValidJson));
    }

    @Test
    @DisplayName("Проверка сценария с null")
    public void nullTest() {
        assertFalse(isValidJson(null));
    }
}
