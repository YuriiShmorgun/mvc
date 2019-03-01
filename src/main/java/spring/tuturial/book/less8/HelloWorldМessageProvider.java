package spring.tuturial.book.less8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("messageProvider123")
@Qualifier("redBean")
public class HelloWorldМessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello java 8 from @Service('messageProvider123') ";
    }
}
