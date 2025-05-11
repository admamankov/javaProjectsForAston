package fifthModuleFourthTask;

public class RealFileDownloader implements FileDownloader{
    @Override
    public void downloadFile(String fileName) {
        System.out.println("Downloading file: " + fileName);
    }
}
