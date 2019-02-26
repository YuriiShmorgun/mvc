package spring.tuturial.book.less4;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world from spring";
    }
}
