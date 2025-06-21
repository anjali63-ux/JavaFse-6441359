//  main class is mandatory that runs the program
public class Main {

    public static void main(String[] args) {
        // Ask the factory to create a Word document
        Document doc1 = DocumentFactory.createDocument("word");
        doc1.meth1();  // Output: Opening Word Document...

        // Ask the factory to create a PDF document
        Document doc2 = DocumentFactory.createDocument("pdf");
        doc2.meth1();  // Output: Opening PDF Document...

        // Ask the factory to create an Excel document
        Document doc3 = DocumentFactory.createDocument("excel");
        doc3.meth1();  // Output: Opening Excel Document...
    }
}
