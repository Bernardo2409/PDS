package Chain_of_Responsibility;

public class TXTFileHandler implements FileHandler {

    private FileHandler next;

    @Override
    public void setNext(FileHandler next) {
        this.next = next;
    }

    @Override
    public void handleFile(String filePath) {
        if (filePath.endsWith(".txt")) {
            System.out.println("Handling TXT file: " + filePath);
        } else if (next != null) {
            next.handleFile(filePath);
        } else {
            System.out.println("File not supported: " + filePath);
        }
    }
}
