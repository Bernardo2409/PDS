package Chain_of_Responsibility;

public class AppChainOfResponsability {

    public static void main(String[] args) {

        // Create handlers and set up the chain (optional for a fixed order)
        FileHandler csvHandler = new CSVFileHandler();
        FileHandler txtHandler = new TXTFileHandler();
        FileHandler jsonHandler = new JSONFileHandler();

        csvHandler.setNext(txtHandler);
        txtHandler.setNext(jsonHandler);

        // Handle different file paths
        String filePath1 = "data.csv";
        String filePath2 = "report.txt";
        String filePath3 = "config.json";
        String filePath4 = "unknown.doc";

        csvHandler.handleFile(filePath1);
        csvHandler.handleFile(filePath2);
        csvHandler.handleFile(filePath3);
        csvHandler.handleFile(filePath4);
    }
}
