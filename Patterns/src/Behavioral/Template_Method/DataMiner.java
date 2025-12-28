package Template_Method;

/**
 * Abstract Class defines the template method with the skeleton algorithm.
 */
public abstract class DataMiner {

    // Template method - defines the skeleton of the algorithm
    public final void mine(String path) {
        openFile(path);
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeFile();
    }

    // Steps to be implemented by subclasses
    protected abstract void openFile(String path);

    protected abstract void extractData();

    protected abstract void closeFile();

    // Common steps with default implementation
    protected void parseData() {
        System.out.println("Parsing data into common format...");
    }

    protected void analyzeData() {
        System.out.println("Analyzing data...");
    }

    protected void sendReport() {
        System.out.println("Sending analysis report via email...");
    }
}
