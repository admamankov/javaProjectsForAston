package fifthModuleFourthTask;

public class ProxyFileDownloader implements FileDownloader {
    private RealFileDownloader realDownloader;
    private String userRole;

    public ProxyFileDownloader(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void downloadFile(String fileName) {
        if (hasAccess()) {
            if (realDownloader == null) {
                realDownloader = new RealFileDownloader();
            }
            realDownloader.downloadFile(fileName);
        } else {
            System.out.println("Access denied to download files.");
        }
    }

    private boolean hasAccess() {
        return "admin".equalsIgnoreCase(userRole);
    }
}
