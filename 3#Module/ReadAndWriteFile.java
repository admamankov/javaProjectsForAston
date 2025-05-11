package thirdModuleFirstTask;

import java.io.*;

class FileOperationException extends Exception {
    public FileOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ReadAndWriteFile {
    public static void writeToFile(String filePath, String data) throws FileOperationException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            throw new FileOperationException("Error: write to file " + filePath, e);
        }
    }

    public static String readFromFile(String filePath) throws FileOperationException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new FileOperationException("Error: read from file " + filePath, e);
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String filePath = "fileForThirdModule";
        String dataToWrite = "Apple is a fruit, potato is a vegetable.";
        try {
            writeToFile(filePath, dataToWrite);
            readFromFile(filePath);
        } catch (FileOperationException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
