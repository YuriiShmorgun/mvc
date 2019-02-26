package spring.tuturial.book.less3;

public class StandartMessageRender implements MessageRender{

    private MessageProvider messageProvider ;


    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException();
        }
        System.out.println(messageProvider.getMessage());
    }


    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }


    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
