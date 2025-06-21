package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        WordDocument doc = new WordDocumentconcrete();
        doc.createDocument();
    }
}
