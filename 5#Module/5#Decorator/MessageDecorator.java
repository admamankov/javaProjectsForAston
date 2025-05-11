package fifthModuleFifthTask;

public class MessageDecorator implements Message {
    private Message decoratedMessage;

    public MessageDecorator(Message decoratedMessage){
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public String getContent() {
        return decoratedMessage.getContent();
    }
}
