package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        ExcelDocument doc = new ExcelDocumentconcrete();
        doc.createDocument();
    }
}
