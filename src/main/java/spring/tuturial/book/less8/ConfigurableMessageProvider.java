package spring.tuturial.book.less8;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Qualifier("messageProviderConf")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;


    @Override
    public String getMessage() {
        return message;
    }

/*    @Autowired
    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        this.message = message;
    }*/

    @Autowired
    public ConfigurableMessageProvider(String springBeanMessage) { //from bean annotations
        this.message = springBeanMessage;
    }
}
