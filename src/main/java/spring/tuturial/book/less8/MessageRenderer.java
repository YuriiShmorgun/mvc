package spring.tuturial.book.less8;

public interface MessageRenderer {

    void render ();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
