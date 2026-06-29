package complexTask5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InventoryService {
    Map<String, List<Product>> map = new ConcurrentHashMap<>();
    private boolean isInventoryOpen;

    public void setInventoryOpen(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    public boolean getIsInventoryOpen() {
        return isInventoryOpen;
    }

    public void addProduct(String category, Product product) {
        if (category == null || category.isEmpty() || product == null) {
            throw new IllegalArgumentException("Переданы некорректные значения");
        }
        if (isInventoryOpen) {
            List<Product> products = map.get(category);
            if (products == null) {
                products = new ArrayList<>();
                map.put(category, products);
            }
            products.add(product);
        } else throw new IllegalArgumentException("Склад закрыт");

    }


    public Product getProductByCategory(String category) {
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Переданы некорректные значения");
        }
        if (map.get(category) == null) {
            throw new OutOfStockException("в указанной категории нет товаров");
        }
        return map.get(category).removeFirst();
    }

    public Map<String, List<Product>> getProductsByPrice(double price) {
        return map.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().stream().filter(product -> product.getPrice() <= price).toList()
        ));
    }
    public Map<String, List<Product>> getMap(){
        return Map.copyOf(map);
    }
}
