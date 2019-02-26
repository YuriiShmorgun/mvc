package spring.tuturial.book.less3;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        StandartMessageRender messageRender = new StandartMessageRender();
        MessageProvider messageProvider = new HelloWorldMessageProvider();


        messageRender.setMessageProvider(messageProvider);
        messageRender.render();


        StandartMessageRender messageRender1 = new StandartMessageRender();
        messageRender1.setMessageProvider(()-> "super lambda");
        messageRender1.render();


        StandartLambdaBuilderMessageRender messageRender2 = new StandartLambdaBuilderMessageRender();
        messageRender2
                .setMessageProvider(()-> "super lambda 2")
                .render();
    }
}
