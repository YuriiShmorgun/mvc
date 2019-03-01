package spring.tuturial.book.less8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException("Ha ha");
        }
        System.out.println(messageProvider.getMessage());

    }

    //@Resource(name="provider") //for xml
    //@Resource(name="messageProvider") //for @
    @Autowired
    //@Qualifier("redBean")
    //@Qualifier("messageProviderConf")
    @Qualifier("QConstructorConfusion")
    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }


}
