package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class PdfDocumentconcrete implements PdfDocument {
    @Override
    public void createDocument() {
        System.out.println("PDF Document Created.");
    }
}
