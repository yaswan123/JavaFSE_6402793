package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        ExcelDocument doc = new ExcelDocumentconcrete();
        doc.createDocument();
    }
}
