package spring.tuturial.book.less9.config;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring.tuturial.book.less9.annotation.InjectSimple;

public class Main {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
            ctx.load("META-INF/spring/9/app-context-SpEL.xml");
            ctx. refresh ();

        InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
            System.out.println(injectSimpleSpel.toString());
    }
}
