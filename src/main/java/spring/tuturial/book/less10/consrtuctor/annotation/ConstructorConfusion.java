package spring.tuturial.book.less10.consrtuctor.annotation;

import spring.tuturial.book.less10.consrtuctor.xml.MessageProvider;

public class ConstructorConfusion implements MessageProvider {

    private String someValue;


    @Override
    public String getMessage() {
        return null;
    }

    public ConstructorConfusion(String someValue) {
        this.someValue = someValue;
    }
    public ConstructorConfusion(Integer someValue) {
        this.someValue = someValue.toString();
    }


}
