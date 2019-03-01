package spring.tuturial.book.less8;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/8/app-context-annotation.xml");
        //ctx.load("META-INF/spring/8/app-context.xml");
        ctx. refresh ();
       // MessageProvider messageProvider = ctx.getBean ( "messageProvider123", MessageProvider.class);
        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);

        messageRenderer.render();
        //System.out.println(messageProvider.getMessage());


    }
}
