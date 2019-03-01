package spring.tuturial.book.less3;

public class StandartLambdaBuilderMessageRender {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null){
            throw new NullPointerException();
        }
        System.out.println(messageProvider.getMessage());
    }


    public StandartLambdaBuilderMessageRender setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
        return this;
    }


    public static StandartLambdaBuilderMessageRender getInstance (){
        return new StandartLambdaBuilderMessageRender();
    }


    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }


}
