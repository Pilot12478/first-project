package Proxy;

public class ProxyImage  implements Image{
    private String filename;
    private RealImage realImage;
    public ProxyImage(String filename){
        this.filename =filename;
    }

    public void display() {
        // Ленивая загрузка: загружаем изображение ТОЛЬКО когда вызывают display()
        if (realImage == null) {
            System.out.println("Proxy: Loading image on demand...");
            realImage = new RealImage(filename);
        }

        // Передаем вызов реальному объекту
        realImage.display();
    }
}
