package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class ExcelDocumentconcrete implements ExcelDocument {
    @Override
    public void createDocument() {
        System.out.println("Excel Document Created.");
    }
}
