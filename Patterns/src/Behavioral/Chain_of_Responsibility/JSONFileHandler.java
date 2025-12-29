package Chain_of_Responsibility;

public class JSONFileHandler implements FileHandler {

    private FileHandler next;

    @Override
    public void setNext(FileHandler next) {
        this.next = next;
    }

    @Override
    public void handleFile(String filePath) {
        if (filePath.endsWith(".json")) {
            System.out.println("Handling JSON file: " + filePath);
        } else if (next != null) {
            next.handleFile(filePath);
        } else {
            System.out.println("File not supported: " + filePath);
        }
    }
}
