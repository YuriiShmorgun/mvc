package spring.tuturial.book.less9.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/9/app-context-annotation.xml");
        //ctx.load("META-INF/spring/8/app-context.xml");
        ctx. refresh ();

        InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple123");
        System.out.println(injectSimple.toString());

    }
}
