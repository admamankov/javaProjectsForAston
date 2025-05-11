package fifthModuleFirstTask;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;  // current strategy

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
