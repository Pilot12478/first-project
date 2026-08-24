package HomeWorkPatterns.Adapter.DocumentAdapter;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public void process(String doc) {
        System.out.println("Какая то логика по работе с документом типа PDF " + doc);
    }
}
