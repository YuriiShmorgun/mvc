package spring.tuturial.book.less10.setter.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("META-INF/spring/10/setter/app-context-annotation.xml");
        genericXmlApplicationContext. refresh ();

        MessageRenderer messageRenderer = genericXmlApplicationContext.getBean("messageRender@", MessageRenderer.class);
        messageRenderer.render();

    }
}
