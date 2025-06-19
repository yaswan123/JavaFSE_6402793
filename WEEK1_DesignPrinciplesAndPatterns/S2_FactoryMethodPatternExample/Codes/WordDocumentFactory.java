package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        WordDocument doc = new WordDocumentconcrete();
        doc.createDocument();
    }
}
