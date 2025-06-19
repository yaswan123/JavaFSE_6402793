package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class ExcelDocumentconcrete implements ExcelDocument {
    @Override
    public void createDocument() {
        System.out.println("Excel Document Created.");
    }
}
