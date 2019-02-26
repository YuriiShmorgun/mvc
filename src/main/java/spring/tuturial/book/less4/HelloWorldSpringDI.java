package spring.tuturial.book.less4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRender messageRender = ctx.getBean("render", MessageRender.class);
        messageRender.render();
    }
}
