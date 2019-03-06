package spring.tuturial.book.less10.setter.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRender@")
public class StandartOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null){
            throw new NullPointerException("MessageProvider is empty");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Autowired
    //@Resource(name = "messageProvider@")
    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
