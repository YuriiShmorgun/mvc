package spring.tuturial.book.less10.consrtuctor.xml;

public class ResiverMessageProvider implements MessageProvider {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public ResiverMessageProvider(String message){
        this.message = message;
    }
}
