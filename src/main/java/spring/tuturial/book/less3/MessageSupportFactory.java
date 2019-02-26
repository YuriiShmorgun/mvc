package spring.tuturial.book.less3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageRender render;
    private MessageProvider provider;

    private MessageSupportFactory(){
        properties = new Properties();

        try{
            properties.load(new FileInputStream("C:\\Users\\dev\\IdeaProjects\\mvc\\src\\main\\resources\\msf.properties"));

            String renderClass = properties.getProperty("render.class");
            String providerClass = properties.getProperty("provider.class");

            System.out.println("____________________________");
            System.out.println(properties.getProperty("provider.class"));

            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRender getRender() {
        return render;
    }

    public MessageProvider getProvider() {
        return provider;
    }
}
