// This class will decide which type of Document to create
public class DocumentFactory {

    
    public static Document createDocument(String type) {
        // If the type is a "word",then return a WordDocument
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }
        // If the doc type is "pdf",  then return a PdfDocument
        else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        }
        // If the doc type is "excel",then return an ExcelDocument
        else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }
        // if the above matches not match, then it returns null
        else {
            return null;
        }
    }
}
