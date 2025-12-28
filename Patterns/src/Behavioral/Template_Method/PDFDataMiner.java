package Template_Method;

public class PDFDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Opening PDF file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting text from PDF pages...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing PDF file");
    }
}
