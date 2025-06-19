package WEEK1_DesignPrinciplesAndPatterns.S2_FactoryMethodPatternExample.Codes;
public class Test {
    public static void main(String[] args) {
        DocumentFactory wordFactory = Factory.getFactory("word");
        wordFactory.createDocument();
        DocumentFactory pdfFactory = Factory.getFactory("pdf");
        pdfFactory.createDocument();
        DocumentFactory excelFactory = Factory.getFactory("excel");
        excelFactory.createDocument();
    }
}
