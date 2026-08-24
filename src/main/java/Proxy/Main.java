package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Creating proxies (NO loading yet) ===");

        // Создаем прокси для трех изображений (изображения НЕ загружаются!)
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");
        Image image3 = new ProxyImage("photo3.jpg");

        System.out.println("\n=== Now displaying image1 ===");
        image1.display(); // Здесь происходит загрузка

        System.out.println("\n=== Now displaying image2 ===");
        image2.display(); // Здесь происходит загрузка

        System.out.println("\n=== Now displaying image1 AGAIN ===");
        image1.display(); // Изображение уже загружено, загрузки не будет!

        System.out.println("\n=== Now displaying image3 ===");
        image3.display(); // Здесь происходит загрузка

        System.out.println("\n=== Done! ===");
    }
}
