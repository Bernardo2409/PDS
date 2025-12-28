package Template_Method;

public class CSVDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Opening CSV file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Reading rows and columns from CSV...");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing CSV file");
    }
}
