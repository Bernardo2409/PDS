package Chain_of_Responsibility;

/**
 * FileHandler interface for the Chain of Responsibility pattern
 * Defines methods for handling file processing requests
 */
public interface FileHandler {

    // Set the next handler in the chain
    void setNext(FileHandler next);

    // Handle the specific file type or pass it on
    void handleFile(String filePath);
}
