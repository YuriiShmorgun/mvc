package spring.tuturial.book.less10.consrtuctor.xml;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
