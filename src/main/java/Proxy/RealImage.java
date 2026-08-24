package Proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Загружаем при создании
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename + " (This is expensive!)");
        // Эмуляция долгой загрузки
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
