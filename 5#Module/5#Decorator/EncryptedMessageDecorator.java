package fifthModuleFifthTask;

import java.util.Base64;

public class EncryptedMessageDecorator extends MessageDecorator {
    public EncryptedMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        String original = super.getContent();
        return encrypt(original);
    }

    private String encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
