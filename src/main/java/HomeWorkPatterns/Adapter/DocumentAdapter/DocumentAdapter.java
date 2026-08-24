package HomeWorkPatterns.Adapter.DocumentAdapter;

public class DocumentAdapter implements DocumentProcessor {
    private final DOCProcessor docProcessor;
    public DocumentAdapter(){
         docProcessor = new DOCProcessor();
    }


    @Override
    public void process(String doc) {
        convert(doc);
        docProcessor.process(doc);
    }

    public void convert(String filePdf){
        System.out.println("Какая-то логика конвертации pdf в doc");
    }

    static void main() {
        String filePdf = "file.pdf";
        DocumentAdapter documentAdapter = new DocumentAdapter();
        documentAdapter.process(filePdf);
    }
}
