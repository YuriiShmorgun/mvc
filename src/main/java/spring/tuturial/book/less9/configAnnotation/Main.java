package spring.tuturial.book.less9.configAnnotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring.tuturial.book.less9.config.InjectSimpleSpel;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/9/app-context-SpEL.xml");
        ctx. refresh ();

        spring.tuturial.book.less9.config.InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(injectSimpleSpel.toString());
    }
}
