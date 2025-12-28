package Template_Method;

/**
 * Template Method Pattern Example - Data Mining
 * 
 * The Template Method pattern defines the skeleton of an algorithm in a method,
 * deferring some steps to subclasses. It lets subclasses redefine certain steps
 * without changing the algorithm's structure.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Template Method Pattern Demo - Data Mining");
        System.out.println("=".repeat(50));

        System.out.println("\n--- Mining PDF File ---");
        DataMiner pdfMiner = new PDFDataMiner();
        pdfMiner.mine("report.pdf");

        System.out.println("\n--- Mining CSV File ---");
        DataMiner csvMiner = new CSVDataMiner();
        csvMiner.mine("data.csv");

        System.out.println("\n--- Mining Word Document ---");
        DataMiner wordMiner = new WordDataMiner();
        wordMiner.mine("document.docx");
    }
}
