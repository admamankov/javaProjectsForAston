package fifthModuleSecondTask;

public class BillingSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if ("billing".equalsIgnoreCase(requestType)) {
            System.out.println("Billing support is handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
