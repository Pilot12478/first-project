package HomeWorkPatterns.Adapter.DocumentAdapter;

public class DocumentAdapter implements DocumentProcessor {
    private final PDFProcessor  pdfProcessor;
    public DocumentAdapter(){
        pdfProcessor = new PDFProcessor();
    }


    @Override
    public void process(String doc) {
        pdfProcessor.processPdf(doc);
    }


    static void main() {
        String filePdf = "file.pdf";
        DocumentAdapter documentAdapter = new DocumentAdapter();
        documentAdapter.process(filePdf);
    }
}
