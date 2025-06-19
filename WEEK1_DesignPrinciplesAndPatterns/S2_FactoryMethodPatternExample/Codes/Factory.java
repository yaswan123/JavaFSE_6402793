package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class Factory {
    public static DocumentFactory getFactory(String type) {
        if (type.equals("word")) 
        {
            return new WordDocumentFactory();
        } 
        else if (type.equals("pdf")) 
        {
            return new PdfDocumentFactory();
        } 
        else if (type.equals("excel")) 
        {
            return new ExcelDocumentFactory();
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid document type: ");
        }
    }
}
