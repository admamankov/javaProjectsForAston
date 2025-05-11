package fifthModuleFifthTask;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Hello, this is a secret message!");

        Message signedMessage = new SignedMessageDecorator(message);

        Message encryptedSignedMessage = new EncryptedMessageDecorator(
                new SignedMessageDecorator(message));

        Message fullFeaturedMessage = new CompressedMessageDecorator(
                new EncryptedMessageDecorator(
                        new SignedMessageDecorator(message)));

        System.out.println("Original message:\n" + message.getContent());
        System.out.println("\nSigned message:\n" + signedMessage.getContent());
        System.out.println("\nEncrypted and signed message:\n" + encryptedSignedMessage.getContent());
        System.out.println("\nFull-featured message:\n" + fullFeaturedMessage.getContent());
    }
}
