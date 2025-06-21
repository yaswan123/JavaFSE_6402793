package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class PdfDocumentconcrete implements PdfDocument {
    @Override
    public void createDocument() {
        System.out.println("PDF Document Created.");
    }
}
