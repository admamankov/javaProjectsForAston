package fifthModuleSecondTask;

public class TechnicalSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if ("technical".equalsIgnoreCase(requestType)) {
            System.out.println("Technical support is handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
