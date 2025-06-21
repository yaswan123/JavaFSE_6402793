package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        PdfDocument doc = new PdfDocumentconcrete();
        doc.createDocument();
    }
}
