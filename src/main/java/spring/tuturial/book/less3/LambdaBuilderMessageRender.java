package spring.tuturial.book.less3;

public interface LambdaBuilderMessageRender {
    void render();
    LambdaBuilderMessageRender setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
