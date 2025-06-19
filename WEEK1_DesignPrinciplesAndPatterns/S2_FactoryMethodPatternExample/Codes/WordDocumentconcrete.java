package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class WordDocumentconcrete implements WordDocument {
    @Override
    public void createDocument() {
        System.out.println("Word Document Created.");
    }
}
