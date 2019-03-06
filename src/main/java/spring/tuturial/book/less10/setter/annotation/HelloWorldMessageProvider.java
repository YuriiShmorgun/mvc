package spring.tuturial.book.less10.setter.annotation;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
