import complexTask5.InventoryService;
import complexTask5.OutOfStockException;
import complexTask5.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    InventoryService inventoryService;
    Map<String, List<Product>> expMapCategoryFiltered;
    Map<String, List<Product>> expMapPriceFiltered;

    @BeforeEach
    public void setUp() {
        inventoryService = new InventoryService();
        inventoryService.setInventoryOpen(true);
    }

    public void prepareTestData() {
        Product product1 = new Product("cherry", 1.3, "fruits");
        Product product2 = new Product("lemon", 1.2, "fruits");
        Product product3 = new Product("apple", 1.1, "fruits");
        Product product5 = new Product("chicken", 4.1, "meat");
        Product product6 = new Product("iphone", 224.1, "technique");

        inventoryService.addProduct("fruits", product1);
        inventoryService.addProduct("fruits", product2);
        inventoryService.addProduct("fruits", product3);
        inventoryService.addProduct("meat", product5);
        inventoryService.addProduct("technique", product6);

        expMapCategoryFiltered = new ConcurrentHashMap<>();
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        expMapCategoryFiltered.put("fruits",products);

        expMapPriceFiltered= new ConcurrentHashMap<>();
        List<Product> products2 = new ArrayList<>();
        products2.add(product2);
        products2.add(product3);

        List<Product>products3 = new ArrayList<>();
        expMapPriceFiltered.put("fruits",products2);
        expMapPriceFiltered.put("meat",products3);
        expMapPriceFiltered.put("technique",products3);

    }

    public static Stream<Arguments> testDataForAddFailedTest() {
        return Stream.of(
                Arguments.of(null, new Product("cherry", 1.3, "fruits")),
                Arguments.of("", new Product("cherry", 1.3, "fruits")),
                Arguments.of("fruits", null)
        );
    }

    @Test
    @DisplayName("Проверка успешного добавления продукта")
    public void addProductSuccessTest() {
        Product product1 = new Product("cherry", 1.3, "fruits");
        inventoryService.addProduct("fruits", product1);
        List<Product> products = inventoryService.getMap().get("fruits");
        assertEquals(product1, products.getFirst());

    }

    @Test
    @DisplayName("Проверка отсутствия добавления продукта при isInventoryOpen  = false")
    public void addProductFailedTest() {
        inventoryService.setInventoryOpen(false);
        Product product1 = new Product("cherry", 1.3, "fruits");
        inventoryService.addProduct("fruits", product1);
        assertTrue(inventoryService.getMap().isEmpty());
    }

    @ParameterizedTest
    @MethodSource("testDataForAddFailedTest")
    @DisplayName("Проверка ошибки при добавлении продукта")
    public void addProductWithIncorrectTestData(String category, Product product) {
        assertThrows(IllegalArgumentException.class, () -> inventoryService.addProduct(category, product));
    }

    @Test
    @DisplayName("Проверка получения продуктов по категории")
    public void getProductByCategorySuccessTest() {
        prepareTestData();
        assertEquals(expMapCategoryFiltered,inventoryService.getProductByCategory("fruits"));
    }
    @Test
    @DisplayName("Проверка получения продуктов по цене")
    public void getProductByPriceSuccessTest() {
        prepareTestData();
        assertEquals(expMapPriceFiltered,inventoryService.getProductsByPrice(1.2));
    }
    @Test
    @DisplayName("Проверка ошибки при фильтрации по категориям которых нет на складе")
    public void getProductByNotExistCategory(){
        Exception exception = assertThrows(OutOfStockException.class,()->inventoryService.getProductByCategory("pupl"));
        assertEquals("в указанной категории нет товаров",exception.getMessage());
    }

}
