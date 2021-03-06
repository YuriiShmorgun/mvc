package spring.tuturial.book.less10.setter.xml;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("META-INF/spring/10/setter/app-context.xml");
        genericXmlApplicationContext.refresh();

        StandartOutMessageRenderer standartOutMessageRenderer = (StandartOutMessageRenderer) genericXmlApplicationContext.getBean("messageRendererID");
        standartOutMessageRenderer.render();
    }
}
