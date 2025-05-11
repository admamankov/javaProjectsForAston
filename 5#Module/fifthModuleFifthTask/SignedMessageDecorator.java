package fifthModuleFifthTask;

public class SignedMessageDecorator extends MessageDecorator{
    public SignedMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        String original = super.getContent();
        return original + "\n\nBest regards,\n@userBuzer1";
    }
}
