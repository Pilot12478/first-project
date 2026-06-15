import complexTask2.InvalidUserException;
import complexTask2.User;
import complexTask2.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    UserValidator userValidator;
    @BeforeEach
    public void setUp(){
        userValidator = new UserValidator();
    }

    public static Stream<Arguments>testDataForValidationSuccessTest(){
        return Stream.of(
                Arguments.of( new User("Вася",23,"test@mail.ru")),
                Arguments.of( new User("Вася",18,"test@mail.ru")),
                Arguments.of( new User("Вася",100,"test@mail.ru")),
                Arguments.of( new User("Вася",100,"test@example.com"))
        );
    }
    public static Stream<Arguments>testDataForValidationFailedNameTest(){
        return Stream.of(
                Arguments.of( new User("вася",23,"test@mail.ru")),
                Arguments.of( new User("",18,"test@mail.ru")),
                Arguments.of( new User(null,100,"test@mail.ru"))
        );
    }
    public static Stream<Arguments>testDataForValidationFailedAgeTest(){
        return Stream.of(
                Arguments.of( new User("Вася",17,"test@mail.ru")),
                Arguments.of( new User("Вася",101,"test@mail.ru"))
        );
    }
    public static Stream<Arguments>testDataForValidationFailedEmailTest(){
        return Stream.of(
                Arguments.of( new User("Вася",19,"user@example")),
                Arguments.of( new User("Вася",100,"user@.com")),
                Arguments.of( new User("Вася",100,"@example.com")),
                Arguments.of( new User("Вася",100,"user@example.")),
                Arguments.of( new User("Вася",100,"user@example..com"))
        );
    }
    public static Stream<Arguments>testDataForIgnoringValidationTest(){
        return Stream.of(
                Arguments.of( new User("вася",19,"test@mail.ru")),
                Arguments.of( new User("Вася",101,"test@mail.ru")),
                Arguments.of( new User("Вася",100,"testmail.ru"))
        );
    }

    @ParameterizedTest
    @DisplayName("Проверка успешного прохождения валидации с различными тестовыми данными")
    @MethodSource("testDataForValidationSuccessTest")
    public void validationSuccessTest(User user){
        assertDoesNotThrow(()->userValidator.validateUserProperties(user));
    }

    @ParameterizedTest
    @DisplayName("Проверка ошибки валидации при некорректном имени")
    @MethodSource("testDataForValidationFailedNameTest")
    public void validationFailedNameTest(User user){
        Exception exception =assertThrows(InvalidUserException.class,()->userValidator.validateUserProperties(user));
        assertEquals("Имя пользователя некорретно",exception.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Проверка ошибки валидации при некорректном возрасте")
    @MethodSource("testDataForValidationFailedAgeTest")
    public void validationFailedAgeTest(User user){
        Exception exception =assertThrows(InvalidUserException.class,()->userValidator.validateUserProperties(user));
        assertEquals("Возраст пользователя некорректный",exception.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Проверка ошибки валидации при некорректном email")
    @MethodSource("testDataForValidationFailedEmailTest")
    public void validationFailedEmailTest(User user){
        Exception exception =assertThrows(InvalidUserException.class,()->userValidator.validateUserProperties(user));
        assertEquals("Email пользователя некорректный",exception.getMessage());
    }

    @ParameterizedTest
    @MethodSource("testDataForIgnoringValidationTest")
    @DisplayName("Проверка игнорирования валидации при validationEnabled =false")
    public void checkIgnoringValidationTest(User user){
        userValidator.setValidationEnabled(false);
        assertDoesNotThrow(()->userValidator.validateUserProperties(user));
    }
}
