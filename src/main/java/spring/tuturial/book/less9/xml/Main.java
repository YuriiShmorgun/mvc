package spring.tuturial.book.less9.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("META-INF/spring/9/app-context.xml");
        genericXmlApplicationContext.refresh();

        InjectSimple injectSimple = (InjectSimple) genericXmlApplicationContext.getBean("injectSimple");
        System.out.println(injectSimple.toString());

    }
}
