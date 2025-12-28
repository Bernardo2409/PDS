package Template_Method;

public class WordDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Opening Word document: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting paragraphs and tables from Word doc...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing Word document");
    }

    // Override hook method for custom behavior
    @Override
    protected void sendReport() {
        System.out.println("Sending Word analysis report via Slack...");
    }
}
