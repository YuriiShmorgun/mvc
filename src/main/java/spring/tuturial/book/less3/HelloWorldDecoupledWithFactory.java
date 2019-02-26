package spring.tuturial.book.less3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRender messageRender = MessageSupportFactory.getInstance().getRender();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getProvider();

        messageRender.setMessageProvider(messageProvider);
        messageRender.render();

        //BeanFactory
       // AbstractApplicationContext
    }
}
