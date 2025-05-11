package fifthModuleFirstTask;

public class Qiwi implements PaymentStrategy {
    private String phoneNumber;

    public Qiwi(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Qiwi account: " + phoneNumber);
    }
}
